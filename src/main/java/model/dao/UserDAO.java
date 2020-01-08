/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.entity.User;

/**
 *
 * @author admin
 */
public interface UserDAO {
    
    boolean userExists(User user);
    
    default void createUser(){}
    default void setRole(){}
    
}
