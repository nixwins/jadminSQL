package database;

import  java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {

    private final String url = "jdbc:mysql://localhost:3306";
    private final String user = "root";
    private final String password = "root";
    
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    
    public DBConnect(){
        try {
            conn =  DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
