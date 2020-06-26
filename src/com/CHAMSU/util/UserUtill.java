
package com.CHAMSU.util;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.CHAMSU.model.User;


public class UserUtill {
    
	public static int addUser(User u1,String sql){
        int i = 0;
        Connection con = DB.getCon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u1.getId());
            ps.setString(2, u1.getFirstName());
            ps.setString(3, u1.getLastName());
            ps.setString(4, u1.getEmail());
            ps.setString(5, u1.getPassword());
            ps.setString(6, u1.getUserType());
            
           i= ps.executeUpdate();

                        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }
     public static ResultSet loginUser(User user,String sql) {
    
    Connection con = DB.getCon();
    
    ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
          
            ps.setString(1, user.getEmail());
          
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
 
    return rs;
}
    
    
    
    }
     
    
    
    


