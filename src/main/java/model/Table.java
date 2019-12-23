/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import core.Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Table extends Model{


    public List<String> getAllTable(String database){
          
        List<String> tbList = new ArrayList();
          
        try {
          
            stmt.executeQuery("USE " + database);
            rs = stmt.executeQuery("SHOW TABLES");
            
            while(rs.next()){
                tbList.add(rs.getString("Tables_in_" + database));
            }
            
            shutdown();
            
        } catch (SQLException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return tbList;
    }
    
    public List<String> getTableStruct(String table){
        
        List<String> tblStruct = new ArrayList();
          
        try {
          
            //stmt.executeQuery("USE " + database);
            rs = stmt.executeQuery("select * from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME="+table);
            
            while(rs.next()){
                tblStruct.add(rs.getString("DATA_TYPE"));
            }
            
            shutdown();
            
        } catch (SQLException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return tblStruct;
    }
}
