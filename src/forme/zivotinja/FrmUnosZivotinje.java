/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.zivotinja;

import domen.Zivotinja;
import java.io.IOException;
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
public class FrmUnosZivotinje extends javax.swing.JPanel {

    /**
     * Creates new form FrmUnosZivotinje
     */
    public FrmUnosZivotinje() {
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
        jtfNazivZivotinje = new javax.swing.JTextField();
        jbtSacuvaj = new javax.swing.JButton();
        jbtPonisti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaOpisZivotinje = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unos nove životinje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jLabel1.setText("Naziv životinje:");

        jbtSacuvaj.setText("Sačuvaj životinju");
        jbtSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSacuvajActionPerformed(evt);
            }
        });

        jbtPonisti.setText("Poništi unos");
        jbtPonisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPonistiActionPerformed(evt);
            }
        });

        jtaOpisZivotinje.setColumns(20);
        jtaOpisZivotinje.setRows(5);
        jScrollPane1.setViewportView(jtaOpisZivotinje);

        jLabel2.setText("Kratak opis o vrsti:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNazivZivotinje, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtSacuvaj)
                        .addGap(68, 68, 68)
                        .addComponent(jbtPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNazivZivotinje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSacuvaj)
                    .addComponent(jbtPonisti))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSacuvajActionPerformed
        try {
            
             if (jtfNazivZivotinje.getText().isEmpty() || jtaOpisZivotinje.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(jScrollPane1, "Niste uneli sva polja na formi ", "Cuvanje zivotinje", JOptionPane.WARNING_MESSAGE);
                 return;
            }
            
            TransferObjekatZahtev toz = new TransferObjekatZahtev();
            toz.setOperacija(Konstante.VRATI_ID_ZIVOTINJE);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            TransferObjekatOdgovor too = Komunikacija.vratiObjekat().procitajOdgovor();
            int zivotinjaID = (int) too.getRezultat();
            System.out.println("ID nove zivotinje je : "+zivotinjaID);
            
            Zivotinja z = new Zivotinja();
            z.setZivotinjaID(zivotinjaID);
            z.setNaziv(jtfNazivZivotinje.getText());
            z.setOpisVrste(jtaOpisZivotinje.getText());
            
            toz.setOperacija(Konstante.SACUVAJ_ZIVOTINJU);
            toz.setParametar(z);
            Komunikacija.vratiObjekat().posaljiZahtev(toz);
            too = Komunikacija.vratiObjekat().procitajOdgovor();
            System.out.println(""+too.getOdgovor());
            JOptionPane.showMessageDialog(jScrollPane1, "Uspesno je sacuvana zivotinja "+z.getNaziv()+" , ID="+z.getZivotinjaID(), "Cuvanje organizacije", JOptionPane.INFORMATION_MESSAGE);    
        
// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmUnosZivotinje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmUnosZivotinje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtSacuvajActionPerformed

    private void jbtPonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPonistiActionPerformed
        jtfNazivZivotinje.setText("");
        jtaOpisZivotinje.setText("");
    }//GEN-LAST:event_jbtPonistiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtPonisti;
    private javax.swing.JButton jbtSacuvaj;
    private javax.swing.JTextArea jtaOpisZivotinje;
    private javax.swing.JTextField jtfNazivZivotinje;
    // End of variables declaration//GEN-END:variables
}
