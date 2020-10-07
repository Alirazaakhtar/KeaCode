package com.company.java;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ClientHandler implements Runnable {


    private Server server;
    private Socket socket;

    private JSONObject jsonObject;


    public ClientHandler(Server server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    @Override
    public void run() {




        try {

            Scanner scanner = new Scanner(socket.getInputStream());

            server.clientNames.put(socket, scanner.nextLine());

            while (true) {
                String ClientMsg = scanner.nextLine();

                // lav et objekt af den modtaget JSON besked
                Object obj = new JSONParser().parse(ClientMsg);

                jsonObject = (JSONObject) obj;
                String msg = (String) jsonObject.get("msg");

                String name = server.clientNames.get(socket);

                server.sendToAll(msg, name);


            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
}
