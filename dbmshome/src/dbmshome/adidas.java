package dbmshome;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksha
 */
public class adidas extends javax.swing.JFrame {

    /**
     * Creates new form adidas
     */
    public adidas() {
        initComponents();
        this.setSize(910,512);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try{
   
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Sponsors where Spons_ID=10;";
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                        //jlt2.setText(rs.getString("Spons_ID"));
                        jlt1.setText("NAME OF SPONSOR:  "+rs.getString("Name"));
                        jlt3.setText("INVESTMENTS:  "+rs.getString("Investment"));
                        jlt4.setText("LENGTH OF CONTRACT:  "+rs.getString("Length_of_Contract"));
                    }
            }   
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(this,e.getMessage()); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlt1 = new javax.swing.JLabel();
        jlt3 = new javax.swing.JLabel();
        jlt4 = new javax.swing.JLabel();
        jlt2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(925, 560));
        getContentPane().setLayout(null);

        jlt1.setBackground(new java.awt.Color(255, 255, 255));
        jlt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlt1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlt1);
        jlt1.setBounds(20, 10, 870, 100);

        jlt3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlt3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlt3);
        jlt3.setBounds(10, 170, 890, 100);

        jlt4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlt4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlt4);
        jlt4.setBounds(10, 320, 890, 100);

        jlt2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlt2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlt2);
        jlt2.setBounds(580, 30, 300, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adidas.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(adidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jlt1;
    public javax.swing.JLabel jlt2;
    public javax.swing.JLabel jlt3;
    public javax.swing.JLabel jlt4;
    // End of variables declaration//GEN-END:variables
}
