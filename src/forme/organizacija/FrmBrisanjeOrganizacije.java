/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.organizacija;

import domen.Organizacija;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import kontroler.Organizacija.KKIFRMBrisanjeOrganizacije;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Ivana
 */
public class FrmBrisanjeOrganizacije extends javax.swing.JPanel {

    /**
     * Creates new form FrmObrišiOrganizaciju
     */
    public FrmBrisanjeOrganizacije() {
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

        jbtObrisi = new javax.swing.JButton();
        jlUnesiteKriterijumPretrageKursa = new javax.swing.JLabel();
        jtfKriterijumPretrage = new javax.swing.JTextField();
        jlKriterijumiKursa = new javax.swing.JLabel();
        jbtPronadjiOrganizaciju = new javax.swing.JButton();
        jbtPrikaziSveOrganiyacije = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTabelaOrganizacija = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brisanje organizacije", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jbtObrisi.setText("Obriši organizaciju");
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

        jlKriterijumiKursa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlKriterijumiKursa.setText("naziv/osnivac");

        jbtPronadjiOrganizaciju.setText("Pronađi");
        jbtPronadjiOrganizaciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPronadjiOrganizacijuActionPerformed(evt);
            }
        });

        jbtPrikaziSveOrganiyacije.setText("Prikaži sve organizacije");
        jbtPrikaziSveOrganiyacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrikaziSveOrganiyacijeActionPerformed(evt);
            }
        });

        jtblTabelaOrganizacija.setBackground(new java.awt.Color(220, 220, 122));
        jtblTabelaOrganizacija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtblTabelaOrganizacija.setToolTipText("");
        jtblTabelaOrganizacija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblTabelaOrganizacijaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblTabelaOrganizacija);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(jbtObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jlUnesiteKriterijumPretrageKursa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlKriterijumiKursa)
                                    .addGap(171, 171, 171)
                                    .addComponent(jbtPronadjiOrganizaciju))
                                .addComponent(jtfKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtPrikaziSveOrganiyacije, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(13, 13, 13)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(jbtObrisi)
                .addGap(51, 51, 51))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlUnesiteKriterijumPretrageKursa)
                        .addComponent(jtfKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtPronadjiOrganizaciju)
                        .addComponent(jlKriterijumiKursa))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jbtPrikaziSveOrganiyacije)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfKriterijumPretrageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKriterijumPretrageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKriterijumPretrageActionPerformed

    private void jbtPronadjiOrganizacijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPronadjiOrganizacijuActionPerformed
//        try {
//            if (jtfKriterijumPretrage.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(jScrollPane1, "Morate uneti kriterijum za pretragu", "Pretraga", JOptionPane.WARNING_MESSAGE);
//                return;
//            }
//            String kriterijum = jtfKriterijumPretrage.getText().trim();
//            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
//            toZahtev.setOperacija(Konstante.PRETRAZI_ORGANIZACIJE);
//            toZahtev.setParametar(kriterijum);
//            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
//            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
//            List<Organizacija> listaOrg = (List<Organizacija>) too.getRezultat();
//            jtblTabelaOrganizacija.setModel(new ModelTabeleOrganizacija(listaOrg));
//        } catch (IOException ex) {
//            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//        }
        KKIFRMBrisanjeOrganizacije.pronadjiOrganizaciju(jtfKriterijumPretrage, jScrollPane1, jtblTabelaOrganizacija);

    }//GEN-LAST:event_jbtPronadjiOrganizacijuActionPerformed

    private void jbtPrikaziSveOrganiyacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrikaziSveOrganiyacijeActionPerformed
//        try {
//            TransferObjekatZahtev toZahtev = new TransferObjekatZahtev();
//            toZahtev.setOperacija(Konstante.VRATI_SVE_ORGANIZACIJE);
//            Komunikacija.vratiObjekat().posaljiZahtev(toZahtev);
//            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
//            List<Organizacija> listaOrganizacija = (List<Organizacija>) too.getRezultat();
//            jtblTabelaOrganizacija.setModel(new ModelTabeleOrganizacija(listaOrganizacija));
//        } catch (IOException ex) {
//            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//        }
        KKIFRMBrisanjeOrganizacije.prikaziSveOrganizacije(jtblTabelaOrganizacija);
    }//GEN-LAST:event_jbtPrikaziSveOrganiyacijeActionPerformed

    private void jtblTabelaOrganizacijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblTabelaOrganizacijaMouseClicked
        // TODO add your handling code here:
        int row = jtblTabelaOrganizacija.rowAtPoint(evt.getPoint());
        int col = jtblTabelaOrganizacija.columnAtPoint(evt.getPoint());
        if (col == 4) {
            String opis = (String) jtblTabelaOrganizacija.getModel().getValueAt(row, col);
            JOptionPane.showMessageDialog(this, opis, "Opis organizacije", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jtblTabelaOrganizacijaMouseClicked

    private void jbtObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtObrisiActionPerformed
//        int izabraniRed = jtblTabelaOrganizacija.getSelectedRow();
//        if (izabraniRed == -1) {
//            JOptionPane.showConfirmDialog(jtblTabelaOrganizacija, "Niste obelezili koju organizaciju zelite da obrisete", "Brisanje organizacije", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else {
//            try {
//                ModelTabeleOrganizacija modelTabeleOrganizacija = (ModelTabeleOrganizacija) jtblTabelaOrganizacija.getModel();
//                Organizacija o = modelTabeleOrganizacija.vratiOrganizaciju(izabraniRed);
//                TransferObjekatZahtev toz = new TransferObjekatZahtev();
//                toz.setOperacija(Konstante.OBRISI_ORGANIZACIJU);
//                toz.setParametar(o);
//                Komunikacija.vratiObjekat().posaljiZahtev(toz);
//                TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
//                if(too.getOdgovor()!=null){
//                JOptionPane.showMessageDialog(jtblTabelaOrganizacija, ""+too.getOdgovor()+" : "+o.getNazivOrganizacije(), "Brisanje organizacije", JOptionPane.INFORMATION_MESSAGE);
//                modelTabeleOrganizacija.obrisiOrganizaciju(izabraniRed);
//                }
//                else {JOptionPane.showMessageDialog(jtblTabelaOrganizacija, "Ne mozete da obrisete organizaciju, jer ona sadrzi aktivne clanove", "Brisanje organizacije", JOptionPane.ERROR_MESSAGE);
//               }
//            } catch (IOException ex) {
//                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(FrmBrisanjeOrganizacije.class.getName()).log(Level.SEVERE, null, ex);
//            }
//         
//        }
        KKIFRMBrisanjeOrganizacije.obrisiOrganizaciju(jtblTabelaOrganizacija);
    }//GEN-LAST:event_jbtObrisiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtObrisi;
    private javax.swing.JButton jbtPrikaziSveOrganiyacije;
    private javax.swing.JButton jbtPronadjiOrganizaciju;
    private javax.swing.JLabel jlKriterijumiKursa;
    private javax.swing.JLabel jlUnesiteKriterijumPretrageKursa;
    private javax.swing.JTable jtblTabelaOrganizacija;
    private javax.swing.JTextField jtfKriterijumPretrage;
    // End of variables declaration//GEN-END:variables
}
