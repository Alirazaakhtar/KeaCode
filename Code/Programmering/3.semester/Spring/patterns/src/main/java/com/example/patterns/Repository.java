package com.example.patterns;

public class Repository {

    public static Repository repository = new Repository();

    public static void main(String[] args) {



    }


    public static Repository getRepository(){
        return repository;
    }
}
