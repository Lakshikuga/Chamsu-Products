package com.Add;

import java.io.IOException;
import java.sql.Connection;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

@WebServlet("/AddImg")
@MultipartConfig(fileSizeThreshold=1024 *1024 *2,
		maxFileSize=1024*1024*10,
		maxRequestSize=1024*1024*50)




public class AddImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddImg() {
        super();
       
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/chamsu";
		FileInputStream fi=null;
		
		//String imgloc=request.getParameter("imgfile");
		
		
		Part part=request.getPart("imgfile");
		
		int imgId=Integer.parseInt(request.getParameter("imgId"));
		String fileName=extractFileName(part);
		String savePath="C:\\Users\\Asus\\workspace-javaee\\ITP\\WebContent\\images"+ File.separator+fileName;
		
		File fileSaveDir=new File(savePath);
		
		part.write(savePath + File.separator);
		
		int ProId=Integer.parseInt(request.getParameter("proid"));
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con=DriverManager.getConnection(url, "root", "1ak10ve5#Kuga");
			
			//File img=new File(imgloc);
			stmt=con.prepareStatement("insert into product_image values(?,?,?,?)");
			
			//fi=new FileInputStream(img);
			//stmt.setBinaryStream(1, (InputStream)fi, (int)(img.length()));
			
			stmt.setInt(1, imgId);
			stmt.setString(2,  fileName);
			stmt.setString(3, savePath);
			stmt.setInt(4, ProId);
			
			int i=stmt.executeUpdate();
			
			if(i>0){
				request.setAttribute("msg", "Updated to database successfully");
				getServletContext().getRequestDispatcher("/AddProduct.jsp").forward(request, response); 
				//pw.println("insert successfully");
			}
			
			else{
				request.setAttribute("msg", "Failed to insert the data");
				getServletContext().getRequestDispatcher("/AddProduct.jsp").forward(request, response); 
				//pw.println("failed to insert");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}/*finally{
			try{
				if(rs!=null){
					rs.close();
					rs=null;
				}
				
				if(stmt!=null){
					stmt.close();
					stmt=null;
					
				}
				
				if(con!=null){
					con.close();
					con=null;
				}
				
				if(fi!=null){
					fi.close();
					fi=null;
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}*/	
		
		
		
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
