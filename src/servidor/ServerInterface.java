/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package servidor;

import java.net.*;
import java.io.*;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Drey
 */
public class ServerInterface extends javax.swing.JFrame implements Runnable {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private static ArrayList<Socket> clients = new ArrayList<>();
    private PrintWriter out;

    /**
     * Creates new form ServerInterface
     */
    public ServerInterface() {
        initComponents();
        this.setVisible(true); // Set frame on
        this.isClosed = false; // boolean to loop the run method from thread
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

        jScrollPane1 = new javax.swing.JScrollPane();
        logArea = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        serverTitle = new javax.swing.JLabel();
        ipAdressField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        logArea.setLineWrap(true);
        logArea.setRows(5);
        logArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Server log:",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        jScrollPane1.setViewportView(logArea);

        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
        });

        serverTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        serverTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serverTitle.setText("Server");

        ipAdressField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ipAdressField.setText("127.0.0.1");
        ipAdressField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IP Address:",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        portField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portField.setText("8000");
        portField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Port:",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        portField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portFieldActionPerformed(evt);
            }
        });

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane2.setViewportView(inputTextArea);

        sendButton.setText("Send");
        sendButton.setEnabled(false);
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stopButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(startButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ipAdressField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(serverTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(serverTitle)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ipAdressField, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_startButtonMouseClicked
        // TODO add your handling code here:
        if (!isOnline) {
            this.isOnline = true; // boolean to start the server on run method
        } else if (isOnline) {
            logArea.append("Server already online! \n"); // if the server's already online
        }
    }// GEN-LAST:event_startButtonMouseClicked

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_stopButtonMouseClicked
        // TODO add your handling code here:
        if (stopButton.isEnabled()) {
            this.isOnline = false; // set boolean false to stop the startServer method on thread
            closeServer();
        } else {
            logArea.append("Doesn't have a server running. \n");
        }
    }// GEN-LAST:event_stopButtonMouseClicked

    private void portFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_portFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_portFieldActionPerformed

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_sendButtonMouseClicked
        // TODO add your handling code here:
        if (sendButton.isEnabled()) {
            sendServerMessages();
        } else {
            logArea.append("Doesn't have a server running. \n");
        }
    }// GEN-LAST:event_sendButtonMouseClicked

    public void run() {
        while (!isClosed) {
            sleep(100); // add a small timeout to free up the processor
            if (isOnline) {
                startServer(); // start server
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JTextField ipAdressField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea logArea;
    private javax.swing.JTextField portField;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel serverTitle;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables

    public void startServer() {
        try {
            if (serverSocket == null || serverSocket.isClosed()) { // Instance the socket server
                int port = Integer.parseInt(portField.getText());
                String hostAddress = ipAdressField.getText();
                InetAddress address = InetAddress.getByName(hostAddress);
                serverSocket = new ServerSocket(port, ERROR, address);

                sendButton.setEnabled(true);
                stopButton.setEnabled(true);
                startButton.setEnabled(false);
                portField.setEditable(false);
                ipAdressField.setEditable(false);
                logArea.append("Server started! Waiting for connection... \n");
            }

            clientSocket = serverSocket.accept(); // accept connection from a new client
            logArea.append("Client#" + clientSocket.getPort() + " connected! \n");

            clients.add(clientSocket); // new client added to the ArrayList
            ClientThread ct = new ClientThread(clientSocket); // Create a thread for a new client
            ct.start(); // client thread started
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void closeServer() { // close all the sockets and buffers to stop the server
        try {
            serverSocket.close();
            
            for (Socket socket : clients) { //loop to disconnect all client threads
                logArea.append("Client#" + socket.getPort() + " disconnected. \n");
                socket.close();
            }
            clients.removeAll(clients); //clear the client list
            
            sendButton.setEnabled(false);
            stopButton.setEnabled(false);
            startButton.setEnabled(true);
            portField.setEditable(true);
            ipAdressField.setEditable(true);
            logArea.append("Server stopped. \n");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void sleep(int milliseconds) { // Adjust the sleep method from thread
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.exit(1);
        }
    }

    private void sendServerMessages() {
        try {
            String serverInput = "";
            serverInput = inputTextArea.getText();

            for (Socket socket : clients) { // loop to send server messages to all client threads
                PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
                saidaCliente.println(serverInput);
            }

            logArea.append("Server says: " + serverInput + "\n");
            inputTextArea.setText("");

            // out.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public class ClientThread extends Thread {

        private Socket clientSocket = null;

        public ClientThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        public void run() {
            try { // buffer to read from client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
                try {
                    while (true) { // print input from client
                        String clientInput = in.readLine();
                        
                        if (clientInput.equalsIgnoreCase("Stop")) {
                            logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                            clientSocket.close(); //Close client connection
                            clients.remove(clientSocket); //remove the client socket from ArrayList
                            in.close();
                            break;
                        }
                        logArea.append("Client#" + clientSocket.getPort() + " Says: " + clientInput + "\n");
                        
                        for (Socket socket : clients) { // loop to send messages between all clients
                            PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
                            saidaCliente.println(clientInput);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                    
                    logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                    clientSocket.close(); //Close client connection
                    clients.remove(clientSocket); //remove the client socket from ArrayList
                    in.close();
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }

    private boolean isOnline = false;
    private boolean isClosed = true;
}
