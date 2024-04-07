package com.example.cafeshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    public static Connection connectDB() {

        Connection connect = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish connection to the database
            connect = DriverManager.getConnection("jdbc:mysql://localhost/Mocha", "root", "Hiru1003*");
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
        return connect;
    }}