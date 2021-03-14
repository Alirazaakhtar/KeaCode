package com.company.java.GroupChat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {


        try {
            Socket socket = new Socket("localhost", 1340);


            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            Listener listener = new Listener(socket);

            Thread t1 = new Thread(listener);
            t1.start();

            System.out.print("Type your name to start: ");
            pw.println(input());

            System.out.println("Type your first message:");
            System.out.print("Mig: ");

            while (true){

                pw.println(input());

            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String input(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

}
