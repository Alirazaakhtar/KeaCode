package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Main {
// en collection af socket, som skal bruges af alle
    private Set<Socket> socketSet = new HashSet<>();

    public static void main(String[] args) {
        // write your code here

        new Main();

    }


    public Main() {
        try (ServerSocket serverSocket = new ServerSocket(1338);) {
            while (true){
                System.out.println("Server klar til klient");
                Socket socket = serverSocket.accept();// venter op forbindelse
                //Putter alle socket i sets
                socketSet.add(socket);

                ClientHandler clientHandler = new ClientHandler(this, socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }




           // sendToAll(keyborad());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Socket> getSocketSet(){
        return socketSet;
    }

    public void sendToAll(String string){

        for(Socket socket: socketSet){
            try {
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                pw.println(string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public static String keyborad() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }


}
