package com.Update;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/updateAdmin")
@MultipartConfig(fileSizeThreshold=1024 *1024 *2,
maxFileSize=1024*1024*10,
maxRequestSize=1024*1024*50)


public class updateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public updateAdmin() {
        super();
        
    }



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/chamsu";
		String user = "root";
		String psw = "1ak10ve5#Kuga";
		
		String id =request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("em");
		String pass=request.getParameter("pw");
		
		 //FileOutputStream fos = null;
		
		//image
		/*Part part=request.getPart("imgfile");
		String fileName=extractFileName(part);
		String savePath="C:\\Users\\Asus\\workspace-javaee\\ITP\\WebContent\\images"+ File.separator+fileName;
				
		File fileSaveDir=new File(savePath);
		
		if(fileSaveDir.exists() && !fileSaveDir.canWrite()){
			fileSaveDir.setWritable(true);
		}
				
		part.write(savePath + File.separator);*/
		
		if(id!=null)
		{
		Connection con = null;
		PreparedStatement ps = null;

		try
		{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,psw);
		String sql="Update admin set adminId=?,Name=?,Email=?,Password=? where adminId="+id;

		ps = con.prepareStatement(sql);

		ps.setString(1,id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, pass);
	

		int i = ps.executeUpdate();
		if(i > 0)
		{
			request.setAttribute("msg", "Record updated successfully ");
			getServletContext().getRequestDispatcher("/viewadmin.jsp").forward(request, response); 
			//pw.println("Record Updated Successfully");
		}
		else
		{
			request.setAttribute("msg", "There is a problem in updating Record.");
			getServletContext().getRequestDispatcher("/viewadmin.jsp").forward(request, response); 
			//pw.println("There is a problem in updating Record.");
		} 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
				
	}
	
	
	
	/*private String extractFileName(Part part){
		String contentDisp=part.getHeader("content-disposition");
		String[] items=contentDisp.split(";");
		
		for(String s:items){
			if(s.trim().startsWith("filename")){
				return s.substring(s.indexOf("=") +2, s.length() -1);
				}
			}
		return "";
		
		}*/

}
