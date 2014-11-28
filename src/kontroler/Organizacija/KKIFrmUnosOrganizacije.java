/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.Organizacija;

import com.toedter.calendar.JDateChooser;
import domen.Organizacija;
import forme.organizacija.FrmUnosOrganizacije;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class KKIFrmUnosOrganizacije {

    public static void sacuvaOrganizaciju(JDateChooser jdcDatumOsnivanja,JTextField jtfNazivOrganizacije,JTextField jtfImeOsnivaca, JTextArea jtaOpisDelatnosti,JScrollPane  jScrollPane2) {

        try {
            //postavljanje ID organizacije
            Date datumOsnivanja = jdcDatumOsnivanja.getDate();
            if (jtfNazivOrganizacije.getText().isEmpty() || jtfImeOsnivaca.getText().isEmpty() || jtaOpisDelatnosti.getText().isEmpty() || datumOsnivanja == null) {
                JOptionPane.showMessageDialog(jScrollPane2, "Niste uneli sva polja na formi ", "Cuvanje organizacije", JOptionPane.WARNING_MESSAGE);
                return;
            }
            TransferObjekatZahtev toz = new TransferObjekatZahtev();
            toz.setOperacija(Konstante.VRATI_ID_ORGANIZACIJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            System.out.println("" + too.getRezultat());
            int organizacijaID = (int) too.getRezultat();
            System.out.println("ID nove organizacije je : " + organizacijaID);
            //cuvanje Organizacije
            Organizacija o = new Organizacija();
            o.setOrganizacijaID(organizacijaID);
            o.setNazivOrganizacije(jtfNazivOrganizacije.getText().trim());
            o.setImeOsnivaca(jtfImeOsnivaca.getText().trim());
            o.setDatumOsnivanja(datumOsnivanja);
            o.setOpisDelatnosti(jtaOpisDelatnosti.getText());
            toz.setOperacija(Konstante.SACUVAJ_ORGANIZACIJU);
            toz.setParametar(o);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            too = Komunikacija.vratiObjekat().procitajOdgovor();
            System.out.println("" + too.getOdgovor());
            JOptionPane.showMessageDialog(jScrollPane2, "Uspesno je sacuvana organizacija " + o.getNazivOrganizacije() + " , ID=" + o.getOrganizacijaID(), "Cuvanje organizacije", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(FrmUnosOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmUnosOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void ponistiUnos(JTextField jtfNazivOrganizacije,JTextField jtfImeOsnivaca, JTextArea jtaOpisDelatnosti, JDateChooser jdcDatumOsnivanja){
        jtfNazivOrganizacije.setText("");
        jtfImeOsnivaca.setText("");
        jtaOpisDelatnosti.setText("");
        jdcDatumOsnivanja.setDate(null);
    }
}
