package server;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Drey
 */
public class Operations {
    
    public static boolean isLogin(String cpf, String password, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery = "SELECT UID, cpf FROM loginForm WHERE cpf = '"+
                  cpf+
                  "' AND Password = '"+
                  password+
                  "'";  
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                LoginSession.UID = resultSet.getInt("UID");
                LoginSession.CPF = resultSet.getString("cpf");
                
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }
        
        return false;
    }
    
}
