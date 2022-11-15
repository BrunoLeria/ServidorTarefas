package server;

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

    public static boolean isLogin(String cpf, String password, JFrame frame) throws Exception {
        boolean isLogin = false;
        Connection myConn = MySQLConnection.getConnection();
        String mySqlQuery = "SELECT id, nome, cpf, data_nascimento, sexo, doutor, status FROM pessoa WHERE cpf = '"
                +
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
            LoginSession.DOCTOR = resultSet.getBoolean("doutor");
            LoginSession.STATUS = resultSet.getBoolean("status");
            isLogin = true;
        }

        return isLogin;

    }

    public void isRegister(Person pessoa, JFrame frame) throws Exception {
        Connection myConn = MySQLConnection.getConnection();

        String mySqlQuery = "INSERT INTO db_hospital.pessoa (nome, cpf, senha, data_nascimento, sexo, doutor, status) "
                + "values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);

        preparedStatement.setString(1, pessoa.getNome());
        preparedStatement.setString(2, pessoa.getCpf());
        preparedStatement.setString(3, pessoa.getSenha());
        preparedStatement.setString(4, pessoa.getData());
        preparedStatement.setString(5, pessoa.getSexo());
        preparedStatement.setBoolean(6, pessoa.getDoutor());
        preparedStatement.setBoolean(7, pessoa.getStatus());
        preparedStatement.executeUpdate();

    }

}
