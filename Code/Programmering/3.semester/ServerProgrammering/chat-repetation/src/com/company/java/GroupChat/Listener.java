package com.company.java.GroupChat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Listener implements Runnable {

    private Socket socket;
    private Scanner scanner;

    public Listener(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            scanner = new Scanner(socket.getInputStream());


            while (true){

                System.out.println(scanner.nextLine());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
