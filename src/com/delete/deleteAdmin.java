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

@WebServlet("/deleteAdmin")
public class deleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public deleteAdmin() {
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
		
		
		String adminId=request.getParameter("adminid");
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
			PreparedStatement st=con.prepareStatement("delete from admin where adminId=?");
			
			st.setString(1, adminId);
		
			
			int k=st.executeUpdate();
			
			if(k>0){
				request.setAttribute("msg", "Admin successfully deleted");
				getServletContext().getRequestDispatcher("/viewAdmin.jsp").forward(request, response); 
				//pw.println("Product successfully deleted");
			}
			
		
	
			
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}

}
