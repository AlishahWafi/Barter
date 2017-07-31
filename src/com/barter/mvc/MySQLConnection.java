package com.barter.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MySQLConnection {
    // MySQL user credentials
    private static final String MYSQL_USER = "";
    private static final String MYSQL_PASS = "";

    public static final String DB_CLASS_NAME = "com.mysql.jdbc.Driver";
    public static final String CONNECTION = "jdbc:mysql://localhost/barter";

    public static Connection getConnection() throws Exception {
        Class.forName(DB_CLASS_NAME);
        return DriverManager.getConnection(CONNECTION, MYSQL_USER, MYSQL_PASS);
    }

    public static PreparedStatement getStatement(String query) throws Exception {
        return getConnection().prepareStatement(query);
    }

    public static void execute(String query) throws Exception {
        getStatement(query).executeUpdate();
    }

    public static ResultSet getResultSet(String query) throws Exception {
        return getStatement(query).executeQuery();
    }
}