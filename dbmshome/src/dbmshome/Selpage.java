/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmshome;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author aksha
 */
public class Selpage extends javax.swing.JFrame {

    /**
     * Creates new form Selpage
     */
    
    Add ad=new Add();
    Add1 ad1=new Add1();
    Home hm=new Home();
    
    public Selpage() {
        initComponents();
        B1.setOpaque(false);
        B1.setContentAreaFilled(false);
        B1.setBorderPainted(false);
        B2.setOpaque(false);
        B2.setContentAreaFilled(false);
        B2.setBorderPainted(false);
        this.setSize(1920,1080);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        B1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/team.png"))); // NOI18N
        B1.setText("TEAM DETAILS");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B1MouseExited(evt);
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(20, 550, 670, 160);

        B2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/staff.png"))); // NOI18N
        B2.setText("STAFF DETAILS");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B2MouseExited(evt);
            }
        });
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(1230, 550, 630, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("            WELCOME ADMIN, PLEASE SELECT ONE OF THE FOLLOWING TO CONTINUE!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 20, 1780, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOG OUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 780, 250, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/Manchester United Wallpaper 30.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       ad.setVisible(true);
    }//GEN-LAST:event_B1ActionPerformed

    private void B1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseEntered
        B1.setForeground(Color.red);
    }//GEN-LAST:event_B1MouseEntered

    private void B1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseExited
        B1.setForeground(Color.white);
    }//GEN-LAST:event_B1MouseExited

    private void B2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseEntered
        B2.setForeground(Color.red);
    }//GEN-LAST:event_B2MouseEntered

    private void B2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseExited
        B2.setForeground(Color.white);
        
    }//GEN-LAST:event_B2MouseExited

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        ad1.setVisible(true);
    }//GEN-LAST:event_B2ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        JOptionPane.showConfirmDialog(null,"Are you sure you wish to Log Out?",null, JOptionPane.YES_NO_OPTION);
         
        hm.setVisible(true);
        
        
        
        
        
      
        //sl.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Selpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selpage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
