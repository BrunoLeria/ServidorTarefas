/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
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
public class PatientQueueInterface extends javax.swing.JFrame {
    Socket clientSocket;
    PrintStream out;
    String patientName;
    
    /**
     * Creates new form PatientQueueInterface
     */
    public PatientQueueInterface() {
        initComponents();
    }
    
    public PatientQueueInterface(Socket clientSocket, String patientName) throws IOException {
        initComponents();
        
        this.clientSocket = clientSocket; // bind the socket client from the other interface
        this.patientName = patientName;
        
        jLabelPatientName.setText("Please, " + patientName + ", wait...");
        
        PatientQueue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPatientName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelQueuePosition = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();
        jButtonOpenChat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PatientQueue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jLabelPatientName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPatientName.setText("Please, wait...");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Queue position:");

        jLabelQueuePosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQueuePosition.setText("Position");

        jButtonClose.setText("Disconnect");
        jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseClicked(evt);
            }
        });
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonOpenChat.setText("Open chat");
        jButtonOpenChat.setEnabled(false);
        jButtonOpenChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelQueuePosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addGap(36, 36, 36)
                .addComponent(jButtonOpenChat)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelPatientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelQueuePosition)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonOpenChat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpenChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOpenChatActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
        // TODO add your handling code here:
        try {
            if (jButtonClose.isEnabled()) {
                // TODO add your handling code here:
                out.println("14");

                clientSocket.close(); // close all the sockets from client
                out.close();

                JOptionPane.showMessageDialog(this, "Disconnected from server.");
                new ClientConnectionInterface().setVisible(true); // go back to connection page
                this.dispose(); // dispose this interface
            } else {
                JOptionPane.showMessageDialog(this, "You aren't connected on any server.");
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonCloseMouseClicked

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
            java.util.logging.Logger.getLogger(PatientQueueInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientQueueInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientQueueInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientQueueInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientQueueInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOpenChat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelQueuePosition;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void PatientQueue() throws IOException {
        JSONObject obj = new JSONObject();
        out = new PrintStream(clientSocket.getOutputStream());
        
        obj.put("code", 10);
        
        Thread threadRecebeResposta = new Thread(() -> {
            try {
                Scanner resportaServidor = new Scanner(clientSocket.getInputStream());
          
                while (resportaServidor.hasNextLine()) {
                    JSONParser parser = new JSONParser();
                    String serverResponse = resportaServidor.nextLine();
                    
                    System.out.println(serverResponse);

                    try {
                        JSONObject jsonObject = (JSONObject) parser.parse(serverResponse);

                        Map map = jsonObject; // parse from json to string

                        System.out.println("JSON from server: " + map);

                        if (map.get("position").toString().equals("0")) { // check the server response
                            jLabelQueuePosition.setText("You're the next! open the chat window.");
                            break;
                        } else { // check the server response
                            jLabelQueuePosition.setText(map.get("position").toString());
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
}
