package com.company.java;

import java.io.PrintWriter;
import java.util.Scanner;

public class ServerHandler implements Runnable {

    private PrintWriter pw;


    public ServerHandler(PrintWriter pw) {
        this.pw = pw;
    }

    @Override
    public void run() {

        while(true){

            System.out.print("mig: ");
            pw.println("Client: " + keyboard());

        }

    }

    public String keyboard(){

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }
}
