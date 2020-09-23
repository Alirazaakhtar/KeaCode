package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Main server;
    private Socket socket;

    private Scanner scanner;

    public ClientHandler(Main server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Ny ClientHandler i gang");


        try {

            scanner = new Scanner(socket.getInputStream());


            while (true) {


                System.out.print("Client: ");
                //System.out.println(scanner.nextLine());
                String chat = scanner.nextLine();

                if (chat.equals("quit")) {
                    server.getSocketSet().remove(socket);
                } else {
                    server.sendToAll(chat);
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
