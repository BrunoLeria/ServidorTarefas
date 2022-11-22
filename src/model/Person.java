/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.net.Socket;

/**
 *
 * @author Drey
 */
public class Person {

    // Nome, CPF, senha, data de nascimento, sexo, status "médico"
    private String nome;
    private String cpf;
    private String senha;
    private String data;
    private String sexo;
    private Boolean doutor;
    private Boolean status;
    private Socket socket;

    public Person() {

    }

    public Person(String nome, String cpf, String senha, String data, String sexo, Boolean status) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.data = data;
        this.sexo = sexo;
        this.status = status;
    }

    public Person(String nome, String cpf, String senha, String data, String sexo, Boolean doutor, Boolean status) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.data = data;
        this.sexo = sexo;
        this.doutor = doutor;
        this.status = status;
    }

    public Person(String nome, String cpf, String senha, String data, String sexo, Boolean doutor, Boolean status, Socket socket) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.data = data;
        this.sexo = sexo;
        this.doutor = doutor;
        this.status = status;
        this.socket = socket;
    }
    
    public Person(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDoutor() {
        return doutor;
    }

    public void setDoutor(Boolean doutor) {
        this.doutor = doutor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean checkAllFields() {
        return !(this.nome == null
                || this.nome.equals("")
                || this.cpf == null
                || this.cpf.equals("")
                || this.senha == null
                || this.senha.equals("")
                || this.data == null
                || this.data.equals("")
                || this.sexo == null
                || this.sexo.equals("")
                || this.status == null);
    }

    public void convertDateToMySql() throws Exception {
        this.data = this.data.substring(4) + "-" + this.data.subSequence(2, 4) + "-" + this.data.subSequence(0, 2);
        System.out.println(this.data);
    }
}
