/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Drey
 */
public class ClientLoginInterface extends javax.swing.JFrame {
    private PrintWriter out; // buffer to print output
    private BufferedReader in; // buffer to read input
    private Socket clientSocket; // socket from client

    /**
     * Creates new form ClientLoginInterface
     */
    public ClientLoginInterface() {
        initComponents();
    }

    public ClientLoginInterface(Socket clientSocket, Point position) {
        initComponents();
        this.setLocation(position);
        this.clientSocket = clientSocket; // bind the socket client from the other interface

        Random rand = new Random();
        int randNum = rand.nextInt(6) + 1;

        jFormattedcpfField.setText("000.000.000-0" + randNum);
        senhaField.setText("123456");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        registerButton1 = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        jFormattedcpfField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel.setText("Client side");

        cpfLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cpfLabel.setText("CPF:");

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        senhaLabel.setText("senha:");

        registerButton1.setText("Register now");
        registerButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButton1MouseClicked(evt);
            }
        });
        registerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButton1ActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First login? ");

        senhaField.setToolTipText("");
        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });

        try {
            jFormattedcpfField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedcpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedcpfFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaLabel)
                            .addComponent(cpfLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jFormattedcpfField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton1)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(jFormattedcpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(senhaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(senhaField)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(registerButton1))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedcpfFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFormattedcpfFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jFormattedcpfFieldActionPerformed

    private void registerButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerButton1MouseClicked
        if (registerButton1.isEnabled()) {
            new ClientRegisterInterface(clientSocket, this, getLocation()).setVisible(true); // change to another interface
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(this, "You're already logged in!");
        }
    }// GEN-LAST:event_registerButton1MouseClicked

    private void registerButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_registerButton1ActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        if (loginButton.isEnabled()) {
            try {
                JSONObject obj = new JSONObject();

                out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output
                String cpf = jFormattedcpfField.getText().replace("-", "").replace(".", ""); // get cpf from interface
                String password = senhaField.getText(); // get password from interface

                if (cpf.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "Insert your login and password.");
                } else {
                    obj.put("code", 3);
                    obj.put("cpf", cpf);
                    obj.put("password", password);

                    Thread threadRecebeResposta = new Thread(() -> {
                        try {
                            Scanner resportaServidor = new Scanner(clientSocket.getInputStream());
                            
                            while (resportaServidor.hasNextLine()) {
                                JSONParser parser = new JSONParser();
                                String serverResponse = resportaServidor.nextLine();
                                
                                try {
                                    JSONObject jsonObject = (JSONObject) parser.parse(serverResponse);
                                                                    
                                    System.out.println("Recebido: " + jsonObject);
                                    Map map = jsonObject; // parse from json to string

                                    System.out.println("JSON from server: " + map);

                                    if (map.get("status").toString().equals("true")) { // check the server response
                                        JOptionPane.showMessageDialog(this, "Successfully logged in!");
                                        loginButton.setEnabled(false);
                                        registerButton1.setEnabled(false);
                                        
                                        Map userMap = (Map) map.get("user");
                                        
                                        if (userMap.get("doctor").toString().equals("true")) {
                                            new DoctorInterface(clientSocket, map, getLocation()).setVisible(true);
                                            this.dispose();
                                        }

                                        else {
                                            new PatientInterface(clientSocket, map, getLocation()).setVisible(true);
                                            this.dispose();
                                        }
                                        
                                        break;
                                    } else { // check the server response
                                        JOptionPane.showMessageDialog(this, "This CPF/password isn't registred.");
                                        break;
                                    }
                                } catch (ParseException ex) {
                                    Logger.getLogger(ClientLoginInterface.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

                    threadRecebeResposta.start();

                    out.println(obj); // send to the server
                    System.out.println("JSON to server: " + obj);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You're already logged in!");
        }
    }// GEN-LAST:event_loginButtonMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_logoutButtonActionPerformed

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_senhaFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_senhaFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientLabel;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JFormattedTextField jFormattedcpfField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton1;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
