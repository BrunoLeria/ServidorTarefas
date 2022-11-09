/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientForm;

/**
 *
 * @author Drey
 */
public class Person {
    private String cpf;
    private String name;
    private String password;
    private String date;
    private String sex;
    private boolean doctor;
    private boolean status;

    public Person() {
        
    }
    
    public Person (String cpf, String password) {
        this.cpf = cpf;
        this.name = name;
        this.password = password;
        this.date = date;
        this.sex = sex;
        this.doctor = doctor;
        this.status = status;
    }
    
    public Person(String cpf, String name, String password, String date, String sex, boolean doctor, boolean status) {
        this.cpf = cpf;
        this.name = name;
        this.password = password;
        this.date = date;
        this.sex = sex;
        this.doctor = doctor;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }    
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
}
