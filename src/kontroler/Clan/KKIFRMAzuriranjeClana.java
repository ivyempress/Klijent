/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.Clan;

import com.toedter.calendar.JDateChooser;
import domen.Clan;
import domen.Grad;
import domen.Ljubimac;
import domen.Organizacija;
import domen.Zivotinja;
import forme.clan.FrmAzuriranjeClana;
import forme.clan.ModelTabeleLjubimac;
import forme.organizacija.FrmBrisanjeOrganizacije;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import komunikacija.Komunikacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 *
 */
public class KKIFRMAzuriranjeClana {

    static List<Ljubimac> novaListaLjubimaca = new ArrayList<>();

    public static void srediFormu(JComboBox jcbListaClanova) {
        try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_CLANOVE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Clan> listaClanova = (List<Clan>) too.getRezultat();
            jcbListaClanova.setModel(new DefaultComboBoxModel(listaClanova.toArray()));
            //vracanje ljubimaca od svih clanova
            for (Clan ck : listaClanova) {

                toZahtev = new TransferObjekatZahtev();
                toZahtev.setOperacija(Konstante.VRATI_SVE_LJUBIMCE);
                toZahtev.setParametar(ck.getJmbg());
                Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
                too = Komunikacija.vratiObjekat().procitajOdgovor();
                List<Ljubimac> listaLjubimaca = (List<Ljubimac>) too.getRezultat();
                ck.setListaLjubimaca(listaLjubimaca);
            }
            System.out.println("");
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void formatirajPolja(Boolean b, JPanel jpClan, JPanel jpLjubimac, JTable jtblLjubimci) {
        for (Component c : jpClan.getComponents()) {
            c.setEnabled(b);
        }
        for (Component c : jpLjubimac.getComponents()) {
            c.setEnabled(b);
        }
        jtblLjubimci.setEnabled(b);

    }

    public static void popuniPolja(JPanel jpClan, JPanel jpLjubimac, JTable jtblLjubimci, JComboBox jcbOrganizacija, JComboBox jcbGrad, JTextField jtfJmbg, JComboBox jcbListaClanova, JTextField jtfIme, JTextField jtfPrezime, JDateChooser jdcDatumRodjenja, JDateChooser jdcDatumUclanjenja, JComboBox jcbZivotinja) {
        KKIFRMAzuriranjeClana.formatirajPolja(Boolean.TRUE, jpClan, jpLjubimac, jtblLjubimci);
        try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ORGANIZACIJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Organizacija> listaOrganizacija = (List<Organizacija>) too.getRezultat();
            DefaultComboBoxModel dcbmOrganizacija = new DefaultComboBoxModel(listaOrganizacija.toArray());
            jcbOrganizacija.setModel(dcbmOrganizacija);

            toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_GRADOVE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Grad> listaGradova = (List<Grad>) too.getRezultat();
            DefaultComboBoxModel dcbmGrad = new DefaultComboBoxModel(listaGradova.toArray());
            jcbGrad.setModel(dcbmGrad);

            jtfJmbg.setEnabled(false);
            Clan c = (Clan) jcbListaClanova.getSelectedItem();
            jtfJmbg.setText(c.getJmbg());
            jtfIme.setText(c.getIme());

            jtfPrezime.setText(c.getPrezime());
            jdcDatumRodjenja.setDate(c.getDatumRodjenja());
            jdcDatumUclanjenja.setDate(c.getDatumUclanjenja());

            dcbmGrad.setSelectedItem(c.getDrzava());
            dcbmOrganizacija.setSelectedItem(c.getOrganizacija());

            JComboBox jcbZivotinja2 = new JComboBox();

            toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_ZIVOTINJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Zivotinja> listaZivotinja = (List<Zivotinja>) too.getRezultat();
            DefaultComboBoxModel boxModel = new DefaultComboBoxModel(listaZivotinja.toArray());
            jcbZivotinja2.setModel(boxModel);
            System.out.println(too.getOdgovor());

            ModelTabeleLjubimac modelTabeleLjubimac = new ModelTabeleLjubimac(c, boxModel);
            jtblLjubimci.setModel(modelTabeleLjubimac);

            TableColumn column = jtblLjubimci.getColumnModel().getColumn(3);
            column.setCellEditor(new DefaultCellEditor(jcbZivotinja2));
            jcbZivotinja.setModel(boxModel);

        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void dodajLjubimca(JDateChooser jdcDatumSpasavanjaLjubimca, JTextField jtfImeLjubimca, JPanel jpLjubimac, JTable jtblLjubimci, JComboBox jcbListaClanova, JComboBox jcbZivotinja) {

        try {
            Date datumSpasavanjaLjubimca = jdcDatumSpasavanjaLjubimca.getDate();
            if (jtfImeLjubimca.getText().isEmpty() || datumSpasavanjaLjubimca == null) {
                JOptionPane.showMessageDialog(jpLjubimac, "Morate uneti sva polja na formi da bi dodali ljubmica", "Dodavanje ljubmica", JOptionPane.WARNING_MESSAGE);
                return;
            }
            ModelTabeleLjubimac mtlj = (ModelTabeleLjubimac) jtblLjubimci.getModel();

            String imeLjubimca = jtfImeLjubimca.getText().trim();
            Ljubimac ljubimac = new Ljubimac();
            ljubimac.setVlasnik((Clan) jcbListaClanova.getSelectedItem());
            ljubimac.setImeLjubimca(imeLjubimca);
            ljubimac.setDatumSpasavanja(datumSpasavanjaLjubimca);
            ljubimac.setVrstaZivotinje((Zivotinja) jcbZivotinja.getSelectedItem());
            ljubimac.setLjubimacID(mtlj.getClan().getListaLjubimaca().size() + 1);
            novaListaLjubimaca.add(ljubimac);
            TransferObjekatZahtev tozAhtev = new TransferObjekatZahtev();
            tozAhtev.setOperacija(Konstante.SACUVAJ_LJUBIMCA);
            tozAhtev.setParametar(ljubimac);

            Komunikacija.vratiObjekat().posaljiZahtev(tozAhtev);
            TransferObjekatOdgovor to = Komunikacija.vratiObjekat().procitajOdgovor();
            KKIFRMAzuriranjeClana.srediFormu(jcbListaClanova);
            mtlj.fireTableDataChanged();

            JOptionPane.showMessageDialog(jpLjubimac, "Uspesno ste uneli ljubimca : " + ljubimac.getImeLjubimca(), imeLjubimca, JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(FrmAzuriranjeClana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmAzuriranjeClana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void azurirajClana(JTextField jtfJmbg, JTextField jtfIme,JTextField jtfPrezime,JDateChooser jdcDatumRodjenja, JComboBox jcbGrad,JComboBox jcbOrganizacija, JDateChooser jdcDatumUclanjenja ,JPanel jpLjubimac    )  {

        try {
            Clan clan = new Clan();
            clan.setJmbg(jtfJmbg.getText());
            clan.setIme(jtfIme.getText().trim());
            clan.setPrezime(jtfPrezime.getText().trim());
            clan.setDatumRodjenja(jdcDatumRodjenja.getDate());
            clan.setDrzava((Grad) jcbGrad.getSelectedItem());
            clan.setOrganizacija((Organizacija) jcbOrganizacija.getSelectedItem());
            clan.setDatumUclanjenja(jdcDatumUclanjenja.getDate());
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.IZMENI_CLANA);
            toZahtev.setParametar(clan);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor toOdgovor = Komunikacija.vratiObjekat().procitajOdgovor();
            JOptionPane.showMessageDialog(jpLjubimac, toOdgovor.getOdgovor(), "Izmena clana", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(FrmAzuriranjeClana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmAzuriranjeClana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
