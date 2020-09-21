package com.company.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Password {

    String user;


    String pass;

    public boolean login(String userInput, String passInput) {


        try {
            // get connection to database
            Connection getCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlisData", "admin", "Ali010298");

            // Create statement
            Statement myState = getCon.createStatement();

            // Execute a query
            ResultSet result = myState.executeQuery("SELECT * from login");

            //initialize data
            while (result.next()) {
                user = result.getString(1);
                pass = result.getString(2);

                System.out.println(user + "  " + pass);

                if ((user.equals(userInput)) && (pass.equals(passInput))) {
                    return true;
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;

    }


    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }


}
