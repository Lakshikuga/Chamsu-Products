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


@WebServlet("/arecaNut")
public class arecaNut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public arecaNut() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 
			String name=request.getParameter("pname");
			String description=request.getParameter("description");
			float  price=Float.parseFloat(request.getParameter("rate"));

			int Qty; 
			String xQty = request.getParameter("Qty");
			if((xQty != null) && (xQty != "")) {
				Qty = Integer.parseInt(request.getParameter("Qty"));
			}
			else {
				Qty = 0;
			}
		
			
			
			
			String submitType =request.getParameter("submit");
			
			
			
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
				 
				if(submitType.equals("Add to Cart")){ 
				
				float total = price * Qty;
				
				PreparedStatement ps = con.prepareStatement("insert into cart value(?,?,?,?)");		
			
				ps.setString(1, name);
				ps.setInt(2, Qty);
				ps.setFloat(3, price);
				ps.setFloat(4, total);
				 
			    System.out.println("inserted");
				request.setAttribute("successMessage", "Adding expenses is succesfull");
			    request.getRequestDispatcher("arecaNut.jsp").forward(request, response);

			    ps.executeUpdate();
			 	
				 }else if(submitType.equals("Add to Watchlist")) {
						PreparedStatement ps = con.prepareStatement("insert into  watch value(?,?)");		
					 	ps.setString(1, name);
						ps.setFloat(2, price );

					    ps.executeUpdate();
				 
			    System.out.println("inserted");
			    request.setAttribute("successMessage", "Adding expenses is succesfull");
			    request.getRequestDispatcher("arecaNut.jsp").forward(request, response);
				 }
			}catch(ClassNotFoundException e){
				System.out.println(e);
			}catch(SQLException e) {
				System.out.println(e);
			}
	}
	}


