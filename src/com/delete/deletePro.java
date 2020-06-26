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




@WebServlet("/deletePro")
public class deletePro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public deletePro() {
        super();
      
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		PrintWriter pw=response.getWriter();
		
		
		String proId=request.getParameter("proid");
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
			PreparedStatement st=con.prepareStatement("delete from products where ProId=?");
			
			st.setString(1, proId);
		
			
			int k=st.executeUpdate();
			
			if(k>0){
				request.setAttribute("msg", "Product successfully deleted");
				getServletContext().getRequestDispatcher("/viewproducts.jsp").forward(request, response); 
				//pw.println("Product successfully deleted");
			}
			
		
	
			
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}


	}

