/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Drey
 */
public class ClientConnectionInterface extends javax.swing.JFrame {

    public static Socket clientSocket;

    /**
     * Creates new form ClientInterface
     */
    public ClientConnectionInterface() {
        initComponents();
        setLocationOfFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        ipField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel.setText("Client side");

        subtitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel.setText("Connecting to the server:");

        ipLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ipLabel.setText("IP address:");

        portLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portLabel.setText("Port:");

        ipField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ipField.setText("127.0.0.1");
        ipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFieldActionPerformed(evt);
            }
        });

        portField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portField.setText("22000");

        connectButton.setText("Connect");
        connectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectButtonMouseClicked(evt);
            }
        });
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subtitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ipLabel)
                                                        .addComponent(portLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(ipField)
                                                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(clientLabel)
                                .addGap(38, 38, 38)
                                .addComponent(subtitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ipLabel)
                                        .addComponent(ipField, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(portLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(portField, javax.swing.GroupLayout.DEFAULT_SIZE, 25,
                                                Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(connectButton)
                                .addGap(24, 24, 24)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ipFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ipFieldActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_connectButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_connectButtonActionPerformed

    private void connectButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_connectButtonMouseClicked
        // TODO add your handling code here:
        try {
            String address = ipField.getText(); // get ip from interface
            int port = Integer.parseInt(portField.getText()); // convert the string from interface to int
            clientSocket = new Socket(address, port); // bind a new socket
            System.out.println(clientSocket.toString());
            System.out.println("Connected to server");
            JOptionPane.showMessageDialog(this, "Connected to server!");
            new ClientLoginInterface(clientSocket, getLocation()).setVisible(true); // change to another interface
            this.dispose(); // dispose this interface
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to connect to server.");
            System.out.println("Failed to connect to server.");
        }
    }// GEN-LAST:event_connectButtonMouseClicked

    private void setLocationOfFrame(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = ((int) rect.getMaxX() / 2) - this.getWidth();
        int y = ((int) rect.getMaxY() / 2) - this.getHeight();
        this.setLocation(x, y);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientLabel;
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField ipField;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JLabel subtitleLabel;
    // End of variables declaration//GEN-END:variables
}
