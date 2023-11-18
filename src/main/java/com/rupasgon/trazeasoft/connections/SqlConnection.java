package com.rupasgon.trazeasoft.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/tracersoft?useSSL=false";
    static final String DB_USER = "root";
    static final String DB_PASS = "Serruch7022";
    
    
    public static Connection mySqlConnection(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
        
    }
    
}
