package com.company.java;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSONReader {

    public static void main(String[] args) {
        try {
            Object object = new JSONParser().parse(new FileReader("users.json"));

            JSONObject jsonObject = (JSONObject) object;
           // System.out.println(jsonObject.keySet());
            String navn = (String) jsonObject.get("navn");
            System.out.println(navn);

            JSONArray emails = (JSONArray)jsonObject.get("email");
        emails.stream().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
