/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car_rental.Screens;

import com.mycompany.car_rental.ConnectionClass.ConnectionClass;
import models.*;
import constants.Values;
import static constants.Values.MANAGER_ROLE;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY VIAO
 */
public class UpdateEmployee extends javax.swing.JFrame implements Values {

    private final UserModel currentUser;

    /**
     * Creates new form UpdateEmployee
     * @param currentUser
     */
    public UpdateEmployee(UserModel currentUser) {
        this.currentUser=currentUser;
        initComponents();
        
        updateEmployeeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addRemoveUpdateTabbedPanel = new javax.swing.JTabbedPane();
        addEmployeePanel = new javax.swing.JPanel();
        addEUnameLabel = new javax.swing.JLabel();
        addEPassLabel = new javax.swing.JLabel();
        addEmployeeUNameTF = new javax.swing.JTextField();
        addEmployeePasswordTF = new javax.swing.JTextField();
        addEmployeeButton = new javax.swing.JButton();
        addEmployeeDialogLabel = new javax.swing.JLabel();
        addEmployeeUNameDialogLabel = new javax.swing.JLabel();
        addEmployeePasswordDialogLabel = new javax.swing.JLabel();
        removeEmployeePanel = new javax.swing.JPanel();
        removeEUnameLabel = new javax.swing.JLabel();
        removeEmployeeUNameTF = new javax.swing.JTextField();
        removeEmployeeButton = new javax.swing.JButton();
        updateEmployeePanel = new javax.swing.JPanel();
        updateEmployeeUnameLabel = new javax.swing.JLabel();
        updateEmployeeNewPasswordLabel = new javax.swing.JLabel();
        updateEmployeeUnameTF = new javax.swing.JTextField();
        updateEmployeeNewPasswordTF = new javax.swing.JTextField();
        updateEmployeeUpdateButton = new javax.swing.JButton();
        updateEmployeeNewUnameTF = new javax.swing.JTextField();
        updateEmployeeNewUnameLabel = new javax.swing.JLabel();
        addRemoveUpdateEmployeeButtonPanel = new javax.swing.JPanel();
        addEmployeeAccessButton = new javax.swing.JButton();
        removeEmployeeAccessButton = new javax.swing.JButton();
        updateEmployeeAccessButton = new javax.swing.JButton();
        aRUEmployeeLabel = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        employeeTableScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addRemoveUpdateTabbedPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addRemoveUpdateTabbedPanel.setPreferredSize(new java.awt.Dimension(314, 185));

        addEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEUnameLabel.setText("Username");
        addEmployeePanel.add(addEUnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        addEPassLabel.setText("Password");
        addEmployeePanel.add(addEPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        addEmployeePanel.add(addEmployeeUNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, -1));
        addEmployeePanel.add(addEmployeePasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));

        addEmployeeButton.setText("ADD");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });
        addEmployeePanel.add(addEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        addEmployeeDialogLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        addEmployeePanel.add(addEmployeeDialogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 20));

        addEmployeeUNameDialogLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addEmployeeUNameDialogLabel.setForeground(java.awt.Color.red);
        addEmployeePanel.add(addEmployeeUNameDialogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 20, 20));

        addEmployeePasswordDialogLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addEmployeePasswordDialogLabel.setForeground(java.awt.Color.red);
        addEmployeePanel.add(addEmployeePasswordDialogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 20, 20));

        addRemoveUpdateTabbedPanel.addTab("AM", addEmployeePanel);

        removeEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeEUnameLabel.setText("Username");
        removeEmployeePanel.add(removeEUnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        removeEmployeePanel.add(removeEmployeeUNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        removeEmployeeButton.setText("REMOVE");
        removeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeButtonActionPerformed(evt);
            }
        });
        removeEmployeePanel.add(removeEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        addRemoveUpdateTabbedPanel.addTab("RM", removeEmployeePanel);

        updateEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateEmployeeUnameLabel.setText("Username");
        updateEmployeePanel.add(updateEmployeeUnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        updateEmployeeNewPasswordLabel.setText("New Password");
        updateEmployeePanel.add(updateEmployeeNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        updateEmployeePanel.add(updateEmployeeUnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, -1));
        updateEmployeePanel.add(updateEmployeeNewPasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 190, -1));

        updateEmployeeUpdateButton.setText("UPDATE");
        updateEmployeeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeUpdateButtonActionPerformed(evt);
            }
        });
        updateEmployeePanel.add(updateEmployeeUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));
        updateEmployeePanel.add(updateEmployeeNewUnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, -1));

        updateEmployeeNewUnameLabel.setText("New Username");
        updateEmployeePanel.add(updateEmployeeNewUnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        addRemoveUpdateTabbedPanel.addTab("UM", updateEmployeePanel);

        getContentPane().add(addRemoveUpdateTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -40, 620, -1));

        addRemoveUpdateEmployeeButtonPanel.setBackground(new java.awt.Color(153, 153, 153));
        addRemoveUpdateEmployeeButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEmployeeAccessButton.setText("Add Employee");
        addEmployeeAccessButton.setPreferredSize(new java.awt.Dimension(123, 22));
        addEmployeeAccessButton.setVerifyInputWhenFocusTarget(false);
        addEmployeeAccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeAccessButtonActionPerformed(evt);
            }
        });
        addRemoveUpdateEmployeeButtonPanel.add(addEmployeeAccessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 22));

        removeEmployeeAccessButton.setText("Remove Employee");
        removeEmployeeAccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeAccessButtonActionPerformed(evt);
            }
        });
        addRemoveUpdateEmployeeButtonPanel.add(removeEmployeeAccessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 22));

        updateEmployeeAccessButton.setText("Update Employee");
        updateEmployeeAccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeAccessButtonActionPerformed(evt);
            }
        });
        addRemoveUpdateEmployeeButtonPanel.add(updateEmployeeAccessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 22));

        aRUEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        aRUEmployeeLabel.setText("CRUD EMPLOYEE");
        addRemoveUpdateEmployeeButtonPanel.add(aRUEmployeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        goBackButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        goBackButton.setText("GO BACK");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        addRemoveUpdateEmployeeButtonPanel.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        getContentPane().add(addRemoveUpdateEmployeeButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTableScrollPane.setViewportView(employeeTable);

        getContentPane().add(employeeTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 620, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        addEmployeeDialogLabel.setText("");
        addEmployeeUNameDialogLabel.setText("");
        addEmployeeUNameDialogLabel.setText("");
                
        String username = addEmployeeUNameTF.getText();
        String password = addEmployeePasswordTF.getText();
        int role=EMPLOYEE_ROLE;
        
        
        
        if (username.isBlank()) {
            addEmployeeUNameDialogLabel.setText(" *");
            if (password.isBlank()) {
                addEmployeePasswordDialogLabel.setText(" *");
            }
            return;
        }
        if (password.isBlank()) {
            addEmployeePasswordDialogLabel.setText(" *");
            if (username.isBlank()) {
                addEmployeeUNameDialogLabel.setText(" *");
                return;
            }
        }
        
        int answer = addUser(username,password,role);
        
        if(answer==USERNAME_ALREAD_IN_USE){
            addEmployeeDialogLabel.setText("username already exists");
            addEmployeeDialogLabel.setForeground(Color.red);
            return;
        }
        if(answer==USER_ADDED){
            addEmployeeDialogLabel.setText("Employee successfull added!!");
            addEmployeeDialogLabel.setForeground(Color.green);
            addEmployeeUNameTF.setText("");
            addEmployeePasswordTF.setText("");
            updateEmployeeTable();
            return;
        }
        
        if(answer==USER_NOT_ADDED){
            addEmployeeDialogLabel.setText("Employee not added!!");
            addEmployeeDialogLabel.setForeground(Color.red);
            addEmployeeUNameTF.setText("");
            addEmployeePasswordTF.setText("");
        }
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void addEmployeeAccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeAccessButtonActionPerformed
        addRemoveUpdateTabbedPanel.setSelectedComponent(addEmployeePanel);
    }//GEN-LAST:event_addEmployeeAccessButtonActionPerformed

    private void removeEmployeeAccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeAccessButtonActionPerformed
        addRemoveUpdateTabbedPanel.setSelectedComponent(removeEmployeePanel);
    }//GEN-LAST:event_removeEmployeeAccessButtonActionPerformed

    private void updateEmployeeAccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeAccessButtonActionPerformed
        addRemoveUpdateTabbedPanel.setSelectedComponent(updateEmployeePanel);
    }//GEN-LAST:event_updateEmployeeAccessButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        int role=currentUser.getRole();
        if(role==ADMIN_ROLE){
            new AdminDashBoard(currentUser).setVisible(true);
            dispose();
        }else if(role==MANAGER_ROLE){
            new ManagerDashBoard(currentUser).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void removeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeButtonActionPerformed
        String username =removeEmployeeUNameTF.getText();
        UserModel user=userExist(username);
        if(user==null){
            JOptionPane.showMessageDialog(null, "No such Employee exist");
            return;
        }        
        int userRole=user.getRole();
        if(userRole!=EMPLOYEE_ROLE){
            JOptionPane.showMessageDialog(null, "No such Employee exist");
            return;
        }
        
        boolean managerDeleted=deleteUser(user.getUsername());
        
        if(managerDeleted){
            updateEmployeeTable();
            JOptionPane.showMessageDialog(null, "Employee deleted");
        }else{
            JOptionPane.showMessageDialog(null, "Employee not deleted");
        }
    }//GEN-LAST:event_removeEmployeeButtonActionPerformed

    private void updateEmployeeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeUpdateButtonActionPerformed
        String username = updateEmployeeUnameTF.getText();
        UserModel user=userExist(username);
        if(user==null){
            JOptionPane.showMessageDialog(null, "No Such User Exist");
            return;
        }
        UserModel newUser=user;
        
        String newUsername = updateEmployeeNewUnameTF.getText();
        String newPassword = updateEmployeeNewPasswordTF.getText();
        
        newUser.setUsername(newUsername);
        newUser.setPassword(newPassword);
        
        int userUpdate=updateUser(newUser);
            
        switch (userUpdate) {
            case USERNAME_ALREAD_IN_USE:
                break;
            case UPDATE_SUCCESSFUL:
                 updateEmployeeTable();
                break;
            case UPDATE_UNSUCCESSFUL:

                break;
            default:
                break;
        }
    }//GEN-LAST:event_updateEmployeeUpdateButtonActionPerformed
    
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
            System.out.println("error in " + UpdateEmployee.class.getName() + " = " + ex);
        }    
        
        return UPDATE_UNSUCCESSFUL;
    }
    
    private boolean deleteUser(String username){
        
        final String statement = "delete from users where `username`=?";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);
            preparedStatement.setString(1, username);
            int f=preparedStatement.executeUpdate();
            
            // f>0 means account deleted, f<=0 means not deleted
            return f>0;
        } catch (SQLException ex) {
                System.out.println("error in " + AdminDashBoard.class.getName() + " = " + ex);
        }
        return false;
    }
    
    private UserModel userExist(String username) {
        try {
            final String searchStatement = "SELECT * from users where username=?";
            PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
            searchPreparedStatement.setString(1, username);
            ResultSet searhResultSet = searchPreparedStatement.executeQuery();

            while (searhResultSet.next()) {
                UserModel user=new UserModel(Integer.parseInt(searhResultSet.getString("id")));
                user.setUsername(username);
                user.setPassword(searhResultSet.getString("password"));
                user.setRole(searhResultSet.getInt("role"));
                return user;
            }
        } catch (SQLException ex) {
                System.out.println("error in " + UpdateEmployee.class.getName() + " = " + ex);
        }
        return null;
    }
    
    private void updateEmployeeTable(){
        final String statement = "SELECT * from users where role=?";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);
            preparedStatement.setInt(1, EMPLOYEE_ROLE);
            ResultSet resultSet = preparedStatement.executeQuery();
            final String[] headerName = {"ID","Username", "Password"};
            DefaultTableModel model = new DefaultTableModel(null, headerName){  
                @Override
                public boolean isCellEditable(int row,int column){
                 return false;   
                }
            };
            employeeTable.setModel(model);
            Object[] row = new Object[3];

            while (resultSet.next()) {
                row[0] = resultSet.getString("id");
                row[1] = resultSet.getString("username");
                row[2] = resultSet.getString("password");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int addUser(String username,String password,int role){

        final String searchStatement = "SELECT * from users where username=?";
            
            try {
                PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
                searchPreparedStatement.setString(1, username);
                
                ResultSet searhResultSet = searchPreparedStatement.executeQuery();
                
                while (searhResultSet.next()) {
                    return USERNAME_ALREAD_IN_USE;
                }
                
                final String insertStatement = "INSERT INTO users(username, password, role) values(?,?,?)";
                PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setInt(3, role);

                final int isAdded = preparedStatement.executeUpdate();

                if (isAdded > 0) {
                    return USER_ADDED;
                }
            } catch (SQLException ex) {
                System.out.println("error in " + UpdateEmployee.class.getName() + " = " + ex);
            }
        return USER_NOT_ADDED;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aRUEmployeeLabel;
    private javax.swing.JLabel addEPassLabel;
    private javax.swing.JLabel addEUnameLabel;
    private javax.swing.JButton addEmployeeAccessButton;
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JLabel addEmployeeDialogLabel;
    private javax.swing.JPanel addEmployeePanel;
    private javax.swing.JLabel addEmployeePasswordDialogLabel;
    private javax.swing.JTextField addEmployeePasswordTF;
    private javax.swing.JLabel addEmployeeUNameDialogLabel;
    private javax.swing.JTextField addEmployeeUNameTF;
    private javax.swing.JPanel addRemoveUpdateEmployeeButtonPanel;
    private javax.swing.JTabbedPane addRemoveUpdateTabbedPanel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane employeeTableScrollPane;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel removeEUnameLabel;
    private javax.swing.JButton removeEmployeeAccessButton;
    private javax.swing.JButton removeEmployeeButton;
    private javax.swing.JPanel removeEmployeePanel;
    private javax.swing.JTextField removeEmployeeUNameTF;
    private javax.swing.JButton updateEmployeeAccessButton;
    private javax.swing.JLabel updateEmployeeNewPasswordLabel;
    private javax.swing.JTextField updateEmployeeNewPasswordTF;
    private javax.swing.JLabel updateEmployeeNewUnameLabel;
    private javax.swing.JTextField updateEmployeeNewUnameTF;
    private javax.swing.JPanel updateEmployeePanel;
    private javax.swing.JLabel updateEmployeeUnameLabel;
    private javax.swing.JTextField updateEmployeeUnameTF;
    private javax.swing.JButton updateEmployeeUpdateButton;
    // End of variables declaration//GEN-END:variables
}
