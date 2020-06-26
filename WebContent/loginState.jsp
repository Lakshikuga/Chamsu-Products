<%@ page import="java.sql.*,java.util.*,java.text.*,java.text.SimpleDateFormat" %>
<%
  
  String userName = request.getParameter("email");
  String password = request.getParameter("password");
 

	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "chamsu";
	String driver = "com.mysql.jdbc.Driver";
	String username = "root"; 
	String userPassword = "1ak10ve5#Kuga";

	  java.util.Date now = new java.util.Date();
	  String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
	  SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	  
    String strDateNew = sdf.format(now) ;


    try {
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url+dbName,username,userPassword);
	  Statement st = conn.createStatement();
	  String strQuery = "select * from user where Email='"+userName+"' and Password='"+password+"'"; 
	 
	  ResultSet rs = st.executeQuery(strQuery);
	 
	   if(rs.next())
		{
		   
		   	int userid=rs.getInt(1);
			String user=rs.getString(4);

			session.setAttribute("UserId",userid);
			session.setAttribute("Email",user);
		    session.setAttribute("intime",strDateNew);

		    String queryString = "INSERT INTO login set uId="+userid+",intime='"+strDateNew+"'";
			int i = st.executeUpdate(queryString);

			if(i>0)
			{
				response.sendRedirect("cinnamon.jsp");
			}

		}
 
        response.sendRedirect("log.jsp");
        conn.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
 %> 

	