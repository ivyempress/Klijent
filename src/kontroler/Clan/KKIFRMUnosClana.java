package kontroler.Clan;

import com.toedter.calendar.JDateChooser;
import domen.Clan;
import domen.Grad;
import domen.Ljubimac;
import domen.Organizacija;
import domen.Zivotinja;
import forme.clan.FrmUnosClana;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import komunikacija.Komunikacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 */
public class KKIFRMUnosClana {
    static Clan clan;
    static List<Ljubimac> listaLjubimaca = new ArrayList<>();
    public static void inicijalizujKomboBoks(JComboBox jcbOrganizacija, JComboBox jcbGrad, JComboBox jcbZivotinja) {

        try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ORGANIZACIJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor toOdgovor = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Organizacija> listaOrganizacija = (List<Organizacija>) toOdgovor.getRezultat();
            for (Organizacija o : listaOrganizacija) {
                jcbOrganizacija.addItem(o);
            }

            System.out.println(toOdgovor.getOdgovor());

            toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_GRADOVE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            toOdgovor = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Grad> listaGradova = (List<Grad>) toOdgovor.getRezultat();
            for (Grad g : listaGradova) {
                jcbGrad.addItem(g);
            }

            System.out.println(toOdgovor.getOdgovor());

            toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ZIVOTINJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            toOdgovor = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Zivotinja> listaZivotinja = (List<Zivotinja>) toOdgovor.getRezultat();
            for (Zivotinja z : listaZivotinja) {
                jcbZivotinja.addItem(z);
            }

            System.out.println(toOdgovor.getOdgovor());

        } catch (IOException ex) {
            Logger.getLogger(FrmUnosClana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmUnosClana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ocistiFormu(JTextField jtfJmbg ,JTextField jtfIme, JTextField jtfPrezime, JDateChooser jdcDatumRodjenja, JDateChooser jdcDatumSpasavanjaLjubimca, JDateChooser jdcDatumUclanjenja  ) {
        jtfJmbg.setText("");
        jtfIme.setText("");
        jtfPrezime.setText("");
        jdcDatumRodjenja.setDate(null);
        jdcDatumSpasavanjaLjubimca.setDate(null);
        jdcDatumUclanjenja.setDate(null);

    }
    
    public static void dodajLjubimca(JDateChooser jdcDatumSpasavanjaLjubimca , JTextField jtfImeLjubimca, JPanel jpLjubimac,JComboBox jcbZivotinja  ){
              Date datumSpasavanjaLjubimca = jdcDatumSpasavanjaLjubimca.getDate();
        if (jtfImeLjubimca.getText().isEmpty() || datumSpasavanjaLjubimca == null) {
            JOptionPane.showMessageDialog(jpLjubimac, "Morate uneti sva polja na formi da bi dodali ljubmica", "Dodavanje ljubmica", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String imeLjubimca = jtfImeLjubimca.getText().trim();
        Ljubimac ljubimac = new Ljubimac();
        ljubimac.setImeLjubimca(imeLjubimca);
        ljubimac.setDatumSpasavanja(datumSpasavanjaLjubimca);
        ljubimac.setVrstaZivotinje((Zivotinja) jcbZivotinja.getSelectedItem());
        ljubimac.setLjubimacID(listaLjubimaca.size() + 1);
        listaLjubimaca.add(ljubimac);
        JOptionPane.showMessageDialog(jpLjubimac, "Uspesno ste uneli ljubimca : " + ljubimac.getImeLjubimca(), imeLjubimca, WIDTH);
    }
    
    public static void sacuvajClana(JTextField jtfJmbg,JPanel jpLjubimac,JDateChooser jdcDatumRodjenja,JDateChooser jdcDatumUclanjenja,JTextField jtfIme,JTextField jtfPrezime,JComboBox jcbOrganizacija , JComboBox jcbGrad,JDateChooser jdcDatumSpasavanjaLjubimca ){
               
         /*
        
         Maticni broj se sastoji od 13 cifara u obliku "DD MM GGG RR BBB K"
         DD - dan rodjenja
         MM - mesec rodjenja
         GGG - godina rodjenja
         RR - Region
         BBB - jedinstveni broj
         K - kontrolni broj koji se izracunava po formuli
        
         Kontrolni broj se izracunava formulom gde je DDMMGGGRRBBBK = ABVGDĐEŽZIJKL
        
         L = 11 - (( 7*(A+E) + 6*(B+Ž) + 5*(V+Z) + 4*(G+I) + 3*(D+J) + 2*(Đ+K) ) % 11)
        
         ako je L izmedju 1i 9 K jednako tom broju L = K,
         ako je L vece od 9 postaje 0
        
         */
        char[] karakteri = jtfJmbg.getText().toCharArray();
        int[] cifre = new int[jtfJmbg.getText().length()];

//        Konverzija stringa u niz cifara
        if (jtfJmbg.getText().length() != 13) {
            JOptionPane.showMessageDialog(jpLjubimac, "Matični broj se sastoji od 13 cifara! \n Proverite unos!");
            return;
      //      throw new RuntimeException("Matični broj se sastoji od 13 cifara! \n Proverite unos!");
           
        } else {
            for (int i = 0; i < karakteri.length; i++) {
                if (Character.isDigit(karakteri[i])) {
                    cifre[i] = Integer.parseInt(Character.toString(karakteri[i]));
                } else {
                    JOptionPane.showMessageDialog(jpLjubimac, "Matični broj se sastoji od 13 cifara! \\n Proverite unos!");
            return;
                    //throw new RuntimeException("Matični broj se sastoji od 13 cifara! \n Proverite unos!");
                }
            }

        }

//        Parsiranje i provera datuma rodjenja
        DateFormat df = new SimpleDateFormat("ddMMyy");
        try {
            String datumString = jtfJmbg.getText().substring(0, 4) + jtfJmbg.getText().substring(5, 7);
            Date datum = df.parse(datumString);
        } catch (ParseException e) {
             JOptionPane.showMessageDialog(jpLjubimac, "Matični broj nije validan!");
             return;
           // throw new RuntimeException("Matični broj nije validan!");
            
        }

////        Racunanje i provera kontrolnog broja
//        int unet = cifre[12];
//
//        int a = cifre[0];
//        int b = cifre[1];
//        int c = cifre[2];
//        int d = cifre[3];
//        int e = cifre[4];
//        int f = cifre[5];
//        int g = cifre[6];
//        int h = cifre[7];
//        int i = cifre[8];
//        int j = cifre[9];
//        int k = cifre[10];
//        int l = cifre[11];
//        int m = cifre[12];
//
//        int izracunat = 11 - ((7 * (a + g) + 6 * (b + h) + 5 * (c + i) + 4 * (d + j) + 3 * (e + k) + 2 * (f + l)) % 11);
//        if (!(izracunat >= 1 && izracunat <= 9)) {
//            izracunat = 0;
//        }
//
//        if (unet != izracunat) {
//           JOptionPane.showMessageDialog(jpLjubimac, "Matični broj nije validan!");
//            return;
//          //  throw new RuntimeException("Matični broj nije validan!");
//        }
//   

        
        
        
        Date datumRodjenja = jdcDatumRodjenja.getDate();
        Date datumUclanjenja = jdcDatumUclanjenja.getDate();
        if (jtfJmbg.getText().isEmpty() || jtfIme.getText().isEmpty() || jtfPrezime.getText().isEmpty() || datumRodjenja == null || datumUclanjenja == null) {
            JOptionPane.showMessageDialog(jpLjubimac, "Morate uneti sva polja na formi", "Cuvanje clana", JOptionPane.WARNING_MESSAGE);
            return;
        }
        clan = new Clan();
        clan.setJmbg(jtfJmbg.getText().trim());
        clan.setIme(jtfIme.getText().trim());
        clan.setPrezime(jtfPrezime.getText().trim());
        clan.setDatumRodjenja(datumRodjenja);
        clan.setDatumUclanjenja(datumUclanjenja);
        clan.setOrganizacija((Organizacija) jcbOrganizacija.getSelectedItem());
        clan.setDrzava((Grad) jcbGrad.getSelectedItem());
        for (Ljubimac ljub : listaLjubimaca) {
            ljub.setVlasnik(clan);
        }
        clan.setListaLjubimaca(listaLjubimaca);

        try {
            TransferObjekatZahtev toz = new TransferObjekatZahtev();
            toz.setOperacija(Konstante.SACUVAJ_CLANA);
            toz.setParametar(clan);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            JOptionPane.showMessageDialog(jpLjubimac, too.getOdgovor() + ": " + clan.getIme() + " " + clan.getPrezime(), "Cuvanje clana", JOptionPane.INFORMATION_MESSAGE);
            listaLjubimaca = new ArrayList<>();
            KKIFRMUnosClana.ocistiFormu(jtfJmbg, jtfIme, jtfPrezime, jdcDatumRodjenja, jdcDatumSpasavanjaLjubimca, jdcDatumUclanjenja);
        } catch (IOException ex) {
            Logger.getLogger(FrmUnosClana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmUnosClana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
