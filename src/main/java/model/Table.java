/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import core.Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Column;

/**
 *
 * @author admin
 */
public class Table extends Model{
    private Statement stmt = null;
    private ResultSet rs = null;

    public List<String> getAllTable(String database){
          
        List<String> tbList = new ArrayList();
          
        try {
           stmt = connection.createStatement();
          
            stmt.executeQuery("USE " + database);
            rs = stmt.executeQuery("SHOW TABLES");
            
            while(rs.next()){
                tbList.add(rs.getString("Tables_in_" + database));
            }
            
            //shutdown();
            
        } catch (Exception ex) {
        
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
     
        }
        
         return tbList;
    }
    
    public List<Column> getTableStruct(String table){
        
        List<Column> tblStructList = new ArrayList();
          
        try {
               stmt = connection.createStatement();
          
            rs = stmt.executeQuery("select * from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME='"+table + "'");
                    
            while(rs.next()){
           
                tblStructList.add(new Column(   rs.getString("COLUMN_NAME"),
                                                rs.getString("DATA_TYPE"),
                                                rs.getString("COLUMN_KEY"),
                                                rs.getString("CHARACTER_SET_NAME")
                                            ));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tblStructList;
    }
}
