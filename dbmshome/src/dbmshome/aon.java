/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmshome;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aksha
 */
public class aon extends javax.swing.JFrame {

    /**
     * Creates new form aon
     */
    public aon() {
        initComponents();
        this.setSize(1330,730);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try{
   
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Sponsors where Spons_ID=12;";
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                        //jlt2.setText(rs.getString("Spons_ID"));
                        jl2.setText("NAME OF SPONSOR: "+rs.getString("Name"));
                        jl1.setText("INVESTMENTS:  "+rs.getString("Investment"));
                        jl4.setText("LENGTH OF CONTRACT:  "+rs.getString("Length_of_Contract"));
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

        jl2 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(null);

        jl2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl2);
        jl2.setBounds(190, 20, 1070, 140);

        jl1.setBackground(new java.awt.Color(255, 255, 255));
        jl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl1);
        jl1.setBounds(190, 240, 1070, 140);

        jl3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl3);
        jl3.setBounds(720, 340, 170, 50);

        jl4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl4);
        jl4.setBounds(210, 470, 1070, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/aon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 130, 1020, 420);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/Black.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setRequestFocusEnabled(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 730);

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
            java.util.logging.Logger.getLogger(aon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    // End of variables declaration//GEN-END:variables
}
