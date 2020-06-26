package com.Add;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Statement;


@WebServlet("/updateProducts")
public class editPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public editPro() {
        super();
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		PrintWriter pwinsert=response.getWriter();
		
		Connection con;
		//PreparedStatement ps;
		ResultSet rs;
		Statement st;
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
			st=con.createStatement();
			rs=st.executeQuery("select * from products where ProId="+id+"");
			
			while(rs.next()){
				pw.print(rs.getString("ProName")+ ","+rs.getString("Category")+","+rs.getString("Price")+","+rs.getString("Qty")+","+rs.getString("filename"));
			}
			
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		

		
		
	}

}
