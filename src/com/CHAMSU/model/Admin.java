/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CHAMSU.model;


public class Admin {
    
	private int Aid;
	private String name;
    private String  email;
    private String password;
    
    
    public void setPassword(String password){
    
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
    public void setName(String name){
    	this.name=name;
    }
    
    public String getName(){
    	return name;
    }
    
    
    public void setEmail(String email){
           this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	

	
	
}

