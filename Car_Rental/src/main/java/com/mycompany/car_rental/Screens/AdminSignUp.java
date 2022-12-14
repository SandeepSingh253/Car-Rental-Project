/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car_rental.Screens;


import constants.Values;
import com.mycompany.car_rental.ConnectionClass.ConnectionClass;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY VIAO
 */
public class AdminSignUp extends javax.swing.JFrame implements Values{

    /**
     * Creates new form AdminScreen
     */
    public AdminSignUp() {
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

        jPanel1 = new javax.swing.JPanel();
        adminSignUpLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        reEnterPasswordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        reEnterPasswordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        backToLoginButton = new javax.swing.JButton();
        enterPassDialog = new javax.swing.JLabel();
        reEnterPassDialog = new javax.swing.JLabel();
        userNameDialog = new javax.swing.JLabel();
        signUpDialog = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminSignUpLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminSignUpLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        adminSignUpLabel.setForeground(new java.awt.Color(0, 0, 0));
        adminSignUpLabel.setText("Admin SignUp");
        jPanel1.add(adminSignUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        userNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNameLabel.setText("User Name");
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        reEnterPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        reEnterPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reEnterPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        reEnterPasswordLabel.setText("Re-Enter Password");
        jPanel1.add(reEnterPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        usernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextField.setForeground(new java.awt.Color(0, 0, 0));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, -1));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, -1));

        reEnterPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        reEnterPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        reEnterPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reEnterPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(reEnterPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 200, -1));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 0, 0));
        signUpButton.setText("SignUp");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        backToLoginButton.setBackground(new java.awt.Color(255, 255, 255));
        backToLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backToLoginButton.setForeground(new java.awt.Color(0, 0, 0));
        backToLoginButton.setText("Back To Login");
        backToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backToLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        enterPassDialog.setBackground(new java.awt.Color(255, 255, 255));
        enterPassDialog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        enterPassDialog.setForeground(new java.awt.Color(255, 255, 255));
        enterPassDialog.setText("empty password!");
        jPanel1.add(enterPassDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        reEnterPassDialog.setBackground(new java.awt.Color(255, 255, 255));
        reEnterPassDialog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        reEnterPassDialog.setForeground(new java.awt.Color(255, 255, 255));
        reEnterPassDialog.setText("Password not matching!");
        jPanel1.add(reEnterPassDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        userNameDialog.setBackground(new java.awt.Color(255, 255, 255));
        userNameDialog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        userNameDialog.setForeground(new java.awt.Color(255, 255, 255));
        userNameDialog.setText("empty username!");
        jPanel1.add(userNameDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        signUpDialog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        signUpDialog.setForeground(new java.awt.Color(255, 255, 255));
        signUpDialog.setText("SignUp sucessful !!");
        jPanel1.add(signUpDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 460, 450));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBackGround.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(800, 450));
        background.setMinimumSize(new java.awt.Dimension(800, 450));
        background.setPreferredSize(new java.awt.Dimension(800, 450));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        signUpButtonActionPerformed(evt);
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void reEnterPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEnterPasswordFieldActionPerformed
        signUpButtonActionPerformed(evt);
    }//GEN-LAST:event_reEnterPasswordFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        signUpButtonActionPerformed(evt);
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void backToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginButtonActionPerformed
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_backToLoginButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        reEnterPassDialog.setForeground(Color.white);
        signUpDialog.setForeground(Color.white);
        enterPassDialog.setForeground(Color.white);
        userNameDialog.setForeground(Color.white);
                
        if(!passwordField.getText().equals(reEnterPasswordField.getText())){
            reEnterPassDialog.setText("Password not matching!");
            reEnterPassDialog.setForeground(Color.red);
            passwordField.setText("");
            reEnterPasswordField.setText("");
            return;
        }
        
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        if (username.isBlank()) {
            //JOptionPane.showMessageDialog(null, "Enter username");
            userNameDialog.setText("Username missing!");
            userNameDialog.setForeground(Color.red);
        } else if (password.isBlank()) {
            //JOptionPane.showMessageDialog(null, "Enter password");
            enterPassDialog.setText("Password missing!");
            enterPassDialog.setForeground(Color.red);
        } else {
            final String searchStatement = "SELECT * from users where username=?";
            
            try {
                PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
                searchPreparedStatement.setString(1, username);
                
                ResultSet searhResultSet = searchPreparedStatement.executeQuery();
                
                while (searhResultSet.next()) {
                    //JOptionPane.showMessageDialog(null, "Email already exists");
                    signUpDialog.setText("username already exists");
                    signUpDialog.setForeground(Color.red);
                    return;
                }
                
                final String insertStatement = "INSERT INTO users(username, password, role) values(?,?,?)";
                PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setInt(3, ADMIN_ROLE);

                final int isAdded = preparedStatement.executeUpdate();

                if (isAdded > 0) {
                    //JOptionPane.showMessageDialog(null, "Value Added");
                    signUpDialog.setText("SignUp successful!!");
                    signUpDialog.setForeground(Color.green);
                    passwordField.setText("");
                    reEnterPasswordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                System.out.println("error in " + AdminSignUp.class.getName() + " = " + ex);
            }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminSignUpLabel;
    private javax.swing.JButton backToLoginButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel enterPassDialog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel reEnterPassDialog;
    private javax.swing.JPasswordField reEnterPasswordField;
    private javax.swing.JLabel reEnterPasswordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpDialog;
    private javax.swing.JLabel userNameDialog;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
