package com.example.cafeshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    public static Connection connectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Mocha", "root", "Hiru1003*"); // LINK YOUR DATABASE
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }}
