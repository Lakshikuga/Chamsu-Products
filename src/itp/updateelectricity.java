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


@WebServlet("/updateelectricity")
public class updateelectricity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public updateelectricity() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try
		{
			String id = request.getParameter("id");
			String date=request.getParameter("date");
			String amount=request.getParameter("amount");
		
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamus","root","1ak10ve5#Kuga");
		String sql="Update electricity set id=? , date=? , amount=?   where id="+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, date);
		ps.setString(3, amount);

		int i = ps.executeUpdate();
		System.out.println("hi");
	    request.setAttribute("successMessage", "your update is succesful ");
	    request.getRequestDispatcher("Expences_Control.jsp").forward(request, response);
	    
		if(i > 0)
		{
		System.out.print("Record Updated Successfully");
		}
		else
		{
		System.out.print("There is a problem in updating Record.");
		} 
		}
		catch(SQLException sql)
		{
		request.setAttribute("error", sql);
		System.out.println(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
