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

@WebServlet("/delivery")
public class delivery extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Object driverUtil;
       

    public delivery() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    	   int id=0;
		   String uname= (request.getParameter("uname"));
	       String hno = (request.getParameter("hno"));
	       String mno= (request.getParameter("mno"));
	       String address = (request.getParameter("address"));
	       String city = (request.getParameter("city"));
	       String postal = (request.getParameter("postal"));
	       String email = (request.getParameter("email"));

    	   try {
    		
    		   Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
			  
		
			   //String sql ="insert into delivery values('"+uname+"','"+hno+"','"+mno+"','"+address+"','"+city+"','"+postal+"','"+email+"')";
			   String sql="insert into delivery (deliveryId, uname, hno, mno, address, city, postal, email) values(?,?,?,?,?,?,?,?)";
			   PreparedStatement ps=con.prepareStatement(sql);
			  
		    	 
		 
		       ps.setInt(1,  id);
	           ps.setString(2 ,uname);
		       ps.setString(3, hno);
		       ps.setString(4, mno);
		       ps.setString(5, address);
		       ps.setString(6, city);
		       ps.setString(7, postal);
		       ps.setString(8, email);
		       
		       
		       
		       
		       int j=ps.executeUpdate();   
		       
		       if(j!=0) {
		       
		           System.out.println("values added successfully");
		           request.setAttribute("msg", "deliverd the item  ");
		           request.getRequestDispatcher("/delivery123.jsp").forward(request, response);
		       }
		       else {
		    	   System.out.println("values not added successfully");
		       }
			  
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
    }
    