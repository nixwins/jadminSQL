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

    private final String url = "jdbc:mysql://localhost:3306/information_schema";
    private final String user = "root";
    private final String password = "birone89";
    
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    
    private List databases;
    
    public DBConnect(){
        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        databases = new ArrayList();
        
        try {
            conn =  DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SHOW DATABASES");
            System.out.println(rs.toString());
            while(rs.next()){
                System.out.println(rs.next() +  " console: " );
                databases.add(rs.next());
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List getDatabases(){
        return databases;
    }
}
