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
public class FrmAzuriranjeOrganizacije extends javax.swing.JPanel {

    /**
     * Creates new form FrmAzuriranjeOrganizacije
     */
    public FrmAzuriranjeOrganizacije() {
        initComponents();
      //  popuniKomboBoks();
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
        jcbListaOrganizacija = new javax.swing.JComboBox();
        jpUnosOrganizacije = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNazivOrganizacije = new javax.swing.JTextField();
        jtfImeOsnivaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfOpisDelatnosti = new javax.swing.JTextArea();
        jbtSacuvaj = new javax.swing.JButton();
        jbtPonisti = new javax.swing.JButton();
        jdcDatumOsnivanja = new com.toedter.calendar.JDateChooser();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ažuriranje organizacije", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName(""); // NOI18N

        jLabel1.setText("Lista organizacija:");

        jcbListaOrganizacija.setBackground(new java.awt.Color(255, 0, 255));

        jpUnosOrganizacije.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        jLabel2.setText("Naziv organizacije:");

        jLabel3.setText("Ime i prezime osnivača:");

        jLabel4.setText("Datum osnivanja:");

        jLabel5.setText("Opis delatnosti:");

        jtfImeOsnivaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImeOsnivacaActionPerformed(evt);
            }
        });

        jtfOpisDelatnosti.setColumns(20);
        jtfOpisDelatnosti.setRows(5);
        jScrollPane1.setViewportView(jtfOpisDelatnosti);

        jbtSacuvaj.setText("Sačuvaj promene");

        jbtPonisti.setText("Poništi promene");

        javax.swing.GroupLayout jpUnosOrganizacijeLayout = new javax.swing.GroupLayout(jpUnosOrganizacije);
        jpUnosOrganizacije.setLayout(jpUnosOrganizacijeLayout);
        jpUnosOrganizacijeLayout.setHorizontalGroup(
            jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUnosOrganizacijeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUnosOrganizacijeLayout.createSequentialGroup()
                        .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfImeOsnivaca)
                            .addComponent(jtfNazivOrganizacije)
                            .addComponent(jdcDatumOsnivanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jpUnosOrganizacijeLayout.createSequentialGroup()
                        .addComponent(jbtSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jpUnosOrganizacijeLayout.setVerticalGroup(
            jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUnosOrganizacijeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNazivOrganizacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfImeOsnivaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdcDatumOsnivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpUnosOrganizacijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPonisti)
                    .addComponent(jbtSacuvaj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpUnosOrganizacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98)
                        .addComponent(jcbListaOrganizacija, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbListaOrganizacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpUnosOrganizacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfImeOsnivacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImeOsnivacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImeOsnivacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtPonisti;
    private javax.swing.JButton jbtSacuvaj;
    private javax.swing.JComboBox jcbListaOrganizacija;
    private com.toedter.calendar.JDateChooser jdcDatumOsnivanja;
    private javax.swing.JPanel jpUnosOrganizacije;
    private javax.swing.JTextField jtfImeOsnivaca;
    private javax.swing.JTextField jtfNazivOrganizacije;
    private javax.swing.JTextArea jtfOpisDelatnosti;
    // End of variables declaration//GEN-END:variables

   
}
