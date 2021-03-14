package com.company.java.GroupChat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Server server;
    private Socket socket;


    public ClientHandler(Server server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(socket.getInputStream());

            System.out.print("Type your name: ");
            String name = scanner.nextLine();


            while (true){
                String msg = scanner.nextLine();

                server.sendToAll(name + ": " + msg);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
