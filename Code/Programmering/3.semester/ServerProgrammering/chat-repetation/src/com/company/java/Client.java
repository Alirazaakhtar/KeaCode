package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {


        try {
            Socket socket = new Socket("localhost", 1339);
            System.out.println("Client connected");


            // til at modtage chat
            Scanner scanner = new Scanner(socket.getInputStream());


            // til at sende chat
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            ServerHandler serverHandler = new ServerHandler(printWriter);

            Thread t1 = new Thread(serverHandler);
            t1.start();

            while (true) {

                System.out.println("Server: " + scanner.nextLine());


            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
