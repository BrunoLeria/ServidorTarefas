/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import client.*;

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
    private Boolean status;

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

    public Person(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
