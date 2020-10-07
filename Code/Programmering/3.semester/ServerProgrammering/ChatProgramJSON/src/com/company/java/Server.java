package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        new Server();

    }

    ArrayList<Socket> sockets = new ArrayList<>();
    Map<Socket, String> clientNames = new HashMap<>();

    public Server() {
        try (ServerSocket server = new ServerSocket(9090);) {

            System.out.println("Waiting for connection");

            while (true){
                Socket client = server.accept();
                System.out.println("Client connected");
                sockets.add(client);

                ClientHandler clientHandler = new ClientHandler(this, client);
                Thread t1 = new Thread(clientHandler);
                t1.start();
            }





        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String keyboardInput(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }


    public void sendToAll(String msg, String name){



        for (int i = 0; i <sockets.size() ; i++) {
            try {
                PrintWriter printWriter = new PrintWriter(sockets.get(i).getOutputStream(), true);

                printWriter.println(name + ": " + msg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
