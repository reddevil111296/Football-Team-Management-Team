/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmshome;

import javafx.scene.paint.Color;

/**
 *
 * @author aksha
 */
public class Fans extends javax.swing.JFrame {

    static int imgc=0;
    /**
     * Creates new form Fans
     */
    public Fans() {
        initComponents();
        this.setSize(1920,1080);
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
        jLabel3 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 520, 62, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(">");
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
        jLabel3.setBounds(1790, 510, 62, 60);

        img3.setForeground(new java.awt.Color(255, 0, 51));
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/fans3.jpg"))); // NOI18N
        img3.setText("jLabel1");
        img3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "The OLD TRAFFORD FAITHFUL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(img3);
        img3.setBounds(660, 250, 630, 500);
        img3.setVisible(false);

        img2.setForeground(new java.awt.Color(255, 0, 51));
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/fans2.jpg"))); // NOI18N
        img2.setText("jLabel1");
        img2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THE POLISH REDS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(img2);
        img2.setBounds(660, 250, 630, 500);
        img2.setVisible(false);

        img1.setForeground(new java.awt.Color(255, 0, 51));
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/fans1.jpg"))); // NOI18N
        img1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STRETFORD END REDS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(img1);
        img1.setBounds(660, 250, 630, 500);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/OT1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -160, 1920, 1250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
      jLabel3.setForeground(java.awt.Color.BLUE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
jLabel3.setForeground(java.awt.Color.WHITE);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      imgc++;
   switch(imgc){
    case 0:img1.setVisible(true);
    img2.setVisible(false);
    img3.setVisible(false);break;
    case 1:img2.setVisible(true);
    img1.setVisible(false);
    img3.setVisible(false);break;
    case 2:img3.setVisible(true);
    img2.setVisible(false);
    img1.setVisible(false);break;// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked
    if(imgc>2)
    {imgc=2;
    }
    }
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
     jLabel1.setForeground(java.awt.Color.BLUE);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
jLabel1.setForeground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
           imgc--;
   switch(imgc){
    case 0:img1.setVisible(true);
    img2.setVisible(false);
    img3.setVisible(false);break;
    case 1:img2.setVisible(true);
    img1.setVisible(false);
    img3.setVisible(false);break;
    case 2:img3.setVisible(true);
    img2.setVisible(false);
    img1.setVisible(false);break;// TODO add your handling code here:
    }                                    
    if(imgc<0)
    {imgc=0;
    }   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked
    
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
            java.util.logging.Logger.getLogger(Fans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
