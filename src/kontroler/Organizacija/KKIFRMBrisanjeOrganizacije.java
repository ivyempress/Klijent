/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.Organizacija;

import domen.Organizacija;
import forme.organizacija.FrmBrisanjeOrganizacije;
import forme.organizacija.ModelTabeleOrganizacija;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import komunikacija.Komunikacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 */
public class KKIFRMBrisanjeOrganizacije {
    
    public static void prikaziSveOrganizacije(JTable jtblTabelaOrganizacija){
                try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ORGANIZACIJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Organizacija> listaOrganizacija = (List<Organizacija>) too.getRezultat();
            jtblTabelaOrganizacija.setModel(new ModelTabeleOrganizacija(listaOrganizacija));
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void pronadjiOrganizaciju(JTextField jtfKriterijumPretrage, JScrollPane jScrollPane1 ,JTable jtblTabelaOrganizacija){
                try {
            if (jtfKriterijumPretrage.getText().isEmpty()) {
                JOptionPane.showMessageDialog(jScrollPane1, "Morate uneti kriterijum za pretragu", "Pretraga", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String kriterijum = jtfKriterijumPretrage.getText().trim();
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.PRETRAZI_ORGANIZACIJE);
            toZahtev.setParametar(kriterijum);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Organizacija> listaOrg = (List<Organizacija>) too.getRezultat();
            jtblTabelaOrganizacija.setModel(new ModelTabeleOrganizacija(listaOrg));
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void obrisiOrganizaciju(JTable jtblTabelaOrganizacija){
                int izabraniRed = jtblTabelaOrganizacija.getSelectedRow();
        if (izabraniRed == -1) {
            JOptionPane.showConfirmDialog(jtblTabelaOrganizacija, "Niste obelezili koju organizaciju zelite da obrisete", "Brisanje organizacije", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                ModelTabeleOrganizacija modelTabeleOrganizacija = (ModelTabeleOrganizacija) jtblTabelaOrganizacija.getModel();
                Organizacija o = modelTabeleOrganizacija.vratiOrganizaciju(izabraniRed);
                TransferObjekatZahtev toz = new TransferObjekatZahtev();
                toz.setOperacija(Konstante.OBRISI_ORGANIZACIJU);
                toz.setParametar(o);
                Komunikacija.vratiObjekat().posaljiZahtev(toz);
                TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
                if(too.getOdgovor()!=null){
                JOptionPane.showMessageDialog(jtblTabelaOrganizacija, ""+too.getOdgovor()+" : "+o.getNazivOrganizacije(), "Brisanje organizacije", JOptionPane.INFORMATION_MESSAGE);
                modelTabeleOrganizacija.obrisiOrganizaciju(izabraniRed);
                }
                else {JOptionPane.showMessageDialog(jtblTabelaOrganizacija, "Ne mozete da obrisete organizaciju, jer ona sadrzi aktivne clanove", "Brisanje organizacije", JOptionPane.ERROR_MESSAGE);
               }
            } catch (IOException ex) {
                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
    }
}
