/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.organizacija;

import javax.swing.JOptionPane;

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

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Brisanje organizacije", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jbtObrisi.setText("Obriši organizaciju");

        jlUnesiteKriterijumPretrageKursa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlUnesiteKriterijumPretrageKursa.setText("Unesite kriterijum pretrage :");

        jtfKriterijumPretrage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKriterijumPretrageActionPerformed(evt);
            }
        });

        jlKriterijumiKursa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlKriterijumiKursa.setText("naziv");

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

        jtblTabelaOrganizacija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
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
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jbtObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jbtObrisi)
                .addGap(50, 50, 50))
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
                    .addContainerGap(51, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfKriterijumPretrageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKriterijumPretrageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKriterijumPretrageActionPerformed

    private void jbtPronadjiOrganizacijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPronadjiOrganizacijuActionPerformed
        
    }//GEN-LAST:event_jbtPronadjiOrganizacijuActionPerformed

    private void jbtPrikaziSveOrganiyacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrikaziSveOrganiyacijeActionPerformed
       
    }//GEN-LAST:event_jbtPrikaziSveOrganiyacijeActionPerformed

    private void jtblTabelaOrganizacijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblTabelaOrganizacijaMouseClicked
        // TODO add your handling code here:
        int row = jtblTabelaOrganizacija.rowAtPoint(evt.getPoint());
        int col = jtblTabelaOrganizacija.columnAtPoint(evt.getPoint());
        if ( col == 2) {
            String opis = (String) jtblTabelaOrganizacija.getModel().getValueAt(row, col);
            JOptionPane.showMessageDialog(this, opis, "Opis kursa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jtblTabelaOrganizacijaMouseClicked


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
