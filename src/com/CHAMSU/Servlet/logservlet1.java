package com.CHAMSU.Servlet;

import java.io.IOException;



import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CHAMSU.model.Admin;
import com.CHAMSU.model.User;
import com.CHAMSU.util.AdminUtil;
import com.CHAMSU.util.UserUtill;

import java.text.*;


@WebServlet("/logservlet1")
public class logservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public logservlet1() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Returns the value of a request parameter as a String, or null if the parameter does not exist.
		String userType = request.getParameter("typeSelect");
		
		PrintWriter pw=response.getWriter();
		
		  /*java.util.Date now = new java.util.Date();
		  String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
		  SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		  
		  String strDateNew = sdf.format(now) ;*/
	    
        
       
        if(userType.equals("customer")){
	        
	        	String email=(request.getParameter("email"));
	        	String password=(request.getParameter("password"));
	        
	        if(email.equals(null)||email=="" || password.equals(null)||password==""){
	            request.setAttribute("msg", "All fields are required");
	            getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);
	        }
	         
	        else{
	    
	        	User user = new User();
	        	user.setEmail(email);
	        	user.setPassword(password);
	        	
	        	String sql ="select * from user where email=? and password=?";
	        
	        	HttpSession session = request.getSession();
	        	ResultSet rs =UserUtill.loginUser(user, sql);
	            
	        	try {
	            
	        		if(rs.next()){
	                    session.setAttribute("Uid", rs.getString(1));
	                    session.setAttribute("firstName", rs.getString(2));
	                    session.setAttribute("lastName", rs.getString(3));
	                    session.setAttribute("email", rs.getString(4));
	                    session.setAttribute("password", rs.getString(5));
	                    session.setAttribute("userType", rs.getString(6));
	                    
	                    
	                    //pw.println("successfully logged in");
	                    request.setAttribute("msg", "Successfully logged");
	                    getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);
	                }
	                
	        		else{
	                
	        			request.setAttribute("msg", "Invalid login try again or Register first"); 
	        			getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);  
	                }
	        	}catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
        	}
	        		
	       else if(userType.equals("seller")){
	        	        
	    	        	String email=(request.getParameter("email"));
	    	        	String password=(request.getParameter("password"));
	    	        
	    	        if(email.equals(null)||email==""||password.equals(null)||password==""){
	    	            request.setAttribute("msg", "All fields are required");
	    	            getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);
	    	        }
	    	         
	    	        else{
	    	    
	    	        	User user = new User();
	    	        	user.setEmail(email);
	    	        	user.setPassword(password);
	    	        	
	    	        	String sql ="select * from user where email=? and password=?";
	    	        
	    	        	HttpSession session = request.getSession();
	    	        	ResultSet rs =UserUtill.loginUser(user, sql);
	    	            
	    	        	try {
	    	            
	    	        		if(rs.next()){
	    	                    session.setAttribute("Uid", rs.getString(1));
	    	                    session.setAttribute("firstName", rs.getString(2));
	    	                    session.setAttribute("lastName", rs.getString(3));
	    	                    session.setAttribute("email", rs.getString(4));
	    	                    session.setAttribute("password", rs.getString(5));
	    	                    session.setAttribute("userType", rs.getString(6));
	    	                    
	    	                    //session.setAttribute("intime",strDateNew);
	    	                    
	    	                    //String queryString = "INSERT INTO login set uId="+Uid+",intime='"+strDateNew+"'";
	    	        			//int i = st.executeUpdate(queryString);
	    	                 
	    	                    request.setAttribute("msg", "Successfully logged");
	    	                    getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	    	                }
	    	                
	    	        		else{
	    	                
	    	        			request.setAttribute("msg", "Invalid login try again or Register first"); 
	    	        			getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);  
	    	                }
	    	        		
	    	        		
	    	        		
	        		
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        
	        
        
        }
    }
        
	       else if(userType.equals("admin")){
	        	        
	    	        	String email=(request.getParameter("email"));
	    	        	String password=(request.getParameter("password"));
	    	        
	    	        if(email.equals(null)||email==""||password.equals(null)||password==""){
	    	            request.setAttribute("msg", "All fields are required");
	    	            getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);
	    	        }
	    	         
	    	        else{
	    	    
	    	        	User user = new User();
	    	        	user.setEmail(email);
	    	        	user.setPassword(password);
	    	        	
	    	        	String sql ="select * from admin where email=? and password=?";
	    	        
	    	        	HttpSession session = request.getSession();
	    	        	ResultSet rs =UserUtill.loginUser(user, sql);
	    	            
	    	        	try {
	    	            
	    	        		if(rs.next()){
	    	                    session.setAttribute("aid", rs.getString(1));
	    	                    session.setAttribute("Name", rs.getString(2));
	    	                   
	    	                    session.setAttribute("email", rs.getString(3));
	    	                    session.setAttribute("password", rs.getString(4));
	    	                    
	    	                    
	    	                    //session.setAttribute("intime",strDateNew);
	    	                    
	    	                    //String queryString = "INSERT INTO login set uId="+Uid+",intime='"+strDateNew+"'";
	    	        			//int i = st.executeUpdate(queryString);
	    	                 
	    	                    request.setAttribute("msg", "Successfully logged");
	    	                    getServletContext().getRequestDispatcher("/Admin.jsp").forward(request, response);
	    	                }
	    	                
	    	        		else{
	    	                
	    	        			request.setAttribute("msg", "Invalid login try again or Register first"); 
	    	        			getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);  
	    	                }
	    	        		
	    	        		
	    	        		
	        		
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        
	        
        
        }
    }
        	
	        	else if(userType.equals("ad")){
        	        
    	        	String email=(request.getParameter("email"));
    	        	String password=(request.getParameter("password"));
    	        
    	        if(email.equals(null)||email==""||password.equals(null)||password==""){
    	            request.setAttribute("msg", "All fields are required");
    	            getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);
    	        }
    	         
    	        else{
    	    
    	        	User user = new User();
    	        	user.setEmail(email);
    	        	user.setPassword(password);
    	        	
    	        	String sql ="select * from user where email=? and password=?";
    	        
    	        	HttpSession session = request.getSession();
    	        	ResultSet rs =UserUtill.loginUser(user, sql);
    	            
    	        	try {
    	            
    	        		if(rs.next()){
    	                    session.setAttribute("Uid", rs.getString(1));
    	                    session.setAttribute("firstName", rs.getString(2));
    	                    session.setAttribute("lastName", rs.getString(3));
    	                    session.setAttribute("email", rs.getString(4));
    	                    session.setAttribute("password", rs.getString(5));
    	                    session.setAttribute("userType", rs.getString(6));
    	                    
    	                    //session.setAttribute("intime",strDateNew);
    	                    
    	                    //String queryString = "INSERT INTO login set uId="+Uid+",intime='"+strDateNew+"'";
    	        			//int i = st.executeUpdate(queryString);
    	                 
    	                    request.setAttribute("msg", "Successfully logged");
    	                    getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
    	                }
    	                
    	        		else{
    	                
    	        			request.setAttribute("msg", "Invalid login try again or Register first"); 
    	        			getServletContext().getRequestDispatcher("/log.jsp").forward(request, response);  
    	                }
    	        		
    	        		
    	        		
        		
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
        
    
    }
}
        	
        	
        
}
}