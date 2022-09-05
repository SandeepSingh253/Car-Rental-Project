/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.mycompany.car_rental.ConnectionClass.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SONY VIAO
 */
public class LogModel {
    private final UserModel user;

    public LogModel(UserModel user){
        this.user=user;
    }
    
    public boolean uploadLog(String toLog){
        try {               
            final String insertStatement = "INSERT INTO logs(user_id, user_name ,user_role ,log) values(?,?,?,?)";
            
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
            preparedStatement.setInt(1, user.getID());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setInt(3, user.getRole());
            preparedStatement.setString(4, toLog);
            
            
            final int isAdded = preparedStatement.executeUpdate();

            if (isAdded > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error in " + LogModel.class.getName() + " = " + ex);
        }
        return false;
    }
    
}
