package com.example.cafeshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    public static Connection connectDB() {

        try {

            String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/Mocha";
            String username = "root";
            String password = "Hiru1003*";

            Connection connect = DriverManager.getConnection(jdbcUrl, username, password); // LINK YOUR DATABASE
            System.out.println("Database connection successful.");
            return connect;

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
        return null;
    }}