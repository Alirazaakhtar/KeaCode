package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Socket socket = new Socket("localhost", 1338);
            System.out.println("Client connected");

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(socket.getInputStream());

            while (true){
               pw.println(keyborad());

                System.out.println("from server:");
                System.out.println(scanner.nextLine());


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
