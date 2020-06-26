package com.Add;

//import java.io.File;

//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.FileOutputStream;


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


@WebServlet("/updateProcess")
@MultipartConfig(fileSizeThreshold=1024 *1024 *2,
maxFileSize=1024*1024*10,
maxRequestSize=1024*1024*50)


public class updateProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public updateProcess() {
        super();
        
    }



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/chamsu";
		String user = "root";
		String psw = "1ak10ve5#Kuga";
		
		String id =request.getParameter("id");
		String proname=request.getParameter("proname");
		//String cat=request.getParameter("category");
		String price=request.getParameter("price");
		String qty=request.getParameter("qty");
		
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
		String sql="Update products set ProId=?,ProName=?,Price=?,Qty=? where ProId="+id;

		ps = con.prepareStatement(sql);

		ps.setString(1,id);
		ps.setString(2, proname);
		//ps.setString(3, cat);
		ps.setString(3, price);
		ps.setString(4, qty);
		//ps.setString(6, fileName);
		//ps.setString(7, savePath);

		int i = ps.executeUpdate();
		if(i > 0)
		{
			request.setAttribute("msg", "Record updated successfully ");
			getServletContext().getRequestDispatcher("/viewproducts.jsp").forward(request, response); 
			//pw.println("Record Updated Successfully");
		}
		else
		{
			request.setAttribute("msg", "There is a problem in updating Record.");
			getServletContext().getRequestDispatcher("/viewproducts.jsp").forward(request, response); 
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
