/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.organizacija;

/**
 *
 * @author Ivana
 */
public class FrmUnosOrganizacije extends javax.swing.JPanel {

    /**
     * Creates new form FrmUnosOrganizacije
     */
    public FrmUnosOrganizacije() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNazivOrganizacije = new javax.swing.JTextField();
        jtfImeOsnivaca = new javax.swing.JTextField();
        jtfDatumOsnivanja = new javax.swing.JTextField();
        jbtSacuvaj = new javax.swing.JButton();
        jbtPonisti = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOpisDelatnosti = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unos nove organizacije", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(600, 425));

        jLabel1.setText("Naziv organizacije:");

        jLabel2.setText("Ime i prezime osnivača:");

        jLabel3.setText("Datum osnivanja:");

        jLabel4.setText("Opis delatnosti:");

        jtfImeOsnivaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImeOsnivacaActionPerformed(evt);
            }
        });

        jtfDatumOsnivanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDatumOsnivanjaActionPerformed(evt);
            }
        });

        jbtSacuvaj.setText("Sačuvaj organizaciju");

        jbtPonisti.setText("Poništi unos");

        jtaOpisDelatnosti.setColumns(20);
        jtaOpisDelatnosti.setRows(5);
        jScrollPane2.setViewportView(jtaOpisDelatnosti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jbtSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfImeOsnivaca, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jtfNazivOrganizacije, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jtfDatumOsnivanja, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jbtPonisti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNazivOrganizacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfImeOsnivaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDatumOsnivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSacuvaj)
                    .addComponent(jbtPonisti))
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfImeOsnivacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImeOsnivacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImeOsnivacaActionPerformed

    private void jtfDatumOsnivanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDatumOsnivanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDatumOsnivanjaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtPonisti;
    private javax.swing.JButton jbtSacuvaj;
    private javax.swing.JTextArea jtaOpisDelatnosti;
    private javax.swing.JTextField jtfDatumOsnivanja;
    private javax.swing.JTextField jtfImeOsnivaca;
    private javax.swing.JTextField jtfNazivOrganizacije;
    // End of variables declaration//GEN-END:variables
}
