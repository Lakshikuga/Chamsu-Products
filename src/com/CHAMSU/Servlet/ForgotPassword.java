package com.CHAMSU.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ForgotPassword() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String email=request.getParameter("em");
		String oldPw=request.getParameter("pw");
		String newPw=request.getParameter("npw");
		String conPw=request.getParameter("cpw");
		
		Connection con=null;
		Statement sta=null;
		String pass="";
		String em="";

		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/chamsu";
			con=DriverManager.getConnection(url, "root", "1ak10ve5#Kuga");
			
			sta=con.createStatement();
			ResultSet rs=sta.executeQuery("select Email, Password from user where Password='" + oldPw +"' and Email='"+email+"'");
			if(rs.next()){
				pass=rs.getString("Password");
				em=rs.getString("Email");
				
			}
			
			
			
			if(newPw.equals(conPw)){
				
				if(em.equals(email)){
					
					if(pass.equals(oldPw)){
					sta=con.createStatement();
					int i=sta.executeUpdate("update user set Password='"+newPw+"' where Email='"+email+"'");
					
					//request.setAttribute("msg", "Password changed successfully");
					//getServletContext().getRequestDispatcher("/cinnamon.jsp").forward(request, response); 
					pw.println("Password changed successfully");
					
					sta.close();
					con.close();
				}
				
				else{
					//request.setAttribute("msg", "Old Password doesn't match");
					//getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response); 
					pw.println("Old Password doesn't match");
				}
			}
				
				else{
					//request.setAttribute("msg", "Email doesn't match");
					//getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response); 
					pw.println("email doesn't match");
				}
		}
		
		
		
		
	}catch(Exception e){
		e.printStackTrace();
		}
	}

}

