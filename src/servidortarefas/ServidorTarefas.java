/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidortarefas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Bruno
 */
public class ServidorTarefas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("--- Iniciando servidor ---");
        ServerSocket servidor = new ServerSocket(3000);

        ExecutorService threadPool = Executors.newCachedThreadPool();

        while (true) {
            Socket socket = servidor.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());

            ClientHandler clientHandler = new ClientHandler(socket, dataInputStream, dataOutputStream);
            threadPool.execute(clientHandler);

            Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();

            for (Thread thread : todasAsThreads) {
                System.out.println(thread.getName());
            }
        }

    }

}
