package com.example.studentsketch.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    private static String url;
    private static String user;
    private static String password;
    private static Connection conn;

    public DatabaseConnectionManager() {
    }


    public static Connection getConnection(){
if (conn !=null) return conn;

        Properties prop = new Properties();

        try {

            FileInputStream propFile = new FileInputStream("src/main/resources/application.properties");

            prop.load(propFile);

            url = prop.getProperty("db.url");
            user = prop.getProperty("db.user");
            password = prop.getProperty("db.password");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            e.printStackTrace();
        }


        return conn;

    }

}
