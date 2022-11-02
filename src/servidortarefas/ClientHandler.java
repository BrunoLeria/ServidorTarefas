/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidortarefas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
class ClientHandler implements Runnable {

    Socket socket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;

    public ClientHandler(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.socket = socket;
        this.dataInputStream = dataInputStream;
        this.dataOutputStream = dataOutputStream;
    }

    @Override
    public void run() {
        try {
            System.out.println("servidortarefas.ClientHandler.run()");
            Scanner entradaCliente = new Scanner(socket.getInputStream());

            while (entradaCliente.hasNextLine()) {
                String comando = entradaCliente.nextLine();
                System.out.println(comando);
            }

            entradaCliente.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
