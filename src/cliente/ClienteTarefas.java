/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ClienteTarefas {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3000);
        System.out.println("Conexão estabelicida");

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
        socket.close();
    }

}
