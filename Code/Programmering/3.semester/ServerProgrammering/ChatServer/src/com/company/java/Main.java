package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try (ServerSocket serverSocket = new ServerSocket(1338);) {
            System.out.println("Server klar til klient");
            Socket socket = serverSocket.accept();


            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true){
                System.out.println("From client");
                System.out.println(scanner.nextLine());

                printWriter.println(keyborad());
            }





        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String keyborad(){

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
