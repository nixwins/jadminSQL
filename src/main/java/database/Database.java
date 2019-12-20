/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Database {
    
    private Statement stmt = null;
  
  
    
    public Database(){
 
        try {
         
            stmt = new DBConnect().getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<String> getListDatabase(){
        
        List<String> listDatabase =  new ArrayList();
        
        try {
            
            ResultSet rs  = stmt.executeQuery("SHOW DATABASES");
            
            while(rs.next()){
                listDatabase.add(rs.getString("Database"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listDatabase;
    }
    
}
