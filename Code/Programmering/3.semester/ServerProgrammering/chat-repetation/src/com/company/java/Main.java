package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1339);
            System.out.println("Server klar til client");
            Socket socket = serverSocket.accept();


            //Bruger input
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(socket.getInputStream());


            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            ClientHandler clientHandler = new ClientHandler(printWriter);

            Thread t1 = new Thread(clientHandler);
            t1.start();

            while (true) {
                // modtage chat
                System.out.println(scanner1.nextLine());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
