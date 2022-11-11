/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server2;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Drey
 */
public class MySQLConnection {

    public static Connection getConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "db_hospital";
        String dbUrl = dbRoot + hostName + dbName;

        String hostUsername = "root";
        String hostsenha = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = ((Connection) DriverManager.getConnection(dbUrl, hostUsername, hostsenha));

        return myConn;
    }

}
