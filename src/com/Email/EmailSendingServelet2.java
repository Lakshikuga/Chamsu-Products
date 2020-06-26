package com.Email;



	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.text.*;
	import java.util.Calendar;


	@WebServlet("/EmailSendingServelet2")
	public class EmailSendingServelet2 extends HttpServlet {
		
		private String host;
	    private String port;
	    private String user;
	    private String pass;
	    
	    public void init() {
	        // reads SMTP server setting from web.xml file
	        ServletContext context = getServletContext();
	        host = context.getInitParameter("host");
	        port = context.getInitParameter("port");
	        user = context.getInitParameter("user");
	        pass = context.getInitParameter("pass");
	       // String resultMessage = "";
	    }
		//public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    //{
	      //}
	    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    	{
	      
	    	}
	        protected void doPost(HttpServletRequest request,
	                HttpServletResponse response) throws ServletException, IOException {
	            // reads form fields
	    		PrintWriter out=response.getWriter();

	           // String recipient = request.getParameter("recipient");
	            //String subject = request.getParameter("subject");
	            //String content = request.getParameter("content");
	     
	            //String resultMessage = "";
	     
	            //try {
	              //  send_email_gmail.sendEmail(host, port, user, pass, recipient, subject,
	                //        content);
	                //resultMessage = "The e-mail was sent successfully";
	            //} catch (Exception ex) {
	              //  ex.printStackTrace();
	                //resultMessage = "There were an error: " + ex.getMessage();
	            //} finally {
	              //  request.setAttribute("Message", resultMessage);
	                //getServletContext().getRequestDispatcher("/Result.jsp").forward(
	                  //      request, response);
	            //}
			
			out.println("<html>");
			out.println("<body-color:light-yellow'>");
			out.println("</body>");
			out.println("</html>");
			
			Connection conn = null;

			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsudb", "root", "1ak10ve5#Kuga");
				
				Statement stmt=conn.createStatement();
				ResultSet rst=stmt.executeQuery("SELECT SellerId,Ctd,Dis,Qunty,Price,Name,ContactNo,ContactNo2,City,Country,Email"+" FROM seller2 ");
				//ResultS

				
				int month;
	         	 month = Calendar.MONTH;

	if(month == 12) {
			 
				
					
					  out.println("<script type=\"text/javascript\">");
				      out.println("alert('You can only get this once a year ');");
				      out.println("</script>");
				      RequestDispatcher rd = request.getRequestDispatcher("sell.jsp");					    
				        rd.include(request, response);				
		        }			

	else if (month != 10) {

				while(rst.next()){
					
			//	out.println("<body style='background-color:#ffff80;'>");
					out.println("<html>");
					out.println("<body background='aaaa.jpg'>");
					out.println("</body>");
					out.println("</html>");

					 
				out.println("<font-size: 80px>");
				out.println("<text-align: center>");
			    out.println("<h1 style='text-align:center;'> Best Seller Of The Year!!!!!! </h1>");
				out.println("<br>");
				out.println("<br>");

				out.println("</font>");
				
				out.println("<font-size: 50px>");
				
				out.println("<h2>");
				out.println("Name:");
				out.print(rst.getString(6));
				out.println("<br>");
				out.println("</h2>");
				
				out.println("<h2>");
				out.println("Total Price:");
				out.print(rst.getString(5));
				out.println("<br>");			
				out.println("</h2>");
			
				out.println("<h2>");
				out.println("Seller ID:");
				out.print(rst.getString(1));
				out.println("<br>");
				out.println("</h2>");

				
				out.println("<h2>");
				out.println("Catagory:");
				out.print(rst.getString(2));
				out.println("<br>");
				out.println("</h2>");

				out.println("<h2>");

				out.println("Distric:");
				out.print(rst.getString(3));
				out.println("<br>");			
				out.println("</h2>");

				

				out.println("<h2>");
				out.println("Quntity:");
				out.print(rst.getString(4));
				out.println("<br>");
				out.println("</h2>");


				
				

				

				out.println("<h2>");
				out.println("Contact No:");
				out.print(rst.getString(7));
				out.println("<br>");
				out.println("<h2>");

				out.println("Contact NO:");
				out.print(rst.getString(8));
				out.println("<br>");			
				out.println("</h2>");
				out.println("<h2>");

				out.println("Street Address:");
				out.print(rst.getString(9));
				out.println("<br>");			
				out.println("</h2>");
				out.println("<h2>");

				out.println("City:");
				out.print(rst.getString(10));
				out.println("<br>");
				out.println("</h2>");

				out.println("<h2>");
				out.println("State:");
				out.print(rst.getString(11));
				out.println("<br>");
				out.println("</h2>");

				out.println("<h2>");
				out.println("Postal:");
				out.print(rst.getString(12));
				out.println("<br>");

				out.println("<h2>");
				out.println("Country:");
				out.print(rst.getString(13));
				out.println("<br>");
				out.println("</h2>");

				out.println("<h2>");
				out.println("Email:");
				out.print(rst.getString(14));
				out.println("<br>");
				out.println("</h2>");

				
				out.print("");
				out.println("<form action='search.jsp' method='post'><input type='submit' value='Continue'></form>");
				//out.println(str);
				
				
				  	String Email = rst.getString(14);//request.getParameter("Email");
		    	    String Subject = "Bought your product";
		            String resultMessage = "Dear Sir/Madam,"
		            		+ "You are selected as Best Seller of the Year Price Congragulation!!!!! "
		            		+ "(Chamsu Product PVT)";
		     
		            try {
		                Email.sendEmail(host, port, user, pass, Email, Subject,
		                		resultMessage);
		            
		            } catch (Exception ex) {
		                ex.printStackTrace();
		                 
		            }
		               }}
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
			
		}

	}



