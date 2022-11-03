/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
class ClientHandler implements Runnable {

    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Iniciando servidor:");
            Scanner entradaCliente = new Scanner(socket.getInputStream());
            PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

            while (entradaCliente.hasNextLine()) {
                System.out.println("Recebendo dados dos clientes: ");

                String comando = entradaCliente.nextLine();
                System.out.println(comando);
                switch (comando) {
                    case "c1":
                        saidaCliente.println("Confirmação comando c1.");
                        break;
                    case "c2":
                        saidaCliente.println("Confirmação comando c2.");
                        break;
                    default:
                        saidaCliente.println("Comando não encontrado.");
                        break;
                }
            }

            entradaCliente.close();
            saidaCliente.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
