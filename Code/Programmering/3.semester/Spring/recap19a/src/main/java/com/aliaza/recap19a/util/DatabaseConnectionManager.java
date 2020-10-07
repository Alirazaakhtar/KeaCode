package com.aliaza.recap19a.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static Connection conn;


    public static Connection getConnection(){

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/persons?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "Ali010298");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
