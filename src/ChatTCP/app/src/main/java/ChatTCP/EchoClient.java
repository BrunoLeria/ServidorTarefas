/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatTCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Drey
 */
public class EchoClient {
    
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            try (Socket cs = new Socket(address, 8000)) {
                System.out.println("Connected! Server ip address: " + address.getHostAddress());
                String inputClient;
                String serverMessage;
                PrintWriter out;
                BufferedReader in;               
                
                do {
                    out = new PrintWriter(cs.getOutputStream(), true);
                    System.out.println("Waiting for server messages...");
                                        
                    in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
                    serverMessage = in.readLine();
                    System.out.println("Server says: " + serverMessage);
                    
                    System.out.println("Type your message: ");
                    Scanner input = new Scanner(System.in);
                    inputClient = input.nextLine();
                    
                    out.println(inputClient);

                }while(!inputClient.equalsIgnoreCase("Stop")); //Type stop to disconnect
                
                out.close();
            }
            
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
}
