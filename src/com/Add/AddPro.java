package com.Add;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



@WebServlet("/AddPro")
@MultipartConfig(fileSizeThreshold=1024 *1024 *2,
	maxFileSize=1024*1024*10,
	maxRequestSize=1024*1024*50)


public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPro() {
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
		

		FileInputStream fi=null;
		
		int id=0;	
		String name=request.getParameter("proname");
		String cat=request.getParameter("category");
		//String desc=request.getParameter("desc");
		String price=request.getParameter("price");
		String qty=request.getParameter("qty");
		
		//image
		Part part=request.getPart("imgfile");
		String fileName=extractFileName(part);
		String savePath="C:\\Users\\Asus\\workspace-javaee\\ITP\\WebContent\\images"+ File.separator+fileName;
		
		File fileSaveDir=new File(savePath);
		
		part.write(savePath + File.separator);
		
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
			PreparedStatement st=(PreparedStatement) conn.prepareStatement("insert into products" + "(ProId, ProName, Category, Price, Qty, filename, path) values(?,?,?,?,?,?,?)");
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, cat);
			//st.setString(4, desc);
			st.setString(4, price);
			st.setString(5, qty);
			st.setString(6, fileName);
			st.setString(7, savePath);
			
			
			int j=st.executeUpdate();//no of rows updated
			
			String msg="";
			if(j!=0){
				
				request.setAttribute("msg", "Updated to database successfully");
				getServletContext().getRequestDispatcher("/AddProduct.jsp").forward(request, response); 
				//msg="Updated to database successfully";
				//pw.print("<font size='6' color=blue>" +msg +" </font>");
			}
			else{
				
				request.setAttribute("msg", "Failed to insert the data");
				getServletContext().getRequestDispatcher("/AddProduct.jsp").forward(request, response); 
				//msg="failed to insert the data";
				//pw.print("<font size='6' color=blue>" + msg + "</font>");
			}
			st.close();
			
			
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}
	
	private String extractFileName(Part part){
		String contentDisp=part.getHeader("content-disposition");
		String[] items=contentDisp.split(";");
		
		for(String s:items){
			if(s.trim().startsWith("filename")){
				return s.substring(s.indexOf("=") +2, s.length() -1);
				}
			}
		return "";
		
		}


	}


