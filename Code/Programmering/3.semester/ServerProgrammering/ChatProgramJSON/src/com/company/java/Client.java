package com.company.java;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.json.simple.JSONObject;



public class Client {

    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();


        try (Socket socket = new Socket("localhost", 9090);
        ) {
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            ClientInput clientInput = new ClientInput(socket);
            Thread thread = new Thread(clientInput);
            thread.start();

            System.out.print("Type your name to start: ");
                pw.println(keyboardInput());

                while (true){

                    String chat = keyboardInput();

                    jsonObject.put("msg", chat);

                    pw.println(jsonObject.toJSONString());

                    if(chat.equals("quit")){
                        break;
                    }

                }





        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String keyboardInput(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

}
