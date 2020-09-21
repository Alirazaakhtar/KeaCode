package com.example.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebappApplication.class, args);
    }


    public int getNum(int num1, int num2){
        return num1 + num2;
    }

}


