<%@ page import="java.sql.*,java.util.*,java.text.*,java.text.SimpleDateFormat" %>

<% 
int userid=Integer.parseInt(session.getAttribute("userid").toString());
String intime = session.getAttribute("intime").toString();
String url = "jdbc:mysql://localhost:3306/";
String dbName = "chamsu";
String driver = "com.mysql.jdbc.Driver";
String username = "root"; 
String userPassword = "1ak10ve5#Kuga";
Connection conn = null;

java.util.Date now = new java.util.Date();
String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
String strDateNew = sdf.format(now) ;
try
{
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url+dbName,username,userPassword);
	Statement st = conn.createStatement();
	String queryString = "update login set outtime='"+strDateNew+"' where uId="+userid+" and intime='"+intime+"'";
	
	int i = st.executeUpdate(queryString);

	if(i>0)
	{
	session.invalidate();
	response.sendRedirect("log.jsp");
	}
	conn.close();
}
catch (Exception e)
{
	e.printStackTrace();
}
%> 

