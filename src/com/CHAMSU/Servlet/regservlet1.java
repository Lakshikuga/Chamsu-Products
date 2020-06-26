package com.CHAMSU.Servlet;

import java.io.IOException;






import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;


import java.sql.Date;

import com.CHAMSU.model.User;
import com.CHAMSU.model.Admin;
import com.CHAMSU.util.AdminUtil;
import com.CHAMSU.util.UserUtill;

/**
 * Servlet implementation class regservlet1
 */
@WebServlet("/regservlet1")
public class regservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		   PrintWriter out=response.getWriter();
		   
		   int i=0;
		   
		   String uid = (request.getParameter("uid"));
	       String firstName = (request.getParameter("firstName"));
	       String lastName= (request.getParameter("lastName"));
	       String email = (request.getParameter("email"));
	       String password = (request.getParameter("password"));
	       String usertype=request.getParameter("typeSelect");
	       
	       User user= new User();
	       
	    	 user.setId(uid);
	    	 user.setFirstName(firstName);
	    	 user.setLastName(lastName);
	       	 user.setEmail(email);
	       	 user.setPassword(password);
	       	 user.setUserType(usertype);
	       
	       	 String sql ="insert into user values(?,?,?,?,?,?)";
	       	 i = UserUtill.addUser(user,sql);
	    
	      
	       		if(i!=0){
	       			System.out.println("values added successfully");
	       			request.setAttribute("msg", "Registration Successsfull..Please login  ");
	       			getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);
	       		}
	       
	       		else{
	       			System.out.println("values not added");
	       		}
	     }
	       		
	   
	}
	


