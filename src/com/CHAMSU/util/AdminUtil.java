/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CHAMSU.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.CHAMSU.model.Admin;
import com.CHAMSU.model.User;




public class AdminUtil {
    
  
    
    public static ResultSet loginAdmin(Admin admin,String sql) {
    
    Connection con = DB.getCon();
    
    ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(3, admin.getEmail());
            ps.setString(4, admin.getPassword());
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
 
    return rs;
}

    

     
     
     //
      public static int addAdmin(Admin ad,String sql){
        int i = 0;
        Connection con = DB.getCon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, ad.getAid());
            ps.setString(2, ad.getName());
            ps.setString(3, ad.getEmail());
            ps.setString(4, ad.getPassword());
            
            
           i= ps.executeUpdate();

                        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }
	


     
}
    
    
    


