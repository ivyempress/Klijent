/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.clan;

import domen.Clan;
import domen.Ljubimac;
import domen.Organizacija;
import forme.organizacija.FrmBrisanjeOrganizacije;
import forme.organizacija.ModelTabeleOrganizacija;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 */
public class FrmBrisanjeClana extends javax.swing.JPanel {

    /**
     * Creates new form FrmUnosClana
     */
    public FrmBrisanjeClana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtPrikaziSveClanove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTabelaClanova = new javax.swing.JTable();
        jbtObrisi = new javax.swing.JButton();
        jlUnesiteKriterijumPretrageKursa = new javax.swing.JLabel();
        jtfKriterijumPretrage = new javax.swing.JTextField();
        jbtPronadjiClanove = new javax.swing.JButton();
        jlKriterijumiKursa = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Obriši člana", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jbtPrikaziSveClanove.setText("Prikaži sve članove");
        jbtPrikaziSveClanove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrikaziSveClanoveActionPerformed(evt);
            }
        });

        jtblTabelaClanova.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtblTabelaClanova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblTabelaClanovaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblTabelaClanova);

        jbtObrisi.setText("Obriši člana");
        jbtObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtObrisiActionPerformed(evt);
            }
        });

        jlUnesiteKriterijumPretrageKursa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlUnesiteKriterijumPretrageKursa.setText("Unesite kriterijum pretrage :");

        jtfKriterijumPretrage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKriterijumPretrageActionPerformed(evt);
            }
        });

        jbtPronadjiClanove.setText("Pronađi");
        jbtPronadjiClanove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPronadjiClanoveActionPerformed(evt);
            }
        });

        jlKriterijumiKursa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlKriterijumiKursa.setText("ime/prezime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtPrikaziSveClanove, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlUnesiteKriterijumPretrageKursa)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlKriterijumiKursa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtPronadjiClanove))
                            .addComponent(jtfKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUnesiteKriterijumPretrageKursa)
                    .addComponent(jtfKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlKriterijumiKursa)
                    .addComponent(jbtPronadjiClanove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtObrisi)
                    .addComponent(jbtPrikaziSveClanove))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPrikaziSveClanoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrikaziSveClanoveActionPerformed
        try {
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.VRATI_SVE_CLANOVE);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Clan> listaClanova = (List<Clan>) too.getRezultat();
            jtblTabelaClanova.setModel(new ModelTabeleClan(listaClanova));
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
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtPrikaziSveClanoveActionPerformed

    private void jtblTabelaClanovaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblTabelaClanovaMouseClicked
        // TODO add your handling code here:
        int row = jtblTabelaClanova.rowAtPoint(evt.getPoint());
        int col = jtblTabelaClanova.columnAtPoint(evt.getPoint());
        if (col == 7) {
            String opis = (String) jtblTabelaClanova.getModel().getValueAt(row, col);
            JOptionPane.showMessageDialog(this, opis, "Ljubimci", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jtblTabelaClanovaMouseClicked

    private void jtfKriterijumPretrageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKriterijumPretrageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKriterijumPretrageActionPerformed

    private void jbtPronadjiClanoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPronadjiClanoveActionPerformed
        try {
            String kriterijum = jtfKriterijumPretrage.getText();
            if (kriterijum.isEmpty()) {
                JOptionPane.showMessageDialog(jtblTabelaClanova, "Niste uneli kriterijum pretrage", "Pretraga clanova", JOptionPane.WARNING_MESSAGE);
                return;
            }
            kriterijum = jtfKriterijumPretrage.getText().trim();
            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
            toZahtev.setOperacija(Konstante.PRETRAZI_CLANOVE);
            toZahtev.setParametar(kriterijum);
            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            List<Clan> listaClanova = (List<Clan>) too.getRezultat();
            for (Clan ck : listaClanova) {

                toZahtev = new TransferObjekatZahtev();
                toZahtev.setOperacija(Konstante.VRATI_SVE_LJUBIMCE);
                toZahtev.setParametar(ck.getJmbg());
                Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
                too = Komunikacija.vratiObjekat().procitajOdgovor();
                List<Ljubimac> listaLjubimaca = (List<Ljubimac>) too.getRezultat();
                ck.setListaLjubimaca(listaLjubimaca);
            }

            jtblTabelaClanova.setModel(new ModelTabeleClan(listaClanova));
        } catch (IOException ex) {
            Logger.getLogger(FrmBrisanjeClana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmBrisanjeClana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtPronadjiClanoveActionPerformed

    private void jbtObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtObrisiActionPerformed
        int izabraniRed = jtblTabelaClanova.getSelectedRow();
        if (izabraniRed == -1) {
            JOptionPane.showConfirmDialog(jtblTabelaClanova, "Niste obelezili kojeg clana zelite da obrisete", "Brisanje clana", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                ModelTabeleClan modelTabeleClan = (ModelTabeleClan) jtblTabelaClanova.getModel();
                Clan c = modelTabeleClan.vratiClana(izabraniRed);
                TransferObjekatZahtev toz = new TransferObjekatZahtev();
                toz.setOperacija(Konstante.OBRISI_CLANA);
                toz.setParametar(c);
                Komunikacija.vratiObjekat().posaljiZahtev(toz);
                TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
                JOptionPane.showMessageDialog(jtblTabelaClanova, "" + too.getOdgovor() + " : " + c.getIme()+" "+ c.getPrezime(), "Brisanje Clana", JOptionPane.INFORMATION_MESSAGE);
                modelTabeleClan.obrisiClana(izabraniRed);
            } catch (IOException ex) {
                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jbtObrisiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtObrisi;
    private javax.swing.JButton jbtPrikaziSveClanove;
    private javax.swing.JButton jbtPronadjiClanove;
    private javax.swing.JLabel jlKriterijumiKursa;
    private javax.swing.JLabel jlUnesiteKriterijumPretrageKursa;
    private javax.swing.JTable jtblTabelaClanova;
    private javax.swing.JTextField jtfKriterijumPretrage;
    // End of variables declaration//GEN-END:variables
}
