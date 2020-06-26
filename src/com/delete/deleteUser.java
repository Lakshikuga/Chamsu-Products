package com.delete;

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

@WebServlet("/deleteUser")
public class deleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public deleteUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	}
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
		PrintWriter pw=response.getWriter();
		
		
		int userId=Integer.parseInt(request.getParameter("userid"));
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
			PreparedStatement st=con.prepareStatement("delete from user where UserId=?");
			
			st.setInt(1, userId);
		
			
			int k=st.executeUpdate();
			
			if(k>0){
				request.setAttribute("msg", "User successfully deleted");
				getServletContext().getRequestDispatcher("/UserManage.jsp").forward(request, response); 
				//pw.println("Product successfully deleted");
			}
			
		
	
			
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}

}
