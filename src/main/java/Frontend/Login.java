/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.UserManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anna
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        TextField_LOGIN_Username = new javax.swing.JTextField();
        PasswordField_LOGIN_Password = new javax.swing.JPasswordField();
        Label_LOGIN_Username = new javax.swing.JLabel();
        Label_LOGIN_Password = new javax.swing.JLabel();
        Button_LOGIN_Login = new javax.swing.JButton();
        Button_LOGIN_SignUp = new javax.swing.JButton();
        Label_LOGIN_SignUp = new javax.swing.JLabel();
        label_LOGIN_Login = new javax.swing.JLabel();
        label_LOGIN_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));

        TextField_LOGIN_Username.setText("bob");

        PasswordField_LOGIN_Password.setText("1234");

        Label_LOGIN_Username.setText("Username:");

        Label_LOGIN_Password.setText("Password:");

        Button_LOGIN_Login.setText("Login");
        Button_LOGIN_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LOGIN_LoginActionPerformed(evt);
            }
        });

        Button_LOGIN_SignUp.setText("SignUp");
        Button_LOGIN_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LOGIN_SignUpActionPerformed(evt);
            }
        });

        Label_LOGIN_SignUp.setText("I don't have an account");

        label_LOGIN_Login.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label_LOGIN_Login.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label_LOGIN_logo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_LOGIN_Username)
                            .addComponent(Label_LOGIN_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField_LOGIN_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_LOGIN_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_LOGIN_Login)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Button_LOGIN_Login)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label_LOGIN_SignUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_LOGIN_SignUp)
                                .addGap(21, 21, 21))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_LOGIN_logo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_LOGIN_Login)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_LOGIN_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_LOGIN_Username))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordField_LOGIN_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_LOGIN_Password))
                        .addGap(18, 18, 18)
                        .addComponent(Button_LOGIN_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_LOGIN_SignUp)
                            .addComponent(Label_LOGIN_SignUp))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_LOGIN_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LOGIN_LoginActionPerformed
        try {
            //Get from frontend
            String user = TextField_LOGIN_Username.getText();
            String password = PasswordField_LOGIN_Password.getText();
            //Check withh backend
            if (UserManager.checkLogin(user, password)) {
                //Move to next screen
                new UI().setVisible(true);
                //Closes Login screen
                this.dispose();
            }

        } catch (Exception ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_LOGIN_LoginActionPerformed

    private void Button_LOGIN_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LOGIN_SignUpActionPerformed
        try {

            SignUp SignUpFrame = new SignUp();
            SignUpFrame.setVisible(true);
            SignUpFrame.pack();
            SignUpFrame.setLocationRelativeTo(null);
            this.dispose();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_Button_LOGIN_SignUpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_LOGIN_Login;
    private javax.swing.JButton Button_LOGIN_SignUp;
    private javax.swing.JLabel Label_LOGIN_Password;
    private javax.swing.JLabel Label_LOGIN_SignUp;
    private javax.swing.JLabel Label_LOGIN_Username;
    private javax.swing.JPasswordField PasswordField_LOGIN_Password;
    private javax.swing.JTextField TextField_LOGIN_Username;
    private javax.swing.JLabel label_LOGIN_Login;
    private javax.swing.JLabel label_LOGIN_logo;
    // End of variables declaration//GEN-END:variables
}
