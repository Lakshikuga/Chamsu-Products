package com.Add;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deletec
 */
@WebServlet("/deletec")
public class deletec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deletec() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1234");
			PreparedStatement st=con.prepareStatement("delete from delivery where id=?");
			
			st.setInt(1, id);
		
			
			int k=st.executeUpdate();
			
			if(k>0){
				request.setAttribute("msg", " successfully deleted");
				getServletContext().getRequestDispatcher("/customerViewpay.jsp").forward(request, response); 
				//pw.println("Product successfully deleted");
			}
			
		
	
			
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}

}
