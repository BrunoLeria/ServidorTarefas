/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteAntigo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ClienteTarefas {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 3000);
        System.out.println("Conexão estabelicida");

        Thread threadEnviaComando = new Thread(() -> {
            try {
                PrintStream saida = new PrintStream(socket.getOutputStream());
                Scanner teclado = new Scanner(System.in);
                while (teclado.hasNextLine()) {
                    String linha = teclado.nextLine();
                    if (linha.trim().equals("")) {
                        break;
                    }
                    saida.println(linha);
                }
                teclado.close();
                saida.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        Thread threadRecebeResposta = new Thread(() -> {
            try {
                Scanner resportaServidor = new Scanner(socket.getInputStream());
                while (resportaServidor.hasNextLine()) {
                    String linha = resportaServidor.nextLine();
                    System.out.println(linha);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        threadEnviaComando.start();
        threadRecebeResposta.start();

        threadEnviaComando.join();
        System.out.println("Fechando socket do cliente.");

        socket.close();
    }

}
