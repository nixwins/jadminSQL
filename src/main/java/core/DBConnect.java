package core;

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

    private static final String url = "jdbc:mysql://localhost:3306/?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String user = "root";
    private static final String password = "";
    private static Connection connection = null; 


    public static Connection getConnection() {

        try {
            connection =  DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            connection = null;
        }
        
        return connection;
    }
    
    public Connection createConnection(String user, String password){
        try {
            connection =  DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            System.out.println("Error code : " + ex.getErrorCode());
        }
        
        return connection; 
    }
    
    public DBConnect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
