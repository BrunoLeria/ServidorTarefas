/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package server;

import model.Person;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import javax.swing.DefaultListModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Patient;

/**
 *
 * @author Drey
 */
public class ServerInterface extends javax.swing.JFrame implements Runnable {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private static ArrayList<Person> clients = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();
    DefaultListModel mod = new DefaultListModel();

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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPatients = new javax.swing.JList<>();

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
        portField.setText("22000");
        portField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portFieldActionPerformed(evt);
            }
        });

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
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        logArea.setRows(5);
        logArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Server log:",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        logArea.setDragEnabled(true);
        jScrollPane1.setViewportView(logArea);

        jListPatients.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patients list:",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        jListPatients.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jScrollPane2.setViewportView(jListPatients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ipLabel)
                                                                        .addComponent(portLabel))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(ipField,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                165, Short.MAX_VALUE)
                                                                        .addComponent(portField))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(stopButton,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(startButton,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(19, 19, 19))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 322,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(serverLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(19, 19, 19)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(serverLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ipLabel)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(ipField)
                                                                .addComponent(startButton,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(portLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(portField)
                                                                .addComponent(stopButton,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239,
                                                        Short.MAX_VALUE))
                                        .addComponent(jScrollPane2))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_stopButtonActionPerformed

    private void portFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_portFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_portFieldActionPerformed

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_startButtonMouseClicked
        // TODO add your handling code here:
        if (!isOnline) {
            this.isOnline = true; // boolean to start the server on run method
        } else if (isOnline) {
            logArea.append("Server already online! \n"); // if the server's already online
        }
    }// GEN-LAST:event_startButtonMouseClicked

    private void ipFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ipFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ipFieldActionPerformed

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_stopButtonMouseClicked
        // TODO add your handling code here:
        if (stopButton.isEnabled()) {
            this.isOnline = false; // set boolean false to stop the startServer method on thread
            closeServer();
        } else {
            logArea.append("Doesn't have a server running. \n");
        }
    }// GEN-LAST:event_stopButtonMouseClicked

    public void run() {
        while (!isClosed) {
            sleep(100);
            if (isOnline) {
                startServer();
            }
        }
    }

    private void orderArray() {
        patients.sort((Patient p1, Patient p2) -> {
            return p1.getPriority() - p2.getPriority();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipField;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JList<String> jListPatients;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
        } catch (InterruptedException e) {
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

            LoginSession.SOCKET = clientSocket;
            ClientThread ct = new ClientThread(clientSocket, this); // Create a thread for a new client
            ct.start(); // client thread started

        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

    public void closeServer() { // close all the sockets and buffers to stop the server
        try {
            serverSocket.close();

            for (Person client : clients) { // loop to disconnect all client threads
                logArea.append("Client#" + client.getSocket().getPort() + " disconnected. \n");
                client.getSocket().close();
            }
            clients.removeAll(clients); // clear the client list

            stopButton.setEnabled(false);
            startButton.setEnabled(true);
            portField.setEditable(true);
            ipField.setEditable(true);
            logArea.append("Server stopped. \n");
        } catch (IOException e) {
            logArea.append(e.toString());
        }
    }

    public class ClientThread extends Thread {

        private Socket clientSocket = null;
        private final JFrame frame;

        public ClientThread(Socket clientSocket, JFrame frame) {
            this.clientSocket = clientSocket;
            this.frame = frame;
        }

        @Override
        public void run() {
            try { // buffer to read 231rom client
                Scanner in = new Scanner(clientSocket.getInputStream());
                Person person = new Person();

                try {
                    while (in.hasNextLine()) { // print input from client
                        JSONParser parser = new JSONParser();

                        Operations operations = new Operations();
                        String clientInput = in.nextLine();

                        JSONObject jsonObject = (JSONObject) parser.parse(clientInput);
                        JSONObject serverResponse = new JSONObject();

                        Map map = jsonObject; // parse from json to string
                        System.out.println("JSON input: " + jsonObject);

                        //logArea.append("Client#" + clientSocket.getPort() + ": " + jsonObject + "\n");
                        PrintStream out = new PrintStream(clientSocket.getOutputStream());

                        if (clientInput != null) {
                            switch (map.get("code").toString()) {
                                case "1":
                                    System.out.println("Client#" + clientSocket.getPort() + ": Starting register.\n");

                                    person.setNome(map.get("name").toString());
                                    person.setCpf(map.get("cpf").toString());
                                    person.setSenha(map.get("password").toString());
                                    person.setData(map.get("birthday").toString());
                                    person.setSexo(map.get("sex").toString());
                                    person.setDoutor(Boolean.valueOf(map.get("doctor").toString()));

                                    System.out.println("Client#" + clientSocket.getPort() + ": Creating new person.\n");

                                    if (person.checkAllFields()) {
                                        person.convertDateToMySql();
                                        System.out
                                                .println("Client#" + clientSocket.getPort()
                                                        + ": Fields are valid.\n");
                                        System.out.println("Client#" + clientSocket.getPort()
                                                + ": Registering user on database.\n");
                                        try {
                                            operations.isRegister(person, frame);
                                            serverResponse.put("code", 101);
                                            serverResponse.put("success", true);
                                        } catch (Exception e) {
                                            serverResponse.put("code", 101);
                                            serverResponse.put("success", false);
                                            JOptionPane.showMessageDialog(frame,
                                                    "Erro ao cadastrar usuário" + e.getMessage());
                                        }
                                    } else {
                                        serverResponse.put("code", 101);
                                        serverResponse.put("success", false);
                                    }
                                    out.println(serverResponse);
                                    System.out.println("JSON to client: " + serverResponse);
                                    break;
                                case "3":
                                    person.setCpf(map.get("cpf").toString());
                                    person.setSenha(map.get("password").toString());

                                    if (Operations.isLogin(person.getCpf(), person.getSenha(), frame)) {
                                        LoginSession.STATUS = true;

                                        person.setStatus(LoginSession.STATUS);
                                        person.setNome(LoginSession.NAME);
                                        person.setData(LoginSession.DATE);
                                        person.setSexo(LoginSession.SEX);
                                        person.setDoutor(LoginSession.DOCTOR);
                                        person.setStatus(LoginSession.STATUS);
                                        person.setSocket(LoginSession.SOCKET);

                                        clients.add(person); // new client added to the ArrayList

                                        String jsonString = "{ \"code\": 103,"
                                                + " \"status\": " + person.getStatus() + ","
                                                + " \"user\": {"
                                                + " \"name\": \"" + person.getNome() + "\","
                                                + " \"cpf\": \"" + person.getCpf() + "\","
                                                + " \"birthday\": \"" + person.getData() + "\", "
                                                + " \"sex\": \"" + person.getSexo() + "\",  "
                                                + " \"doctor\": " + person.getDoutor() + " }"
                                                + " }";

                                        String serverResponseString = jsonString;
                                        out.println(serverResponseString);
                                        System.out.println("JSON to client: " + serverResponseString);
                                    } else {
                                        person.setStatus(false);
                                        serverResponse.put("code", 103);
                                        serverResponse.put("status", false);

                                        out.println(serverResponse);
                                        System.out.println("JSON to client: " + serverResponse);
                                    }
                                    break;
                                
                                case "5":
                                    for (Person p : clients) {
                                        if (p.getCpf().equals(map.get("toCpf").toString())) {
                                            PrintStream outPatient = new PrintStream(p.getSocket().getOutputStream());
                                            
                                            serverResponse.put("code", 105);
                                            serverResponse.put("success", true);
                                            
                                            person.setChat(true);

                                            out.println(serverResponse);
                                            System.out.println("JSON to Doctor: " + serverResponse);
                                            
                                            serverResponse.put("code", 1005);
                                            serverResponse.put("success", true);
                                            
                                            p.setChat(true);
                                            
                                            outPatient.println(serverResponse);
                                            System.out.println("JSON to Patient: " + serverResponse);
                                        }
                                    } 
                                    break;
                                    
                                case "6":
                                    for (Person p : clients) {
                                        if (p.getChat() == true) {
                                            PrintStream outPatient = new PrintStream(p.getSocket().getOutputStream());
                                            
                                            serverResponse.put("code", 106);
                                            serverResponse.put("position", 1);
                                            serverResponse.put("message", map.get("message").toString());                                         
                                            
                                            outPatient.println(serverResponse);
                                            System.out.println("JSON to Client: " + serverResponse);
                                        }
                                    }                                   
                                    break;
                                    
                                case "8":
                                    logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");

                                    serverResponse.put("code", 108);
                                    serverResponse.put("position", 1);
                                    
                                    for (Person p : clients) {
                                        if (p.getSocket().isConnected()) {
                                            PrintStream outPatient = new PrintStream(p.getSocket().getOutputStream());

                                            outPatient.println(serverResponse);
                                            System.out.println("JSON to Client#" +  p.getSocket().getPort() + ": " + serverResponse);
                                        }
                                    } 
                                    
                                    out.println(serverResponse);
                                    System.out.println("JSON to Client#" + clientSocket.getPort() + ": " + serverResponse);
                                    
                                    for (Person p : clients) {
                                        if (p.getSocket() == clientSocket) {
                                            clients.remove(p); // remove the client socket from ArrayList
                                            clientSocket.close(); // Close client connection
                                            break;
                                        }
                                    } 
                                    break;
                                    
                                case "9":
                                    Patient patient = new Patient();

                                    System.out.println("Client#" + clientSocket.getPort() + ": Iniciando triagem.\n");

                                    patient.setCpf(map.get("cpf").toString());
                                    patient.setDescription(map.get("description").toString());
                                    patient.setPriority(Integer.parseInt(map.get("priority").toString()));

                                    patients.add(patient);

                                    orderArray();
                                    mod.removeAllElements();

                                    for (Patient p : patients) {
                                        p.getCpf();
                                        Person p1 = Operations.findPatient(p.getCpf(), frame);
                                        System.out.println("Patient: " + p1.getNome());
                                        mod.addElement(p1.getNome());
                                    }

                                    jListPatients.setModel(mod);

                                    serverResponse.put("code", 109);
                                    serverResponse.put("success", true);

                                    out.println(serverResponse);
                                    System.out.println("JSON to client: " + serverResponse);
                                    break;

                                case "10":
                                    int position = -1;

                                    for (int i = 0; i < patients.size(); i++) {
                                        if (patients.get(i).getCpf().equals(person.getCpf())) {
                                            position = i+1;
                                        }
                                    }
                                    
                                    serverResponse.put("code", 110);
                                    serverResponse.put("position", position);

                                    out.println(serverResponse);
                                    System.out.println("JSON to client: " + serverResponse);
                                    break;
                                
                                case "12":
                                    serverResponse.put("code", 112);
                                    serverResponse.put("position", 1);
                                    
                                    out.println(serverResponse);
                                    System.out.println("JSON to client: " + serverResponse);
                                    break;

                                case "14": // responsável por fechar a conexão do cliente
                                    logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                                    clientSocket.close(); // Close client connection

                                    patients.removeIf(p -> p.getCpf().equals(person.getCpf()));
                                    mod.removeElement(person.getNome());

                                    System.out.println(Arrays.toString(patients.toArray()));

                                    clients.remove(clientSocket); // remove the client socket from ArrayList
                                    break;

                                case "18":
                                    if (!patients.isEmpty()) {
                                        orderArray();
                                        patient = patients.get(0);
                                        System.out.println("Patient: " + patient.getCpf());
                                        Person p = Operations.findPatient(patient.getCpf(), frame);
                                        System.out.println("Person: " + p.getCpf());
                                        String jsonString = "{ \"code\": 118,"
                                                + " \"success\": " + true + ","
                                                + " \"user\": {"
                                                + " \"name\": \"" + p.getNome() + "\","
                                                + " \"cpf\": \"" + p.getCpf() + "\","
                                                + " \"birthday\": \"" + p.getData() + "\", "
                                                + " \"sex\": \"" + p.getSexo() + "\",  "
                                                + " \"description\": \"" + patient.getDescription() + "\", "
                                                + " \"priority\": " + patient.getPriority() + " }"
                                                + " }";

                                        patients.remove(0);
                                        mod.removeElement(p.getNome());
                                        String serverResponseString = jsonString;
                                        out.println(serverResponseString);
                                        System.out.println("JSON to client: " + serverResponseString);
                                    } else {
                                        serverResponse.put("code", 118);
                                        serverResponse.put("success", false);
                                        out.println(serverResponse);
                                        System.out.println("JSON to client: " + serverResponse);
                                    }
                                    break;

                                default:
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                    logArea.append("Client#" + clientSocket.getPort() + " disconnected. \n");
                    clientSocket.close(); // Close client connection

                    patients.removeIf(p -> p.getCpf().equals(person.getCpf()));
                    mod.removeElement(person.getNome());

                    System.out.println(Arrays.toString(patients.toArray()));

                    clients.remove(clientSocket); // remove the client socket from ArrayList
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

    }

    boolean isOnline = false;
    private boolean isClosed = true;

}
