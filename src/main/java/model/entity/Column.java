/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author admin
 */
public class Column {
    
    private final String columnName;
    private final String dataType;
    private final String columnKey;
    private final String characterSetName;

    public Column(String columnName, String dataType, String columnKey, String characterSetName) {
        
        this.columnName = columnName;
        this.dataType = dataType;
        this.columnKey = columnKey;
        this.characterSetName = characterSetName;
    }

    
  
    
    public String getColumnName() {
        return columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

}
