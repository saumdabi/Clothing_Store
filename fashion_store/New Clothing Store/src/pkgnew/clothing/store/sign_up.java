/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.clothing.store;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author manjeet
 */
public class sign_up extends javax.swing.JFrame {
Connection con= null;
Statement stmt = null;
ResultSet rs= null;
String DB = "jdbc:mysql://localhost/Vogue";
int n = 0;
    /**
     * Creates new form sign_up
     */
    public sign_up() {
        initComponents();
       try{ Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(DB, "root", "kvuc");
       stmt = con.createStatement();
       rs = stmt.executeQuery("select * from sign_up;");
       
       while (rs.last()){
       n = rs.getInt("user_no");
       rs.close();
       stmt.close();
       con.close();
       }
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        CreateAccount = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("* First Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 80, 20);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 60, 80, 20);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("* EMail Address:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 118, 14);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("* Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 120, 80, 14);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("* Confirm Passsword:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 170, 130, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 60, 170, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(490, 60, 190, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 110, 170, 30);

        CreateAccount.setText("Creat Account");
        CreateAccount.setEnabled(false);
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccount);
        CreateAccount.setBounds(560, 350, 130, 30);

        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("I agree to all the terms and conditions");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(330, 350, 230, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Terms & Conditions");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 160, 17);

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("*compulsory fields");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 160, 150, 14);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(490, 110, 190, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 204, 204)));
        jPanel1.setOpaque(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Premium user");
        jRadioButton1.setContentAreaFilled(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Free usage");
        jRadioButton2.setContentAreaFilled(false);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("#Premium users avail a discount of 20% on their total bill amount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 240, 380, 80);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(490, 160, 190, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Your are to accept the terms and conditions of this program so as to be an user of it. This program solely belongs to Miss Navjot Kaur and Miss Sonam, only who have the authorised right to change the program. You are only authorised to go through the content and enjoy its facilities. The contents displayed in this program are taken from some other sites and we don't sell clothes in reality.");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 260, 300, 120);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("CREATE NEW ACCOUNT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 20, 220, 26);

        jCheckBox2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setText("I would like to get the newsletters and daily deals on my e-mail");
        jCheckBox2.setContentAreaFilled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(20, 190, 370, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgnew/clothing/store/Black-Background-Wood-01-485x728.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 720, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountActionPerformed
        // TODO add your handling code here:
        try{
            n= n+1;
        String f_name = jTextField1.getText();
        String l_name = jTextField2.getText();
        String email = jTextField3.getText();
        String pass = new String(jPasswordField1.getPassword());
        String c_pass = new String(jPasswordField2.getPassword());
        String usertype;
        if (jRadioButton1.isSelected()){usertype = "Premium";}
        else {usertype = "Free";}
        if (f_name.length()== 0){ JOptionPane.showMessageDialog(null,"First name field is empty!");}
        else{
        if (email.length()== 0){ JOptionPane.showMessageDialog(null,"Give the valid E-mail address.");}
        else {
        if(jRadioButton1.isSelected()== true || jRadioButton2.isSelected()== true){String a= "insert into sign_up values("+ n + ", '"+ f_name + "' , '" + l_name + "' , '"+ email +"' , '"+ pass +"' , '"+ usertype + "' );";
        if(pass.equals(c_pass)){
            try{
                Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/Vogue","root","kvuc");
         stmt = con.createStatement();
         int b = stmt.executeUpdate(a);
         
         con.close();
            stmt.close();
            rs.close();
            String show = "You Have Successfully Signed Up With VOGUE. We Hope That You'll Enjoy Our Service.\n Your Username is :" + email + " \n Your Password is :"+ pass + "" ;
            JOptionPane.showMessageDialog(null,show);
            
            }
            catch(Exception e)
            {JOptionPane.showMessageDialog(null,e.getMessage());}
            
        }
        else { JOptionPane.showMessageDialog(null,"Fill password correctly.");
        
        }}
        else {JOptionPane.showMessageDialog(null,"Select the User Type");
        
        }
        }
        }
         
        
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jCheckBox1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            
            
            
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }//GEN-LAST:event_CreateAccountActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        CreateAccount.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
