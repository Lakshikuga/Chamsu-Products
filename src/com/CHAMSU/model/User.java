/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CHAMSU.model;

public class User {
    
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String uid;
    private String userType;
   
    
    
   



	public void setFirstName(String firstname){
        this.firstname = firstname;
        }
    
    public String getFirstName(){
        return firstname;
    }
    
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    
   public void setUserType(String userType){
    	this.userType=userType;
    }

    public String getUserType(){
    	return userType;
    }
    
	public String getPassword(){
        return password;
    }
    
    public String getId(){
        return uid;
    }
    
    public void setId(String uid){
        this.uid=uid;
    }



 

    }
 




