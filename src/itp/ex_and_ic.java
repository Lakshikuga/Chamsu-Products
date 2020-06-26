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


@WebServlet("/ex_and_ic")
public class ex_and_ic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ex_and_ic() {
        super();
       
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		String date=request.getParameter("date");
		String amount=request.getParameter("amount");
		
		String submitType =request.getParameter("submit");
		
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
		 if(submitType.equals("Submit")){ 
		
		
		
		PreparedStatement ps = con.prepareStatement("insert into ex_and_ic value(?,?,?,?)");		
		PreparedStatement ps1 = con.prepareStatement("insert into ex_and_ic value(?,?,?,?)");
		PreparedStatement ps2 = con.prepareStatement("insert into ex_and_ic value(?,?,?,?)");
		PreparedStatement ps3 = con.prepareStatement("insert into ex_and_ic value(?,?,?,?)");
		PreparedStatement ps4 = con.prepareStatement("insert into ex_and_ic value(?,?,?,?)");
		
		ps.setString(1, id);
		ps.setString(2, type);
	 	ps.setString(3, date);
		ps.setString(4, amount);
		
	    ps.executeUpdate();
		}
	
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}
		
	}
}
