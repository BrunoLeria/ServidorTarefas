/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author Drey
 */
public class Main {

    public static void main(String[] args) {
        ServerInterface frame = new ServerInterface();
        Thread thread = new Thread(frame);
        thread.start();
    }

}
