/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client2;

import java.io.BufferedReader;
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
import org.json.simple.parser.ParseException;

/**
 *
 * @author Drey
 */
public class PacientInterface extends javax.swing.JFrame {
    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;
    
    /**
     * Creates new form PacientInterface
     */
    public PacientInterface() {
        initComponents();
    }
    
    public PacientInterface(Socket clientSocket, Map map) {
        initComponents();
        
        this.clientSocket = clientSocket; // bind the socket client from the other interface
        
        map = (Map) map.get("user");
        jLabelPacientName.setText(map.get("name").toString());
        jLabelCpf.setText(map.get("cpf").toString());
        jLabelBirthday.setText(map.get("birthday").toString());
        jLabelSex.setText(map.get("sex").toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPacientProfile = new javax.swing.JPanel();
        jDisconnectButton = new javax.swing.JButton();
        jPanelProfilePic = new javax.swing.JPanel();
        jLabelPacientName = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelBirthday = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelPacientForm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jComboBoxPriorityLevel = new javax.swing.JComboBox<>();
        jLabelPriorityLevel = new javax.swing.JLabel();
        jButtonSendForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPacientProfile.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPacientProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabelPacientName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelPacientName.setText("Name");

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

        javax.swing.GroupLayout jPanelPacientProfileLayout = new javax.swing.GroupLayout(jPanelPacientProfile);
        jPanelPacientProfile.setLayout(jPanelPacientProfileLayout);
        jPanelPacientProfileLayout.setHorizontalGroup(
            jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPacientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDisconnectButton)
                .addContainerGap())
        );
        jPanelPacientProfileLayout.setVerticalGroup(
            jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProfilePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientProfileLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPacientName)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBirthday)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPacientProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSex)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );

        jPanelPacientForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPacientForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacient symptoms:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jComboBoxPriorityLevel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jComboBoxPriorityLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBoxPriorityLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPriorityLevelActionPerformed(evt);
            }
        });

        jLabelPriorityLevel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelPriorityLevel.setText("Priority level:");

        jButtonSendForm.setText("Send formulary");
        jButtonSendForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPacientFormLayout = new javax.swing.GroupLayout(jPanelPacientForm);
        jPanelPacientForm.setLayout(jPanelPacientFormLayout);
        jPanelPacientFormLayout.setHorizontalGroup(
            jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelPacientFormLayout.createSequentialGroup()
                        .addGroup(jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPriorityLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPriorityLevel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientFormLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jButtonSendForm)
                .addGap(174, 174, 174))
        );
        jPanelPacientFormLayout.setVerticalGroup(
            jPanelPacientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPriorityLevel)
                .addGap(1, 1, 1)
                .addComponent(jComboBoxPriorityLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSendForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPacientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPacientProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPacientProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPacientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jComboBoxPriorityLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPriorityLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPriorityLevelActionPerformed

    private void jButtonSendFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendFormMouseClicked
        // TODO add your handling code here:
        try {
            JSONObject obj = new JSONObject();
            out = new PrintWriter(clientSocket.getOutputStream(), true); // instance the output
            
            if (jTextAreaDescription.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "Please, type a description of your symptoms.");
            }
            else {
                if (jButtonSendForm.isEnabled()) {
                    String cpf = jLabelCpf.getText();
                    String description = jTextAreaDescription.getText();
                    int priority = Integer.parseInt(jComboBoxPriorityLevel.getSelectedItem().toString());

                    obj.put("code", 9);
                    obj.put("cpf", cpf);
                    obj.put("description", description);
                    obj.put("priority", priority);

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

                                    if (map.get("success").toString().equals("true")) { // check the server response
                                        JOptionPane.showMessageDialog(this, "Form sent successfully! Please wait...");
                                        jButtonSendForm.setEnabled(false);
                                        break;
                                    } else { // check the server response
                                        JOptionPane.showMessageDialog(this, "Form error.");
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
                else {
                    JOptionPane.showMessageDialog(this, "Form already sent.");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PacientInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSendFormMouseClicked

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
            java.util.logging.Logger.getLogger(PacientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacientInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSendForm;
    private javax.swing.JComboBox<String> jComboBoxPriorityLevel;
    private javax.swing.JButton jDisconnectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBirthday;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelPacientName;
    private javax.swing.JLabel jLabelPriorityLevel;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JPanel jPanelPacientForm;
    private javax.swing.JPanel jPanelPacientProfile;
    private javax.swing.JPanel jPanelProfilePic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}