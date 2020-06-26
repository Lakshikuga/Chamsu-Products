package com.CHAMSU.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CHAMSU.model.Admin;
import com.CHAMSU.util.AdminUtil;

/**
 * Servlet implementation class adminHandle
 */
@WebServlet("/adminHandle")
public class adminHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public adminHandle() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Returns the value of a request parameter as a String, or null if the parameter does not exist. 
	
	     
		
			
			int Aid=0;
			String uname = (request.getParameter("adminname"));
			String email = (request.getParameter("em"));
			String password = (request.getParameter("pw"));
			
			//Creating a new Admin object
			Admin ad = new Admin();
	    
			//Setting up the parameters
			ad.setAid(Aid);
			ad.setEmail(email);
			ad.setName(uname);
		    ad.setPassword(password);
		   
		    
		    //Inserting values into the admin table
		    String sql ="insert into admin values(?,?,?,?)";
		    
		    //Invoking addAdmin static method
		    int i = AdminUtil.addAdmin(ad, sql);
		       
		       if(i!=0){
		    	   
		    	   
		           System.out.println("values added successfully");
		           request.setAttribute("msg", "Admin added successfully ");
		           getServletContext().getRequestDispatcher("/viewAdmin.jsp").forward(request, response);
		       }
		       
		       else{
		            request.setAttribute("msg", "Admin not added successfully ");
		           getServletContext().getRequestDispatcher("/viewAdmin.jsp").forward(request, response);
		           System.out.println("values not added");
		       }
	    }

	     

	}

