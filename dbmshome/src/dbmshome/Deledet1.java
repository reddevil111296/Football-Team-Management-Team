package dbmshome;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksha
 */
public class Deledet1 extends javax.swing.JFrame {

    /**
     * Creates new form Deledet1
     */
    
    public Deledet1() {
        initComponents();
        this.setSize(1920,1080);
        D1.setRowHeight(30);
        JTableHeader header = D1.getTableHeader();
        header.setFont(new Font("Tahoma", Font.PLAIN, 14));
    }
    
    void Show_User()
    {
        DefaultTableModel model1=(DefaultTableModel)D1.getModel();
          
       try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Coach;";
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        String d1=rs.getString("CID");
                        String d2=rs.getString("Name");
                        String d3=rs.getString("Gender");
                        String d4=rs.getString("Designation");
                        String d5=rs.getString("Salary");
                        String d6=rs.getString("Age");
                        String d7=rs.getString("Length_Of_Contract");
                                
                        model1.addRow(new Object[] {d1,d2,d3,d4,d5,d6,d7});                       
                        
                         
                        
                        

                            }
                     
                     
                            rs.close();
                            
                            st.close();
                            conn.close();
                            }
                                catch(Exception e){
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        C3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        C4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        C5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        C6 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        C2 = new javax.swing.JTextField();
        C7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        D1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/delete.png"))); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(860, 760, 217, 77);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    COACH DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 20, 310, 62);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CID");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 200, 180, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 290, 180, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENDER");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 390, 180, 22);

        C3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        getContentPane().add(C3);
        C3.setBounds(460, 390, 300, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESIGNATION");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 490, 180, 22);

        C4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(C4);
        C4.setBounds(460, 490, 300, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALARY");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 590, 120, 22);

        C5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        getContentPane().add(C5);
        C5.setBounds(460, 590, 300, 35);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 700, 190, 22);

        C6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(C6);
        C6.setBounds(460, 690, 300, 35);

        C1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(460, 200, 300, 35);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LENGTH OF CONTRACT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 800, 260, 22);

        C2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(460, 290, 300, 35);

        C7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        getContentPane().add(C7);
        C7.setBounds(460, 790, 300, 35);

        D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        D1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "Name", "Gender", "Designation", "Salary", "Age", "Length Of Contract"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(D1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1140, 380, 750, 350);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/united1.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1965, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                    
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    int row=D1.getSelectedRow();
                   
                    String value=(D1.getModel().getValueAt(row,0).toString());
                    
                    String query="Delete from Coach where CID="+value;
                    
                    
                    
                    PreparedStatement st=conn.prepareStatement(query);
                    
                    
                    st.executeUpdate();
                    DefaultTableModel model=(DefaultTableModel)D1.getModel();
                    model.setRowCount(0);
                    Show_User();
                    
                   
                   
        
                    
                    
                    
                    
                     
                    JOptionPane.showMessageDialog(null,"Data has been Deleted");
                    C1.setText(" ");
                    C2.setText(" ");
                    C3.setText(" ");
                    C4.setText(" ");
                    C5.setText(" ");
                    C6.setText(" ");
                    C7.setText(" ");
                    
        
        
        }
        
        
        catch(Exception e){
                                        JOptionPane.showMessageDialog(this,e.getMessage());
        }              
        
        
        
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
DefaultTableModel model2=(DefaultTableModel)D1.getModel();
        int row=D1.getSelectedRow();
        C1.setText(model2.getValueAt(row,0).toString());
        C2.setText(model2.getValueAt(row,1).toString());
        C3.setText(model2.getValueAt(row,2).toString());
        C4.setText(model2.getValueAt(row,3).toString());
        C5.setText(model2.getValueAt(row,4).toString());
        C6.setText(model2.getValueAt(row,5).toString());
        C7.setText(model2.getValueAt(row,6).toString());





        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseClicked

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
            java.util.logging.Logger.getLogger(Deledet1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deledet1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deledet1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deledet1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deledet1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField C1;
    public javax.swing.JTextField C2;
    public javax.swing.JTextField C3;
    public javax.swing.JTextField C4;
    public javax.swing.JTextField C5;
    public javax.swing.JTextField C6;
    public javax.swing.JTextField C7;
    public javax.swing.JTable D1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
