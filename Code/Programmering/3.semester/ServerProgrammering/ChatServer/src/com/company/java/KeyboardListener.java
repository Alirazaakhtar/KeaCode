package com.company.java;

import java.io.PrintWriter;
import java.util.Scanner;

public class KeyboardListener implements Runnable {
    private PrintWriter pw;

    public KeyboardListener(PrintWriter pw) {
        this.pw = pw;
    }

    @Override
    public void run() {
        // tage imod keyb. input
        // send til PW
        while (true) {
            pw.println(keyboardScan());
        }
    }
    private String keyboardScan(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine(); // "blokerer"
    }
}
