/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;


import forme.clan.FrmAzuriranjeClana;
import forme.clan.FrmUnosClana;
import forme.clan.FrmBrisanjeClana;
import forme.organizacija.FrmAzuriranjeOrganizacije;
import forme.organizacija.FrmBrisanjeOrganizacije;
import forme.organizacija.FrmUnosOrganizacije;
import forme.pretraga.FrmPretraga;
import forme.zivotinja.FrmAzuriranjeZivotinje;
import forme.zivotinja.FrmBrisanjeZivotinje;
import forme.zivotinja.FrmUnosZivotinje;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ivana
 */
public class FrmGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FrmGlavna
     */
    private JPanel aktivniPanel;
    
    public FrmGlavna() {
        initComponents();
        postaviImeIIkonicu();
        postaviPocetniPanel();
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
        jpPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmPretraga = new javax.swing.JMenu();
        jmiPretraga = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiDodavanjeOrganizacije = new javax.swing.JMenuItem();
        jmiAzuriranjeOrganizacije = new javax.swing.JMenuItem();
        jmiBrisanjeOrganizacije = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiDodavanjeClana = new javax.swing.JMenuItem();
        jmiAzuriranjeClana = new javax.swing.JMenuItem();
        jmiBrisanjeClana = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiDodavanjeZivotinje = new javax.swing.JMenuItem();
        jmiAzuriranjeZivotinje = new javax.swing.JMenuItem();
        jmiBrisanjeZivotinje = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(240, 217, 163));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(640, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forme/maca.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 220));

        jpPanel.setMinimumSize(new java.awt.Dimension(630, 800));
        jpPanel.setPreferredSize(new java.awt.Dimension(630, 760));
        jpPanel.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 630, 670));

        jMenuBar1.setBackground(new java.awt.Color(223, 205, 164));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(333333, 32769));

        jmPretraga.setText("Pretraga!     ");

        jmiPretraga.setText("Pretraga članova");
        jmiPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPretragaActionPerformed(evt);
            }
        });
        jmPretraga.add(jmiPretraga);

        jMenuBar1.add(jmPretraga);

        jMenu1.setText("Organizacija     ");

        jmiDodavanjeOrganizacije.setText("Dodavanje nove organizacije");
        jmiDodavanjeOrganizacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodavanjeOrganizacijeActionPerformed(evt);
            }
        });
        jMenu1.add(jmiDodavanjeOrganizacije);

        jmiAzuriranjeOrganizacije.setText("Ažuriranje organizacije");
        jmiAzuriranjeOrganizacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAzuriranjeOrganizacijeActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAzuriranjeOrganizacije);

        jmiBrisanjeOrganizacije.setText("Brisanje organizacije");
        jmiBrisanjeOrganizacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBrisanjeOrganizacijeActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBrisanjeOrganizacije);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Član     ");

        jmiDodavanjeClana.setText("Dodavanje novog člana");
        jmiDodavanjeClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodavanjeClanaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiDodavanjeClana);

        jmiAzuriranjeClana.setText("Ažuriranje člana");
        jmiAzuriranjeClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAzuriranjeClanaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAzuriranjeClana);

        jmiBrisanjeClana.setText("Brisanje člana");
        jmiBrisanjeClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBrisanjeClanaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiBrisanjeClana);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Životinja");

        jmiDodavanjeZivotinje.setText("Dodavanje nove životinje");
        jmiDodavanjeZivotinje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodavanjeZivotinjeActionPerformed(evt);
            }
        });
        jMenu3.add(jmiDodavanjeZivotinje);

        jmiAzuriranjeZivotinje.setText("Ažuriranje životinje");
        jmiAzuriranjeZivotinje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAzuriranjeZivotinjeActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAzuriranjeZivotinje);

        jmiBrisanjeZivotinje.setText("Brisanje životinje");
        jmiBrisanjeZivotinje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBrisanjeZivotinjeActionPerformed(evt);
            }
        });
        jMenu3.add(jmiBrisanjeZivotinje);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDodavanjeOrganizacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodavanjeOrganizacijeActionPerformed
        FrmUnosOrganizacije f = new FrmUnosOrganizacije();
        postaviAktivniPanel(f);
    }//GEN-LAST:event_jmiDodavanjeOrganizacijeActionPerformed

    private void jmiAzuriranjeOrganizacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAzuriranjeOrganizacijeActionPerformed
        FrmAzuriranjeOrganizacije fao = new FrmAzuriranjeOrganizacije();
        postaviAktivniPanel(fao);
    }//GEN-LAST:event_jmiAzuriranjeOrganizacijeActionPerformed

    private void jmiBrisanjeOrganizacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBrisanjeOrganizacijeActionPerformed
        FrmBrisanjeOrganizacije fao = new FrmBrisanjeOrganizacije();
        postaviAktivniPanel(fao);
    }//GEN-LAST:event_jmiBrisanjeOrganizacijeActionPerformed

    private void jmiDodavanjeClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodavanjeClanaActionPerformed
        FrmUnosClana fuc = new FrmUnosClana();
        postaviAktivniPanel(fuc);
    }//GEN-LAST:event_jmiDodavanjeClanaActionPerformed

    private void jmiAzuriranjeClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAzuriranjeClanaActionPerformed
        FrmAzuriranjeClana fac = new FrmAzuriranjeClana();
        postaviAktivniPanel(fac);
    }//GEN-LAST:event_jmiAzuriranjeClanaActionPerformed

    private void jmiBrisanjeClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBrisanjeClanaActionPerformed
        FrmBrisanjeClana brisanjeClana = new FrmBrisanjeClana();
        postaviAktivniPanel(brisanjeClana);
    }//GEN-LAST:event_jmiBrisanjeClanaActionPerformed

    private void jmiDodavanjeZivotinjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodavanjeZivotinjeActionPerformed
        FrmUnosZivotinje fuz = new FrmUnosZivotinje();
        postaviAktivniPanel(fuz);
    }//GEN-LAST:event_jmiDodavanjeZivotinjeActionPerformed

    private void jmiAzuriranjeZivotinjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAzuriranjeZivotinjeActionPerformed
        FrmAzuriranjeZivotinje faz = new FrmAzuriranjeZivotinje();
        postaviAktivniPanel(faz);
    }//GEN-LAST:event_jmiAzuriranjeZivotinjeActionPerformed

    private void jmiBrisanjeZivotinjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBrisanjeZivotinjeActionPerformed
        FrmBrisanjeZivotinje fbz = new FrmBrisanjeZivotinje();
        postaviAktivniPanel(fbz);
    }//GEN-LAST:event_jmiBrisanjeZivotinjeActionPerformed

    private void jmiPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPretragaActionPerformed
       FrmPretraga fp = new FrmPretraga();
        postaviAktivniPanel(fp);
    }//GEN-LAST:event_jmiPretragaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGlavna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmPretraga;
    private javax.swing.JMenuItem jmiAzuriranjeClana;
    private javax.swing.JMenuItem jmiAzuriranjeOrganizacije;
    private javax.swing.JMenuItem jmiAzuriranjeZivotinje;
    private javax.swing.JMenuItem jmiBrisanjeClana;
    private javax.swing.JMenuItem jmiBrisanjeOrganizacije;
    private javax.swing.JMenuItem jmiBrisanjeZivotinje;
    private javax.swing.JMenuItem jmiDodavanjeClana;
    private javax.swing.JMenuItem jmiDodavanjeOrganizacije;
    private javax.swing.JMenuItem jmiDodavanjeZivotinje;
    private javax.swing.JMenuItem jmiPretraga;
    private javax.swing.JPanel jpPanel;
    // End of variables declaration//GEN-END:variables

    private void postaviAktivniPanel(JPanel panel) {
        if (aktivniPanel != null) {
            jpPanel.remove(aktivniPanel);
        }
        jpPanel.add(panel);
        aktivniPanel = panel;
        getContentPane().repaint();
        getContentPane().validate();
    }
    
    private void postaviImeIIkonicu() {
        setTitle("Ivana Lukic");
        ImageIcon img = new ImageIcon("dog.png");
        setIconImage(img.getImage());
    }

    private void postaviPocetniPanel() {
        FrmPretraga pretraga = new FrmPretraga();
        postaviAktivniPanel(pretraga);
    }
    
}
