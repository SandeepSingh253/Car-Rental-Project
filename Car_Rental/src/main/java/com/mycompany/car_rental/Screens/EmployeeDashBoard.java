/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car_rental.Screens;

import com.mycompany.car_rental.ConnectionClass.ConnectionClass;
import constants.Values;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;

/**
 *
 * @author SONY VIAO
 */
public class EmployeeDashBoard extends javax.swing.JFrame implements Values{

    private final UserModel currentUser;

    /**
     * Creates new form EmployeeDashBoard
     */
    public EmployeeDashBoard(UserModel user) {
        currentUser=user;
        initComponents();
        tabbedPane.setSelectedComponent(profilePanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        profileUsernameLabel = new javax.swing.JLabel();
        profileUpdateProfileLabel = new javax.swing.JLabel();
        profileEnterPasswordLabel = new javax.swing.JLabel();
        profileEnterPasswordTF = new javax.swing.JTextField();
        profileupdateProfileButton = new javax.swing.JButton();
        profileCurrentUserLabel = new javax.swing.JLabel();
        profileNewUsernameLabel = new javax.swing.JLabel();
        profileNewPasswordLabel = new javax.swing.JLabel();
        profileNewUsernameTF = new javax.swing.JTextField();
        profileNewPasswordTF = new javax.swing.JTextField();
        vehiclesInternalFrame = new javax.swing.JInternalFrame();
        vehicleTableScrollPane = new javax.swing.JScrollPane();
        vehiclesTable = new javax.swing.JTable();
        optionPanel = new javax.swing.JPanel();
        vehicleButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        profileButton = new javax.swing.JButton();
        billingButton = new javax.swing.JButton();
        dashBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilePanel.setBackground(new java.awt.Color(102, 102, 102));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileUsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        profileUsernameLabel.setForeground(new java.awt.Color(0, 0, 255));
        profileUsernameLabel.setText(currentUser.getUsername());
        profilePanel.add(profileUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 255, 32));

        profileUpdateProfileLabel.setBackground(new java.awt.Color(51, 51, 51));
        profileUpdateProfileLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profileUpdateProfileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileUpdateProfileLabel.setText("Update Profile");
        profilePanel.add(profileUpdateProfileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        profileEnterPasswordLabel.setBackground(new java.awt.Color(51, 51, 51));
        profileEnterPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileEnterPasswordLabel.setText("Enter Password");
        profilePanel.add(profileEnterPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        profileEnterPasswordTF.setBackground(new java.awt.Color(51, 51, 51));
        profileEnterPasswordTF.setForeground(new java.awt.Color(255, 255, 255));
        profilePanel.add(profileEnterPasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 200, -1));

        profileupdateProfileButton.setBackground(new java.awt.Color(51, 51, 51));
        profileupdateProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileupdateProfileButton.setText("UPDATE");
        profileupdateProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileupdateProfileButtonActionPerformed(evt);
            }
        });
        profilePanel.add(profileupdateProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        profileCurrentUserLabel.setBackground(new java.awt.Color(51, 51, 51));
        profileCurrentUserLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profileCurrentUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileCurrentUserLabel.setText("Current User");
        profilePanel.add(profileCurrentUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        profileNewUsernameLabel.setBackground(new java.awt.Color(51, 51, 51));
        profileNewUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileNewUsernameLabel.setText("New Username");
        profilePanel.add(profileNewUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        profileNewPasswordLabel.setBackground(new java.awt.Color(51, 51, 51));
        profileNewPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileNewPasswordLabel.setText("New Password");
        profilePanel.add(profileNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        profileNewUsernameTF.setBackground(new java.awt.Color(51, 51, 51));
        profileNewUsernameTF.setForeground(new java.awt.Color(255, 255, 255));
        profilePanel.add(profileNewUsernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 200, -1));

        profileNewPasswordTF.setBackground(new java.awt.Color(51, 51, 51));
        profileNewPasswordTF.setForeground(new java.awt.Color(255, 255, 255));
        profilePanel.add(profileNewPasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 200, -1));

        tabbedPane.addTab("Admins", profilePanel);

        vehiclesInternalFrame.setBorder(null);
        vehiclesInternalFrame.setVisible(true);
        vehiclesInternalFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehicleTableScrollPane.setForeground(new java.awt.Color(102, 102, 102));

        vehiclesTable.setBackground(new java.awt.Color(102, 102, 102));
        vehiclesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        vehicleTableScrollPane.setViewportView(vehiclesTable);

        vehiclesInternalFrame.getContentPane().add(vehicleTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, 450));

        tabbedPane.addTab("Vehicles", vehiclesInternalFrame);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -110, 640, 560));

        optionPanel.setBackground(new java.awt.Color(153, 153, 153));
        optionPanel.setPreferredSize(new java.awt.Dimension(150, 450));
        optionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehicleButton.setBackground(new java.awt.Color(51, 51, 51));
        vehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        vehicleButton.setText("Vehicles");
        vehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleButtonActionPerformed(evt);
            }
        });
        optionPanel.add(vehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, -1));

        logOutButton.setBackground(new java.awt.Color(51, 51, 51));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("LOG OUT");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        optionPanel.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE");
        optionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 40));

        profileButton.setBackground(new java.awt.Color(51, 51, 51));
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("PROFILE");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        optionPanel.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, -1));

        billingButton.setBackground(new java.awt.Color(51, 51, 51));
        billingButton.setForeground(new java.awt.Color(255, 255, 255));
        billingButton.setText("Billing");
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });
        optionPanel.add(billingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        dashBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashBack.jpg"))); // NOI18N
        optionPanel.add(dashBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 160, 500));

        getContentPane().add(optionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileupdateProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileupdateProfileButtonActionPerformed

        String enteredPass=profileEnterPasswordTF.getText();

        String newUsername=profileNewUsernameTF.getText();
        String newPassword=profileNewPasswordTF.getText();

        //sets textfields to empty
        profileEnterPasswordTF.setText("");
        profileNewUsernameTF.setText("");
        profileNewPasswordTF.setText("");

        if(enteredPass.isBlank() || newPassword.isBlank() || newUsername.isBlank()){
            JOptionPane.showMessageDialog(null, "Empty Fields");
            return;
        }
        if(!currentUser.getPassword().equals(enteredPass)){
            JOptionPane.showMessageDialog(null, "Incorrect password");
            return;
        }
        UserModel updatedUser=new UserModel(currentUser.getID());
        updatedUser.setUsername(newUsername);
        updatedUser.setPassword(newPassword);
        updatedUser.setRole(currentUser.getRole());

        int answer = updateUser(updatedUser);

        switch (answer) {
            case USERNAME_ALREAD_IN_USE:
                JOptionPane.showMessageDialog(null, "Username already used");
                break;
            case UPDATE_SUCCESSFUL:
                LogModel userLog=new LogModel(currentUser);
                userLog.uploadLog("Updated Profile new Username "+newUsername);
                currentUser.setUsername(newUsername);
                currentUser.setPassword(newPassword);
                JOptionPane.showMessageDialog(null, "Value Updated");
                profileUsernameLabel.setText(currentUser.getUsername());
                break;
            case UPDATE_UNSUCCESSFUL:
                JOptionPane.showMessageDialog(null, "Error");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_profileupdateProfileButtonActionPerformed
    
    private int updateUser(UserModel user){
        String newUsername=user.getUsername();
        String newPassword=user.getPassword();
        int role= user.getRole();
        
        final String searchStatement = "SELECT * from users where username=?";
        try {
            PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
            searchPreparedStatement.setString(1, newUsername);

            ResultSet searhResultSet = searchPreparedStatement.executeQuery();

            while (searhResultSet.next()) {                
                return USERNAME_ALREAD_IN_USE;
            }
            final String insertStatement = "update users set `username`=?, `password`=?, `role`=? where `id`=?";
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, newPassword);
            preparedStatement.setInt(3, role);
            preparedStatement.setString(4, Integer.toString(user.getID()));

            final int isAdded = preparedStatement.executeUpdate();

            if (isAdded > 0) {
                return UPDATE_SUCCESSFUL;
            } 
        } catch (SQLException ex) {
            System.out.println("error in " + AdminDashBoard.class.getName() + " = " + ex);
        }    
        
        return UPDATE_UNSUCCESSFUL;
    }
    
    private void vehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleButtonActionPerformed
        updateVehiclesTable();
        tabbedPane.setSelectedComponent(vehiclesInternalFrame);
    }//GEN-LAST:event_vehicleButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        LogModel userLog=new LogModel(currentUser);
        userLog.uploadLog("Logged Out");
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        tabbedPane.setSelectedComponent(profilePanel);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        new BillingScreen(currentUser).setVisible(true);
        dispose();
    }//GEN-LAST:event_billingButtonActionPerformed
    
    private void updateVehiclesTable(){
    
        final String statement = "SELECT * from vehicles";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            final String[] headerName = {"ID","Model", "Number","Max Seats","Rent/Day","On Rent"};
            DefaultTableModel model = new DefaultTableModel(null, headerName){  
                @Override
                public boolean isCellEditable(int row,int column){
                 return false;   
                }
            };
            vehiclesTable.setModel(model);
            Object[] row = new Object[6];

            while (resultSet.next()) {
                row[0] = resultSet.getString("id");
                row[1] = resultSet.getString("model");
                row[2] = resultSet.getString("number");
                row[3] = resultSet.getInt("max_seats");
                row[4] = resultSet.getInt("rent_per_day");
                row[5] = resultSet.getInt("is_rented");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel dashBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel profileCurrentUserLabel;
    private javax.swing.JLabel profileEnterPasswordLabel;
    private javax.swing.JTextField profileEnterPasswordTF;
    private javax.swing.JLabel profileNewPasswordLabel;
    private javax.swing.JTextField profileNewPasswordTF;
    private javax.swing.JLabel profileNewUsernameLabel;
    private javax.swing.JTextField profileNewUsernameTF;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profileUpdateProfileLabel;
    private javax.swing.JLabel profileUsernameLabel;
    private javax.swing.JButton profileupdateProfileButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton vehicleButton;
    private javax.swing.JScrollPane vehicleTableScrollPane;
    private javax.swing.JInternalFrame vehiclesInternalFrame;
    private javax.swing.JTable vehiclesTable;
    // End of variables declaration//GEN-END:variables
}
