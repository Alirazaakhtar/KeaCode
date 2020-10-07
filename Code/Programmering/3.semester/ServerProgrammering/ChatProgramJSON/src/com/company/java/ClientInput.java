package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientInput implements Runnable
{

    Socket socket;

    public ClientInput(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(socket.getInputStream());

            while (true){
                String msgFServer = scanner.nextLine();
                System.out.println(msgFServer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
