package dbmshome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksha
 */
public class Add1 extends javax.swing.JFrame {

    /**
     * Creates new form Add1
     */
    Adddet3 ad3=new Adddet3();
   Adddet4 ad4=new Adddet4();
   Adddet5 ad5=new Adddet5();
   Deledet3 de3=new Deledet3();
   Deledet4 de4=new Deledet4(); 
   Deledet5 de5=new Deledet5();
   Viewtab3 vt3=new Viewtab3();
   Viewtab4 vt4=new Viewtab4();
   Viewtab5 vt5=new Viewtab5();
    public Add1() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   HELLO ADMIN!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(727, 40, 360, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPONSORS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 170, 140, 51);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  SCOUTS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 170, 120, 51);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MEDICAL STAFF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 170, 200, 51);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 264, 156, 90);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/add.png"))); // NOI18N
        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(370, 260, 156, 90);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/add.png"))); // NOI18N
        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(630, 260, 169, 90);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/delete.png"))); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(630, 440, 169, 89);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/delete.png"))); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(370, 440, 156, 89);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/delete.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setMaximumSize(new java.awt.Dimension(109, 41));
        jButton2.setMinimumSize(new java.awt.Dimension(109, 41));
        jButton2.setPreferredSize(new java.awt.Dimension(109, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 440, 156, 89);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/update.png"))); // NOI18N
        jButton12.setText("UPDATE");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(120, 610, 156, 89);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/update.png"))); // NOI18N
        jButton11.setText("UPDATE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(370, 610, 156, 89);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/update.png"))); // NOI18N
        jButton10.setText("UPDATE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(630, 610, 169, 89);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/view.png"))); // NOI18N
        jButton3.setText("VIEW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 780, 156, 91);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/view.png"))); // NOI18N
        jButton9.setText("VIEW");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(370, 780, 156, 91);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/view.png"))); // NOI18N
        jButton8.setText("VIEW");
        jButton8.setMaximumSize(new java.awt.Dimension(125, 41));
        jButton8.setMinimumSize(new java.awt.Dimension(125, 41));
        jButton8.setPreferredSize(new java.awt.Dimension(125, 41));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(630, 780, 170, 91);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/united.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel5.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel5.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ad3.setVisible(true);
        DefaultTableModel model=(DefaultTableModel)ad3.X3.getModel();
        try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Sponsors;";
                    model.setRowCount(0);
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        String d1=rs.getString("Spons_ID");
                        model.addRow(new Object[] {d1});
                     }
                      rs.close();
                            
                            st.close();
                            conn.close();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(this,e.getMessage());

        }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ad4.setVisible(true);
        DefaultTableModel model=(DefaultTableModel)ad4.X4.getModel();
        try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Scouts;";
                    model.setRowCount(0);
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        String d1=rs.getString("SID");
                        model.addRow(new Object[] {d1});
                     }
                      rs.close();
                            
                            st.close();
                            conn.close();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(this,e.getMessage());

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ad5.setVisible(true); 
        
DefaultTableModel model=(DefaultTableModel)ad5.X5.getModel();
        try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Medical_Staff;";
                    model.setRowCount(0);
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        String d1=rs.getString("MID");
                        model.addRow(new Object[] {d1});
                     }
                      rs.close();
                            
                            st.close();
                            conn.close();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(this,e.getMessage());

        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        de5.setVisible(true);
        DefaultTableModel model=(DefaultTableModel)de5.D0.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Medical_Staff;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("MID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Gender");
                String d4=rs.getString("Designation");
                String d5=rs.getString("Specialization");
                String d6=rs.getString("Treating_PID");
                String d7=rs.getString("Age");

                model.addRow(new Object[] {d1,d2,d3,d4,d5,d6,d7});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        de4.setVisible(true);
        DefaultTableModel model=(DefaultTableModel)de4.D0.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Scouts;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("SID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Nationality");
                String d4=rs.getString("Region");
                String d5=rs.getString("Reports_CID");
               

                model.addRow(new Object[] {d1,d2,d3,d4,d5});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        de3.setVisible(true);

        DefaultTableModel model=(DefaultTableModel)de3.D0.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Sponsors;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("Spons_ID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Investment");
                String d4=rs.getString("Length_of_Contract");
                

                model.addRow(new Object[] {d1,d2,d3,d4});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String h=JOptionPane.showInputDialog(null,"Enter the Sponsor_ID for which the data has to be updated");
        UpdateInfo3 ui=new UpdateInfo3(h);

        ui.setVisible(true);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String h=JOptionPane.showInputDialog(null,"Enter the SID for which the data has to be updated");

        UpdateInfo4 ui4=new UpdateInfo4(h);

        ui4.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String h=JOptionPane.showInputDialog(null,"Enter the MID for which the data has to be updated");

        UpdateInfo5 ui5=new UpdateInfo5(h);

        ui5.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        vt5.setVisible(true);

        DefaultTableModel model=(DefaultTableModel)vt5.V1.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Medical_Staff;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("MID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Gender");
                String d4=rs.getString("Designation");
                String d5=rs.getString("Specialization");
                String d6=rs.getString("Treating_PID");
                String d7=rs.getString("Age");

                model.addRow(new Object[] {d1,d2,d3,d4,d5,d6,d7});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        vt4.setVisible(true);
        DefaultTableModel model=(DefaultTableModel)vt4.P2.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Scouts;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("SID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Nationality");
                String d4=rs.getString("Region");
                String d5=rs.getString("Reports_CID");
                

                model.addRow(new Object[] {d1,d2,d3,d4,d5});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        vt3.setVisible(true);

        DefaultTableModel model=(DefaultTableModel)vt3.P1.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
            Statement st=conn.createStatement();

            String query="Select * from Sponsors;";
            model.setRowCount(0);
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String d1=rs.getString("Spons_ID");
                String d2=rs.getString("Name");
                String d3=rs.getString("Investment");
                String d4=rs.getString("Length_of_Contract");
                
                model.addRow(new Object[] {d1,d2,d3,d4});

            }

            rs.close();

            st.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Add1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
