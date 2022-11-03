/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidor;

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
        AppServidor app = new AppServidor();
        app.setVisible(true);
        app.imprime("--- Iniciando servidor ---");
        System.out.println("--- Iniciando servidor ---");
        ServerSocket servidor = new ServerSocket(3000);
        app.imprime("--- Iniciando threadPool ---");
        System.out.println("--- Iniciando threadPool ---");
        ExecutorService threadPool = Executors.newCachedThreadPool();
        while (true) {
            app.imprime("--- Iniciando socket e aguardando conexão ---");
            System.out.println("--- Iniciando socket e aguardando conexão ---");
            Socket socket = servidor.accept();
            app.setSaida(socket);
            app.imprime("--- Conexão aceita ---");
            System.out.println("--- Conexão aceita ---");
            ClientHandler clientHandler = new ClientHandler(socket);
            threadPool.execute(clientHandler);

            Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();

            for (Thread thread : todasAsThreads) {
                app.imprime(thread.getName());
                System.out.println(thread.getName());
            }
        }
    }
}
