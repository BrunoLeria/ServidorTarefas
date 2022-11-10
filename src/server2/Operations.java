package server2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Person;

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
            String mySqlQuery = "SELECT id, nome, cpf, data_nascimento, sexo, status FROM pessoa WHERE cpf = '" +
                    cpf +
                    "' AND senha = '" +
                    password +
                    "'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                LoginSession.UID = resultSet.getInt("id");
                LoginSession.NAME = resultSet.getString("nome");
                LoginSession.CPF = resultSet.getString("cpf");
                LoginSession.DATE = resultSet.getString("data_nascimento");
                LoginSession.SEX = resultSet.getString("sexo");
                //LoginSession.DOCTOR = resultSet.getBoolean("doctor");
                LoginSession.STATUS = resultSet.getBoolean("status");

                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }

        return false;
    }

    public boolean isRegister(Person pessoa, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery = "INSERT INTO db_hospital.pessoa (nome, cpf, senha, data_nascimento, sexo,status) values ("
                    + pessoa.getNome() + ", " + pessoa.getCpf() + ", " + pessoa.getSenha() + ", " + pessoa.getData()
                    + ", "
                    + pessoa.getSexo() + ", " + pessoa.getStatus() + ")";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            preparedStatement.executeUpdate();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }

        return false;
    }

}
