/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package server;

import client.ClientConnectionInterface;
import com.google.gson.Gson;
import static java.awt.image.ImageObserver.ERROR;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Drey
 */
public class ServerInterface extends javax.swing.JFrame implements Runnable {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private static ArrayList<Socket> clients = new ArrayList<>();
    
    /**
     * Creates new form ServerInterface
     */
    public ServerInterface() {
        initComponents();
        this.setVisible(true);
        this.isClosed = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverLabel = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        ipField = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serverLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        serverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serverLabel.setText("Server");

        ipLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ipLabel.setText("IP address:");

        ipField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ipField.setText("127.0.0.1");
        ipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFieldActionPerformed(evt);
            }
        });

        portLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portLabel.setText("Port:");

        portField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        portField.setText("8000");

        startButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
        });

        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        logArea.setRows(5);
        logArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Server log:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        logArea.setDragEnabled(true);
        jScrollPane1.setViewportView(logArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipLabel)
                                    .addComponent(portLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(portField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipLabel)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ipField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(portLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(portField))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        // TODO add your handling code here:
        if (!isOnline) {
            this.isOnline = true; // boolean to start the server on run method
        } else if (isOnline) {
        logArea.append("Server already online! \n"); // if the server's already online
        }
    }//GEN-LAST:event_startButtonMouseClicked

    private void ipFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipFieldActionPerformed

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseClicked
        // TODO add your handling code here:
        if (stopButton.isEnabled()) {
            this.isOnline = false; // set boolean false to stop the startServer method on thread
            closeServer();
        } else {
            logArea.append("Doesn't have a server running. \n");
        }        
    }//GEN-LAST:event_stopButtonMouseClicked
    
    public void run() {
        while(!isClosed) {
            sleep(100);
            if(isOnline) {
                startServer();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipField;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea logArea;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JLabel serverLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
    
    private void sleep(int milliseconds) { // Adjust the sleep method from thread
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.exit(1);
        }
    }
    
    private void startServer() {
        try {
            if (serverSocket == null || serverSocket.isClosed()) { // Instance the socket server
                int port = Integer.parseInt(portField.getText());
                String hostAddress = ipField.getText();
                InetAddress address = InetAddress.getByName(hostAddress);
                serverSocket = new ServerSocket(port, ERROR, address);

                stopButton.setEnabled(true);
                startButton.setEnabled(false);
                portField.setEditable(false);
                ipField.setEditable(false);
                logArea.append("Server started!\n");
            }
            
            clientSocket = serverSocket.accept(); // accept connection from a new client
            logArea.append("A new login from Client#" + clientSocket.getPort() + ".\n");
            
            clients.add(clientSocket); // new client added to the ArrayList
            ClientThread ct = new ClientThread(clientSocket, this); // Create a thread for a new client
            ct.start(); // client thread started          
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }       
    }
    
    public void closeServer() { // close all the sockets and buffers to stop the server
        try {
            serverSocket.close();

            for (Socket socket : clients) { // loop to disconnect all client threads
                logArea.append("Client#" + socket.getPort() + " disconnected. \n");
                socket.close();
            }
            clients.removeAll(clients); // clear the client list            
            
            stopButton.setEnabled(false);
            startButton.setEnabled(true);
            portField.setEditable(true);
            ipField.setEditable(true);
            logArea.append("Server stopped. \n");
        } catch (Exception e) {
            logArea.append(e.toString());
        }
    }
    
    public class ClientThread extends Thread {

        private Socket clientSocket = null;
        private JFrame frame;

        public ClientThread(Socket clientSocket, JFrame frame) {
            this.clientSocket = clientSocket;
            this.frame = frame;
        }

        public void run() {
            try { // buffer to read 231rom client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                try {                  
                    while (true) { // print input from client
                        Gson gson = new Gson();
                        Operations operations = new Operations();
                        String clientInput = in.readLine();
                        Person person = new Person();
                        person = gson.fromJson(clientInput, Person.class); //parse from json to string
                        System.out.println("JSON from client: " + gson.toJson(person));
                        
                        if (clientInput.equals("stop")) {
                            logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                            clientSocket.close(); // Close client connection
                            clients.remove(clientSocket); // remove the client socket from ArrayList
                            in.close();
                            break;
                        }
                        
                        if (clientInput != null) {
                            PrintStream out = new PrintStream(clientSocket.getOutputStream());
                            
                            if(operations.isLogin(person.getCpf(), person.getPassword(), frame)) {
                                logArea.append("Client#" + clientSocket.getPort() + " successfully logged in! \n");
                                
                                person.setName(LoginSession.NAME);
                                person.setDate(LoginSession.DATE);
                                person.setSex(LoginSession.SEX);
                                person.setDoctor(LoginSession.DOCTOR);
                                
                                System.out.println("JSON to client: " + person);
                                person.setStatus(true);
                                out.println(gson.toJson(person));
                            }
                            else {
                                logArea.append("This CPF/password isn't registred. \n");
                                person.setStatus(false);
                                out.println(gson.toJson(person));
                                System.out.println("JSON to client: " + gson.toJson(person));
                            }
                        }  
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());

                    logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                    clientSocket.close(); // Close client connection
                    clients.remove(clientSocket); // remove the client socket from ArrayList
                    in.close();
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }    
    
    boolean isOnline = false;
    private boolean isClosed = true;
}
