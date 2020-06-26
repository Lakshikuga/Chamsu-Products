package itp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/electricity")
public class electricity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public electricity() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id=request.getParameter("id");
			String date=request.getParameter("date");
			String amount=request.getParameter("amount");
			String submitType =request.getParameter("submit");
			String mon=request.getParameter("mon");
			String year=request.getParameter("year");
			
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
				
				if(submitType.equals("Submit")) {
					
				PreparedStatement ps = con.prepareStatement("insert into electricity value(?,?,?,?,?)");		
				ps.setString(1, id);
				ps.setString(2, date);
				ps.setString(3, mon);
				ps.setString(4, year);
				ps.setString(5, amount);

			    ps.executeUpdate();
			    
			    System.out.println("inserted");
			    request.setAttribute("msg", "Adding expenses is succesfull");
			    request.getRequestDispatcher("Expences_Control.jsp").forward(request, response);
				}
			}catch(ClassNotFoundException e){
				System.out.println(e);
			}catch(SQLException e) {
				System.out.println(e);
			}
			}
	
	}


