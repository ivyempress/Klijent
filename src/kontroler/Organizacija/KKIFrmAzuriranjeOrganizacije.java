/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.Organizacija;

import com.toedter.calendar.JDateChooser;
import domen.Organizacija;
import forme.organizacija.FrmAzuriranjeOrganizacije;
import forme.organizacija.FrmBrisanjeOrganizacije;
import java.awt.Component;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import komunikacija.Komunikacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 */
public class KKIFrmAzuriranjeOrganizacije {

    public static void popuniComboBox(JComboBox jcbListaOrganizacija) {
        try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ORGANIZACIJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Organizacija> listaOrganizacija = (List<Organizacija>) too.getRezultat();
            jcbListaOrganizacija.setModel(new DefaultComboBoxModel(listaOrganizacija.toArray()));
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void formatirajPolja(Boolean b, JPanel jpUnosOrganizacije, JTextArea jtfOpisDelatnosti) {
        for (Component c : jpUnosOrganizacije.getComponents()) {
            c.setEnabled(b);
        }
        jtfOpisDelatnosti.setEnabled(b);
    }

    public static void popuniPolja(JPanel jpUnosOrganizacije,JTextArea jtfOpisDelatnosti , JTextField jtfOrganizacijaID, JComboBox jcbListaOrganizacija, JTextField jtfNazivOrganizacije, JTextField jtfImeOsnivaca, JDateChooser jdcDatumOsnivanja) {
        KKIFrmAzuriranjeOrganizacije.formatirajPolja(Boolean.TRUE, jpUnosOrganizacije, jtfOpisDelatnosti);
        jtfOrganizacijaID.setEnabled(false);
        Organizacija o = (Organizacija) jcbListaOrganizacija.getSelectedItem();
        jtfOrganizacijaID.setText(String.valueOf(o.getOrganizacijaID()));
        jtfNazivOrganizacije.setText(o.getNazivOrganizacije());
        jtfImeOsnivaca.setText(o.getImeOsnivaca());
        jdcDatumOsnivanja.setDate(o.getDatumOsnivanja());
        jtfOpisDelatnosti.setText(o.getOpisDelatnosti());
    }
    
    public static void azurirajOrganizaciju(JTextField jtfOrganizacijaID,JTextField jtfImeOsnivaca , JTextField jtfNazivOrganizacije,JTextArea jtfOpisDelatnosti ,JDateChooser jdcDatumOsnivanja, JPanel jpUnosOrganizacije   ){
            try {
            Organizacija o = new Organizacija();
            o.setOrganizacijaID(Integer.parseInt(jtfOrganizacijaID.getText()));
            o.setImeOsnivaca(jtfImeOsnivaca.getText());
            o.setNazivOrganizacije(jtfNazivOrganizacije.getText().trim());
            o.setOpisDelatnosti(jtfOpisDelatnosti.getText());
            o.setDatumOsnivanja(jdcDatumOsnivanja.getDate());
            TransferObjekatZahtev toz = new TransferObjekatZahtev();
            toz.setOperacija(Konstante.IZMENI_ORGANIZACIJU);
            toz.setParametar(o);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            JOptionPane.showMessageDialog(jpUnosOrganizacije, "Uspesno ste izmenili organizaciju", "Izmena organizacije", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(""+too.getOdgovor());
        } catch (IOException ex) {
            Logger.getLogger(FrmAzuriranjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmAzuriranjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
