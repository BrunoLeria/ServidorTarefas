/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Drey
 */
public class ChatInterface extends javax.swing.JFrame {

    PrintWriter out;
    Socket clientSocket;
    Map map;

    /**
     * Creates new form ChatInterface
     */
    public ChatInterface() {
        initComponents();
    }

    public ChatInterface(Socket clientSocket, Map map) {
        initComponents();

        this.map = map;
        this.clientSocket = clientSocket;

        System.out.println(map);

        jLabelNameText.setText(map.get("name").toString());
        jLabelCPFText.setText(map.get("cpf").toString());
        jLabelSexText.setText(map.get("sex").toString());
        jLabelDataText.setText(map.get("birthday").toString());

        tResposta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSend = new javax.swing.JToggleButton();
        jButtonDisconnect = new javax.swing.JToggleButton();
        jProfilePic = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelNameText = new javax.swing.JLabel();
        jLabelCPFText = new javax.swing.JLabel();
        jLabelSexText = new javax.swing.JLabel();
        jLabelDataText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMessageLog = new javax.swing.JTextArea();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSend.setText("Send");
        jButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendMouseClicked(evt);
            }
        });

        jButtonDisconnect.setText("Disconnect");
        jButtonDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDisconnectMouseClicked(evt);
            }
        });
        jButtonDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectActionPerformed(evt);
            }
        });

        jProfilePic.setBackground(new java.awt.Color(255, 255, 255));
        jProfilePic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jProfilePicLayout = new javax.swing.GroupLayout(jProfilePic);
        jProfilePic.setLayout(jProfilePicLayout);
        jProfilePicLayout.setHorizontalGroup(
                jProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jProfilePicLayout.setVerticalGroup(
                jProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        jLabelName.setText("Name:");

        jLabelCPF.setText("CPF:");

        jLabelSex.setText("Sex:");

        jLabelData.setText("Data:");

        jLabelNameText.setText("Name");

        jLabelCPFText.setText("CPF");

        jLabelSexText.setText("Sex");

        jLabelDataText.setText("Data");

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessage);

        jTextAreaMessageLog.setColumns(20);
        jTextAreaMessageLog.setRows(5);
        jTextAreaMessageLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Message log:"));
        jScrollPane2.setViewportView(jTextAreaMessageLog);

        jButtonBack.setText("Go back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE, 105,
                                                        Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelName)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelNameText,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCPF)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabelCPFText,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelData)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelDataText,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelSex)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabelSexText,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jButtonDisconnect,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 99,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelName)
                                                                        .addComponent(jLabelNameText))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCPF)
                                                                        .addComponent(jLabelCPFText)))
                                                        .addComponent(jButtonDisconnect,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelSex)
                                                                        .addComponent(jLabelSexText))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelData)
                                                                        .addComponent(jLabelDataText)))
                                                        .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                48, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDisconnectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDisconnectActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonDisconnectActionPerformed

    private void jButtonDisconnectMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonDisconnectMouseClicked
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();

            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output

            obj.put("code", 8);

            out.println(obj); // send to the server
            System.out.println("JSON to server: " + obj);

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

                            if (Integer.parseInt(map.get("code").toString()) == 108) {
                                JOptionPane.showMessageDialog(this, "Disconnected from server.");

                                new ClientConnectionInterface().setVisible(true); // go back to connection page
                                this.dispose(); // dispose this interface

                                clientSocket.close(); // close all the sockets from client
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

        } catch (IOException ex) {
            Logger.getLogger(ChatInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButtonDisconnectMouseClicked

    private void jButtonSendMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonSendMouseClicked
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();

            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output

            String cpf = jLabelCPFText.getText();
            String message = jTextAreaMessage.getText();

            obj.put("code", 6);
            obj.put("cpf", cpf);
            obj.put("message", message);

            out.println(obj); // send to the server
            System.out.println("JSON to server: " + obj);

            jTextAreaMessage.setText("");
        } catch (IOException ex) {
            Logger.getLogger(ChatInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButtonSendMouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();

            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output

            obj.put("code", 8);

            out.println(obj); // send to the server
            System.out.println("JSON to server: " + obj);

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

                            if (Integer.parseInt(map.get("code").toString()) == 108) {
                                JOptionPane.showMessageDialog(this, "Disconnected from chat.");
                                this.dispose(); // dispose this interface
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

        } catch (IOException ex) {
            Logger.getLogger(ChatInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButtonBackActionPerformed

    public void tResposta() {
        Thread tRecebeResposta = new Thread(() -> {
            try {
                Scanner resportaServidor = new Scanner(clientSocket.getInputStream());

                while (resportaServidor.hasNextLine()) {
                    JSONParser parser = new JSONParser();
                    String serverResponse = resportaServidor.nextLine();

                    try {
                        JSONObject jsonObject = (JSONObject) parser.parse(serverResponse);

                        Map map = jsonObject; // parse from json to string

                        System.out.println("JSON from server: " + map);

                        if (Integer.parseInt(map.get("code").toString()) == 106) {
                            jTextAreaMessageLog
                                    .append(map.get("name").toString() + ": " + map.get("message").toString() + "\n");
                        }

                        if (Integer.parseInt(map.get("code").toString()) == 108) {
                            jTextAreaMessageLog.append("Client disconnected.\n");
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
        tRecebeResposta.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JToggleButton jButtonDisconnect;
    private javax.swing.JToggleButton jButtonSend;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCPFText;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDataText;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameText;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelSexText;
    private javax.swing.JPanel jProfilePic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextArea jTextAreaMessageLog;
    // End of variables declaration//GEN-END:variables
}
