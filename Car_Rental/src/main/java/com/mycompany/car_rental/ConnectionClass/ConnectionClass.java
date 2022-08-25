/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car_rental.ConnectionClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SONY VIAO
 */
public class ConnectionClass {
    private static ConnectionClass single_instance = null;
    public Connection connection;

    private ConnectionClass() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Car_Rental", "root", "");
            if (connection != null) {
                System.out.println("connected");

                String statement = "CREATE TABLE IF NOT EXISTS users(id INT NOT NULL AUTO_INCREMENT, "
                        + "username VARCHAR(255), "
                        + "password VARCHAR(255), "
                        + "role INT, "
                        + "PRIMARY KEY(id))";
                PreparedStatement preparedStatement = connection.prepareStatement(statement);
                preparedStatement.execute();
                
                statement = "CREATE TABLE IF NOT EXISTS vehicles(id INT NOT NULL AUTO_INCREMENT, "
                        + "model VARCHAR(255), "
                        + "number VARCHAR(255), "
                        + "max_seats INT,"
                        + "rent_per_day INT, "
                        + "is_rented INT,"
                        + "PRIMARY KEY(id))";
                preparedStatement = connection.prepareStatement(statement);
                preparedStatement.execute();
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ConnectionClass getInstance() {
        if (single_instance == null) {
            single_instance = new ConnectionClass();
        }
        return single_instance;
    }
}
