package itp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class deleteElectricity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public deleteElectricity() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
			Statement st=con.createStatement();
			int i=st.executeUpdate("DELETE FROM electricity WHERE id=?");
			System.out.println("deleted successfully");
			
			System.out.println("hi");
		    request.setAttribute("successMessage", "your submition is succesful ");
		    request.getRequestDispatcher("Expences_Control.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	}


