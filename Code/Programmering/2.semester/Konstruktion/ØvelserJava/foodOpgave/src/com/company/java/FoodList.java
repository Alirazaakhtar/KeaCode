package com.company.java;

import java.sql.*;

public class FoodList {

    String url = "jdbc:mysql://localhost:3306/AlisData";
    String user = "admin";
    String pass = "Ali010298";

    public void showAllFoodFromDatabase() {

        try {
            // Connection to database
            Connection myConnect = DriverManager.getConnection(url, user, pass);

            // Create a statement
            Statement myState = myConnect.createStatement();

            // Ececute a query
            ResultSet rs = myState.executeQuery("SELECT * FROM FoodList");

            // print All to console
            System.out.println("Food_id | Name | price | økologisk | realname");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getDouble(3) + " | " + rs.getBoolean(4) + " | " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void addFoodToDatabase(String name, double price, boolean okologisk, String real_name) {

        try {
            // Get connection to database
            Connection myConnect = DriverManager.getConnection(url, user, pass);
            // Create a statement
            Statement myState = myConnect.createStatement();
            // Execute query
            myState.executeUpdate("INSERT INTO FoodList (name, price, okologisk, real_name) VALUES('" + name + "', " + price + ", " + okologisk + ", '" + real_name + "')");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
