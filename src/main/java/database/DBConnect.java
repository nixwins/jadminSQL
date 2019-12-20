package database;

import  java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {

    private final String url = "jdbc:mysql://localhost:3306/?serverTimezone=Europe/Moscow&useSSL=false";
    private final String user = "root";
    private final String password = "birone89";
    private  Connection connection = null;

    public Connection getConnection() {
        return connection;
    }
    
    public DBConnect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        try {
            connection =  DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
