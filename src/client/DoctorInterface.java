/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Socket;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Drey
 */
public class DoctorInterface extends javax.swing.JFrame {

    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;
    Map mapDoc;

    /**
     * Creates new form DoctorInterace2
     */
    public DoctorInterface() {
        initComponents();
    }

    public DoctorInterface(Socket clientSocket, Map map) {
        initComponents();

        this.clientSocket = clientSocket; // bind the socket client from the other interface

        this.mapDoc = (Map) map.get("user");
        jLabelDocName.setText("Doctor: " + this.mapDoc.get("name") + "\n");
        jLabelDocCpfText.setText(this.mapDoc.get("cpf").toString());
        jLabelDocBirthday.setText("Birthday: " + this.mapDoc.get("birthday") + "\n");
        jLabelDocSex.setText("Sex: " + this.mapDoc.get("sex") + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDoctor = new javax.swing.JPanel();
        jPanelDocProfile = new javax.swing.JPanel();
        jDisconnectButton = new javax.swing.JButton();
        jPanelProfilePic = new javax.swing.JPanel();
        jLabelDocName = new javax.swing.JLabel();
        jLabelDocCpf = new javax.swing.JLabel();
        jLabelDocBirthday = new javax.swing.JLabel();
        jLabelDocSex = new javax.swing.JLabel();
        jLabelDocCpfText = new javax.swing.JLabel();
        jPanelPatientForm = new javax.swing.JPanel();
        jPanelPacientForm = new javax.swing.JPanel();
        jNextPatientButton = new javax.swing.JButton();
        jPanelPacientProfile6 = new javax.swing.JPanel();
        jPanelProfilePic7 = new javax.swing.JPanel();
        jLabelPatientName = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelBirthday = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPriority = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonOpenChat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDocProfile.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDocProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDisconnectButton.setText("Disconnect");
        jDisconnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDisconnectButtonMouseClicked(evt);
            }
        });

        jPanelProfilePic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelProfilePicLayout = new javax.swing.GroupLayout(jPanelProfilePic);
        jPanelProfilePic.setLayout(jPanelProfilePicLayout);
        jPanelProfilePicLayout.setHorizontalGroup(
            jPanelProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanelProfilePicLayout.setVerticalGroup(
            jPanelProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelDocName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelDocName.setText("Name");

        jLabelDocCpf.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelDocCpf.setText("CPF:");

        jLabelDocBirthday.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelDocBirthday.setText("Birthday");

        jLabelDocSex.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelDocSex.setText("Sex");

        jLabelDocCpfText.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelDocCpfText.setText("CPF");

        javax.swing.GroupLayout jPanelDocProfileLayout = new javax.swing.GroupLayout(jPanelDocProfile);
        jPanelDocProfile.setLayout(jPanelDocProfileLayout);
        jPanelDocProfileLayout.setHorizontalGroup(
            jPanelDocProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDocProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDocName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDocBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jLabelDocSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDocProfileLayout.createSequentialGroup()
                        .addComponent(jLabelDocCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDocCpfText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDisconnectButton)
                .addContainerGap())
        );
        jPanelDocProfileLayout.setVerticalGroup(
            jPanelDocProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDocProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProfilePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDocProfileLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabelDocName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDocProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDocCpf)
                            .addComponent(jLabelDocCpfText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDocBirthday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDocSex)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelDoctorLayout = new javax.swing.GroupLayout(jPanelDoctor);
        jPanelDoctor.setLayout(jPanelDoctorLayout);
        jPanelDoctorLayout.setHorizontalGroup(
            jPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDocProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDoctorLayout.setVerticalGroup(
            jPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoctorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelDocProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelPatientForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPatientForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelPacientForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPacientForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jNextPatientButton.setText("Next Patient");
        jNextPatientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNextPatientButtonMouseClicked(evt);
            }
        });

        jPanelPacientProfile6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPacientProfile6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelProfilePic7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelProfilePic7Layout = new javax.swing.GroupLayout(jPanelProfilePic7);
        jPanelProfilePic7.setLayout(jPanelProfilePic7Layout);
        jPanelProfilePic7Layout.setHorizontalGroup(
            jPanelProfilePic7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanelProfilePic7Layout.setVerticalGroup(
            jPanelProfilePic7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jLabelPatientName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelPatientName.setText("Name");

        jLabelCpf.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelCpf.setText("CPF");

        jLabelBirthday.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelBirthday.setText("Birthday");

        jLabelSex.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelSex.setText("Sex");

        jLabel1.setText("Name:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data:");

        jLabel4.setText("Sex:");

        jLabel5.setText("Priority:");

        jLabelPriority.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelPriority.setText("Priority");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelPacientProfile6Layout = new javax.swing.GroupLayout(jPanelPacientProfile6);
        jPanelPacientProfile6.setLayout(jPanelPacientProfile6Layout);
        jPanelPacientProfile6Layout.setHorizontalGroup(
            jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientProfile6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientProfile6Layout.createSequentialGroup()
                        .addComponent(jPanelProfilePic7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPriority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(112, 112, 112))
                    .addGroup(jPanelPacientProfile6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanelPacientProfile6Layout.setVerticalGroup(
            jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientProfile6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProfilePic7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientProfile6Layout.createSequentialGroup()
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientName)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBirthday)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSex)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelPriority))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonOpenChat.setText("Request Chat");
        jButtonOpenChat.setEnabled(false);
        jButtonOpenChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOpenChatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPacientFormLayout = new javax.swing.GroupLayout(jPanelPacientForm);
        jPanelPacientForm.setLayout(jPanelPacientFormLayout);
        jPanelPacientFormLayout.setHorizontalGroup(
            jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPacientProfile6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNextPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonOpenChat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanelPacientFormLayout.setVerticalGroup(
            jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientFormLayout.createSequentialGroup()
                .addComponent(jPanelPacientProfile6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNextPatientButton)
                    .addComponent(jButtonOpenChat))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPatientFormLayout = new javax.swing.GroupLayout(jPanelPatientForm);
        jPanelPatientForm.setLayout(jPanelPatientFormLayout);
        jPanelPatientFormLayout.setHorizontalGroup(
            jPanelPatientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPatientFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPacientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPatientFormLayout.setVerticalGroup(
            jPanelPatientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPatientFormLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanelPacientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPatientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPatientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDisconnectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisconnectButtonMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            if (jDisconnectButton.isEnabled()) {
                // TODO add your handling code here:
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("14");

                clientSocket.close(); // close all the sockets from client
                out.close();
                if (in != null) {
                    in.close();
                }

                JOptionPane.showMessageDialog(this, "Disconnected from server.");
                new ClientConnectionInterface().setVisible(true); // go back to connection page
                this.dispose(); // dispose this interface
            } else {
                JOptionPane.showMessageDialog(this, "You aren't connected on any server.");
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jDisconnectButtonMouseClicked

    private void jNextPatientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNextPatientButtonMouseClicked
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();
            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output

            obj.put("code", 18);

            Thread threadRecebeResposta = new Thread(() -> {
                try {
                    Scanner resportaServidor = new Scanner(clientSocket.getInputStream());

                    while (resportaServidor.hasNextLine()) {
                        JSONParser parser = new JSONParser();
                        String serverResponse = resportaServidor.nextLine();

                        try {
                            JSONObject jsonObject = (JSONObject) parser.parse(serverResponse);

                            Map map = jsonObject; // parse from json to string
                            Map userMap = (Map) map.get("user");

                            System.out.println("JSON from server: " + map);

                            if (jNextPatientButton.isEnabled()) {
                            
                                if (map.get("success").toString().equals("true")) { // check the server response
                                    jLabelPatientName.setText(userMap.get("name").toString());
                                    jLabelCpf.setText(userMap.get("cpf").toString());
                                    jLabelBirthday.setText(userMap.get("birthday").toString());
                                    jLabelSex.setText(userMap.get("sex").toString());
                                    jTextAreaDescription.setText(userMap.get("description").toString());
                                    jLabelPriority.setText(userMap.get("priority").toString());

                                    jNextPatientButton.setEnabled(false);
                                    jButtonOpenChat.setEnabled(true);
                                    break;
                                } else { // check the server response
                                    JOptionPane.showMessageDialog(this, "The patient queue is empty.");
                                    break;
                                }
                            } else {
                                    JOptionPane.showMessageDialog(this, "You're already have a patient.");
                                    break;
                            }    
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            threadRecebeResposta.start();

            out.println(obj); // send to the server
            System.out.println("JSON to server: " + obj);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jNextPatientButtonMouseClicked

    private void jButtonOpenChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOpenChatMouseClicked
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();
            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output
            
            String toCpf = jLabelCpf.getText();
            String fromCpf = jLabelDocCpfText.getText();
                    
            obj.put("code", 5);
            obj.put("toCpf", toCpf);
            obj.put("fromCpf", fromCpf);
            
            Thread threadRecebeResposta = new Thread(() -> {
                try {
                    Scanner resportaServidor = new Scanner(clientSocket.getInputStream());

                    while (resportaServidor.hasNextLine()) {
                        JSONParser parser = new JSONParser();
                        String serverResponse = resportaServidor.nextLine();

                        try {
                            JSONObject jsonObject = (JSONObject) parser.parse(serverResponse);

                            Map map = jsonObject; // parse from json to string

                            System.out.println("JSON from server: " + map);

                            if (Boolean.valueOf(map.get("success").toString())) {
                                new WaitingPatient(clientSocket, mapDoc).setVisible(true);
                                this.dispose();
                                break;
                            }
                            else {
                                JOptionPane.showMessageDialog(this, "Error: Can't receive data from server.");
                            }
                            
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            threadRecebeResposta.start();
            
            out.println(obj); // send to the server
            System.out.println("JSON to server: " + obj);
            
        } catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonOpenChatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpenChat;
    private javax.swing.JButton jDisconnectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBirthday;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDocBirthday;
    private javax.swing.JLabel jLabelDocCpf;
    private javax.swing.JLabel jLabelDocCpfText;
    private javax.swing.JLabel jLabelDocName;
    private javax.swing.JLabel jLabelDocSex;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPriority;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JButton jNextPatientButton;
    private javax.swing.JPanel jPanelDocProfile;
    private javax.swing.JPanel jPanelDoctor;
    private javax.swing.JPanel jPanelPacientForm;
    private javax.swing.JPanel jPanelPacientProfile6;
    private javax.swing.JPanel jPanelPatientForm;
    private javax.swing.JPanel jPanelProfilePic;
    private javax.swing.JPanel jPanelProfilePic7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}
