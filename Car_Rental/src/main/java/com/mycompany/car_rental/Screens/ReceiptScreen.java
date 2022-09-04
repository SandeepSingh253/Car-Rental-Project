/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car_rental.Screens;

import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.CustomerModel;

/**
 *
 * @author SONY VIAO
 */
public class ReceiptScreen extends javax.swing.JFrame {

    private final CustomerModel customer;
    private String receiptText; 

    /**
     * Creates new form ReceiptScreen
     */
    public ReceiptScreen(CustomerModel customer) {
        this.customer=customer;
        initComponents();
        generateReceiptText();
        receiptTA.setText(receiptText);
        saveReceipt();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        receiptTA = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptTA.setEditable(false);
        receiptTA.setColumns(20);
        receiptTA.setRows(5);
        jScrollPane1.setViewportView(receiptTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 269));

        closeButton.setText("CLOSE");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 275, -1, -1));

        printButton.setText("PRINT");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 275, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void generateReceiptText(){
        receiptText = 
                "                       CarRental                        \n"
                +"date: "+customer.getRentedOn()+"\n"
                + "______________________________________________________\n"
                + "custmer details: \n"
                + "\n"
                + "Name= "+customer.getName()+"\n"
                + "Phone Number= "+customer.getPhoneNumber()+"\n"
                + "Address= "+customer.getAddress()+"\n"
                + "Vehical Rented= "+customer.getVehicleRented()+"\n"
                + "Return Date= "+customer.getRentedForDays()+"\n"
                + "\n"
                + "Amount Paid= "+customer.getRentAmount()+"\n"
                ;
       
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            receiptTA.print();
        } catch (PrinterException e) {
            Logger.getLogger(ReceiptScreen.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void saveReceipt() {
        String fileName=customer.getName()+" "+customer.getPhoneNumber()+".txt";
        final String billRecipt = receiptText;
        try {
            FileWriter fw = new FileWriter(fileName);
            for(int i=0;i<billRecipt.length();i++) {
                fw.write(billRecipt.charAt(i));
            }
            fw.close();
        } catch(IOException e) {
            Logger.getLogger(ReceiptScreen.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JTextArea receiptTA;
    // End of variables declaration//GEN-END:variables
}