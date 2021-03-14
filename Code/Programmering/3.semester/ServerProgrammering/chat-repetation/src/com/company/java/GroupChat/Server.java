package com.company.java.GroupChat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;


public class Server {


    private Set<Socket> socketSet = new HashSet<>();

    public static void main(String[] args) {

        new Server();

    }


    public Server() {

        try {
            ServerSocket serverSocket = new ServerSocket(1340);

            while (true){
                System.out.println("Server klar til klienter...");
                //modtager clinet
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                //indsætter den nye klient i en liste
                socketSet.add(socket);

                ClientHandler clientHandler = new ClientHandler(this, socket);

                Thread t1 = new Thread(clientHandler);
                t1.start();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendToAll(String chat){

        for(Socket s : socketSet){
            try {
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                pw.println(chat);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


    public Set<Socket> getSocketSet() {
        return socketSet;
    }

    public void setSocketSet(Set<Socket> socketSet) {
        this.socketSet = socketSet;
    }
}
