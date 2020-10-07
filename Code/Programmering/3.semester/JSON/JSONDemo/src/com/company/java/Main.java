package com.company.java;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        JSONObject object = new JSONObject();

        object.put("Navn", "Ali Raza");
        object.put("Udd", "KEA");

        JSONArray array = new JSONArray();
        array.add("Hello");
        array.add("World");
        object.put("say Hello", array);

        JSONObject venObj = new JSONObject();
        venObj.put("Navn", "Jacob");
        venObj.put("år", 22 );

        object.put("Ven", venObj);


        // write your code here
//        JSONObject jsObject = new JSONObject();
//
//        jsObject.put("navn", "Ole");
//        jsObject.put("adresse", "Lygten 23");
//
//
//        JSONArray array = new JSONArray();
//        array.add("Ole@hotmail.com");
//        array.add("Boo@live.dk");
//        jsObject.put("Emails", array);
//
//        JSONObject ven = new JSONObject();
//        ven.put("navn", "Peter");
//        ven.put("adresse", "Lygten 200");
//
//        jsObject.put("ven", ven);
//
//
//
//        System.out.println(jsObject.toJSONString());


        try {
         PrintWriter printWriter = new PrintWriter("users.json");
         printWriter.println(object);
         printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
