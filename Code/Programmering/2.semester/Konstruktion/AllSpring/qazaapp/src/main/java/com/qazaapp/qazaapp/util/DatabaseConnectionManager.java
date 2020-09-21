package com.qazaapp.qazaapp.util;

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
    private  static Connection conn;


    public DatabaseConnectionManager(){

    }


    public static Connection getConnection(){

        Properties properties = new Properties();

        try{

            FileInputStream proFile = new FileInputStream("src/main/resources/application.properties");
            properties.load(proFile);

            url = properties.getProperty("db.url");
            user = properties.getProperty("db.user");
            password = properties.getProperty("db.password");

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e){
            System.out.println(e.getSQLState());
        }

        return conn;
    }


}
