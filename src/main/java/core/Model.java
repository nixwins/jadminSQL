/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.Connection;
import java.sql.ResultSet;
import model.Database;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Model {
        
    protected DBConnect dbcon = null;
    protected Connection connection;
    protected Statement stmt;
    protected ResultSet rs;
    
    public Model(){
 
        try {
            dbcon = new DBConnect();
            connection = dbcon.getConnection();
            stmt = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void shutdown(){
    
        try {
            
            rs.close();
            stmt.close();
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
