package Sell1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *  implementation class Sell
 */
@SuppressWarnings("serial")
@WebServlet("/Sell")
public class Sell extends HttpServlet {
	
	 public Sell() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    {        request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);

	      }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
		
		}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter pw=response.getWriter()){
			
			String SellerId=request.getParameter("SellerId");			
			String Ctd=request.getParameter("Ctd");
			String Dis=request.getParameter("Dis");
			String Price=request.getParameter("Price");
			String Qunty=request.getParameter("Qunty");
			String Name=request.getParameter("Name");
			String ContactNo=request.getParameter("ContactNo");
			String ContactNo2=request.getParameter("ContactNo2");
			String StreetAddress=request.getParameter("StreetAddress");
			String City=request.getParameter("City");
			String State=request.getParameter("State");
			String Postal=request.getParameter("Postal");
			String Country=request.getParameter("Country");
			String Email=request.getParameter("Email");

			Connection conn = null;
			//new
		try {
				
			
		 	double d= Double.valueOf(Price);

			 if((ContactNo.length() < 10) ||(ContactNo2.length() < 10)) {
					
					PrintWriter out = response.getWriter();
					
					  out.println("<script type=\"text/javascript\">");
				      out.println("alert('Enter Valied Contact Number ');");
				     // out.println("window.location = 'sell.jsp'");
				      out.println("</script>");
				} 
			 else if(d!=(int)d){
					PrintWriter out = response.getWriter();
					
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('Enter valied Price ');");
				     // out.println("window.location = 'sell.jsp'");

				   out.println("</script>");
			
				}
			 // RequestDispatcher rd = request.getRequestDispatcher("sell.jsp");
						//rd.include(request, response);
			
							
					//double d= Double.valueOf(Price);
				
		
				//double d= Double.valueOf(Price);

				
			
			
				else  {
				
				
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu", "root", "1ak10ve5#Kuga");
				PreparedStatement st=(PreparedStatement) conn.prepareStatement("insert into seller2" + "(SellerId, Ctd, Dis, Qunty, Price, Name, ContactNo , ContactNo2, StreetAddress, City, State, Postal, Country, Email ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				st.setString(1,  SellerId);
				st.setString(2, Ctd);
				st.setString(3, Dis);
				st.setString(4, Qunty);
				st.setString(5,  Price);
				st.setString(6, Name);
				st.setString(7, ContactNo);
				st.setString(8, ContactNo2);
				st.setString(9, StreetAddress);
				st.setString(10, City);
				st.setString(11, State);
				st.setString(12, Postal);
				st.setString(13, Country);
				st.setString(14, Email);
				 
				int j=st.executeUpdate();//no of rows updated
				
				
				
					if(j!=0){
				
					 PrintWriter out = response.getWriter();
					
					  out.println("<script type=\"text/javascript\">");
				       out.println("alert('Saved Succesfully');");
				       out.println("</script>");
				       
				       // redirect code after 3 secound **&& ;)
				 			//out.println("<meta http-equiv='refresh' content='3;URL=index.jsp'>");//redirects after 3 seconds
				    	   //out.println("<p style='color:red;'>User or password incorrect!</p>");
				    	
				       			RequestDispatcher rd = request.getRequestDispatcher("sell.jsp");
				       			rd.include(request, response);
				       	}
					
					
					else{
					      
					   PrintWriter out = response.getWriter();

							    out.println("<script type=\"text/javascript\">");
						        out.println("alert('not Saved');");
						        out.println("</script>");
						        RequestDispatcher rd = request.getRequestDispatcher("sell.jsp");					    
						        rd.include(request, response);
					    }
						st.close();
				
				
			
				
				
				
				//String query = null;
				//st.execute(query);
				
						System.out.println("Data inserted");
				
				
						 
				}
				
				}catch(Exception ex){
					ex.printStackTrace();
				}
		}catch(Exception ex){
			ex.printStackTrace();
		}
			
			
		

	
	}}
				
	

