package com.Add;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.util.DOMUtil;

@WebServlet("/driverdetails")
public class driverdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Object driverUtil;
       

    public driverdetails() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    		
    		
    	  int id=0;
			   String Uname= (request.getParameter("Uname"));
		       String HNumber = (request.getParameter("HNumber"));
		       String MNumber= (request.getParameter("MNumber"));
		       String National = (request.getParameter("National"));
		       String Date = (request.getParameter("Date"));
		       String vehicle = (request.getParameter("vehicle"));
		       String email = (request.getParameter("email"));

		       try {
		       
		       Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
			  
		
			   String sql ="insert into driverdetails (driverId, Uname, HNumber, MNumber, National, Date, vehicle, email)values(?,?,?,?,?,?,?,?)";
			   PreparedStatement ps=con.prepareStatement(sql);
			  
		    	 
		 
			   ps.setInt(1,  id);
	           ps.setString(2 , Uname);
		       ps.setString(3, HNumber);
		       ps.setString(4, MNumber);
		       ps.setString(5, National);
		       ps.setString(6, Date);
		       ps.setString(7, vehicle);
		  
		       ps.setString(8, email);
		       
		       
		       
		       ps.executeUpdate();
		       
		       
		           System.out.println("values added successfully");
		           request.setAttribute("msg", "deliverd the item  ");
		           request.getRequestDispatcher("/driver123.jsp").forward(request, response);
		 
			  
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
}

	


