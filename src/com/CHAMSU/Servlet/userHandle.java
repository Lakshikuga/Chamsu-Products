package com.CHAMSU.Servlet;

import java.io.IOException;





import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CHAMSU.model.User;
import com.CHAMSU.util.AdminUtil;
import com.CHAMSU.util.UserUtill;


/**
 * Servlet implementation class userHandle
 */
@WebServlet("/userHandle")
public class userHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userHandle() {                     //############## CONSTRUCTOR ##############
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//overide
		String s1 = request.getParameter("param");
	    if(s1.equals("UserDetails")) {
			response.sendRedirect("userlist.jsp");
	                
	    }
		else if(s1.equals("RemoveUser")){
	        
	        String id = (request.getParameter("uid"));
	        String email = (request.getParameter("email"));
	        
	        User user = new User();

	        user.setId(id);
	        user.setEmail(email);

	        
	      
	        String sql ="insert into black_list values(?,?)";
	        /*int r = UserUtill.blackListUser(user,sql);
	        int i = AdminUtil.removeUser(user);
	        if(i != 0){
	            request.setAttribute("msg", "User is Removed");
	            getServletContext().getRequestDispatcher("/userlist.jsp").forward(request, response);
	        }else{
	            request.setAttribute("msg", "User is not removed successfully");
	             getServletContext().getRequestDispatcher("/userlist.jsp").forward(request, response);
	        }
	        if(r != 0){
	            request.setAttribute("msg", "User is blacklisted");
	            getServletContext().getRequestDispatcher("/userlist.jsp").forward(request, response);
	        }else{
	            request.setAttribute("msg", "User is not blaclisted successfully");
	             getServletContext().getRequestDispatcher("/userlist.jsp").forward(request, response);
	        }*/
	        
	    }

	    /**
	     * Returns a short description of the servlet.
	     *
	     * @return a String containing servlet description
	     */
	    }// </editor-fold>

	}


