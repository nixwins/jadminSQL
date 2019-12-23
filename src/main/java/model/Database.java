/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import core.Model;
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
public class Database extends Model{
    
    public List<String> getListDatabase(){
        
           /// Connection conn = dbcon.getConnection();
            
            List<String> listDatabase =  new ArrayList();
            
            try {
                
                 stmt = connection.createStatement();
                 rs  = stmt.executeQuery("SHOW DATABASES");
                
                while(rs.next()){
                    listDatabase.add(rs.getString("Database"));
                    
                }
                
                shutdown();
                
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    
            return listDatabase;
    }
    
}
