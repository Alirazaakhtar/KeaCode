package com.company.java;

import java.io.PrintWriter;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private PrintWriter pw;

    private Scanner scanner = new Scanner(System.in);

    public ClientHandler(PrintWriter pw) {
        this.pw = pw;
    }

    @Override
    public void run() {



        while (true){
            System.out.print("mig: ");
            String msg = scanner.nextLine();


            pw.println(msg);

        }


    }
}
