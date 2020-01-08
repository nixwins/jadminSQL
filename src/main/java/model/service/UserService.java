/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import core.DBConnect;
import core.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.UserDAO;
import model.entity.User;

/**
 *
 * @author admin
 */
public class UserService extends Model implements UserDAO{
  
    @Override
    public boolean userExists(User user){
        
        boolean isResultSet = false;
        
        connection = dbConnect.createConnection(user.getUsername(), user.getPassword());
        //System.out.println("Connection ===> ", connection.toString());
        Statement stmt = null;
        
        try {
            if(connection != null){
               stmt = connection.createStatement();
               isResultSet = stmt.execute("SELECT * FROM INFORMATION_SCHEMA.user_privileges");  
            }
               
            
        } catch (SQLException ex) {
            
            System.out.println("Access denied");
            
        } finally{
            try {
                if(stmt != null && connection != null){
                    stmt.close();
                    connection.close();
                }
                    
            } catch (SQLException e) {
                
                System.out.println("ER USRDOA DB Connect " + e.getMessage());
            }
       
        }
        
        return isResultSet;
    }
    
}
