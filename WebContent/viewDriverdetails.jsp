<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"
		import= "java.sql.PreparedStatement"
		 import ="java.sql.SQLException"
		 import="java.io.IOException"
		 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <style type="text/css">  
        
    table.aaa{
    background-color:#d1d1c9 ;
    border:1px solid black;
    align:right ;
    padding-left: 100px;
    padding-right: 100px;
    width: 110px;
    height:310px;
    padding-top: 20px;
    opacity: 0.8;
    }
    table.aaa input[type=text]{
    padding: 7px;
    border:1px solid black;
    font-size: 16px;
    font-family: 'Arial', sans-serif;
    width: 1000px;
    border-spacing:20px ;
    }
    table.aaa tr{
        border-spacing:20px ;
    } 
    table.aaa tr td{
        width: 250px;
    }
    table.aaa input[type=password]{
    padding: 15px;
    border:1px solid black;
    font-size: 16px;
    font-family: 'Arial', sans-serif;
    width: 500px;
    border-spacing:10px ;
    }
    table.aaa input[type=submit]{
        float:center;
        background:#f5ff8d;
        padding-right: 100px;
        border-radius: 0 5px 5px 0;
        cursor:pointer;
        position: relative;
        padding: 20px;
        font-family:"Comic Sans MS", cursive, sans-serif;
        border: none;
        font-size: 16px;
        width: 170px;
        border: 1px solid black;
        border-spacing:10px
    }
        
    button{
    float: center;
    background:  #f5ff8d;
    border-radius: 0 5px 5px 0;
    cursor:pointer;
    position: relative;
    padding: 7px;
    font-family: 'Arial', sans-serif;
    border: none;
    font-size: 16px;
    width: 150px;
    border: 1px solid black;
}
table.aaa input[type=submit]:hover{
 background-color: black;
    color:#f5f5f5 ;

}
.header{
    width: auto;
    height: 900px;
    margin: 50px;
    padding: 50px;
    text-align: center;
    background-image: url("culinar.jpg");
		}
p{
	font-family:"Comic Sans MS";
}
 .Slides {
        max-width: 1450px;
        position: relative;
        margin: auto;
        padding-top: 1px;
        padding-left: 10px; 
    }
.grid-layout{
display:grid;
grid-template-columns:auto auto;
padding:20px; 
}
.grid{
padding :30px;
text-align:center;
}
p.abc{
font-family:"Times New Roman";
font-style:italic;
font-size:25px;
}

</style>
</head>
<body>


 
 <br />
 <br />
 <br />

<html>
<body  background="wp2024030-spice-wallpapers.jpg">
<div align="left">
<a href="Expences_Control.jsp"><img src="1_bGQIC34HTteELcjyJgbC-400x401.png"  style="width:100px;height:100px;"></a>
</div>
<%
Statement statement = null;
ResultSet resultSet = null;
%>
	<div align="center">
    <table class="aaa" cellpadding="20" cellspacing="2">
        <tr><p><font size="6" style="color: white; font-border: 3px solid black; ">driver details</font></p></tr>
			
        	<tr>
        	<th>Name</th>&emsp;&emsp;&emsp;
        	<th>Contact Number</th>&emsp;&emsp;&emsp;
        	<th>driver license Number </th>&emsp;&emsp;&emsp;
        	<th>National Id</th>&emsp;&emsp;&emsp;
			<th>Date of Birth</th>&emsp;&emsp;&emsp;
			<th>Vehicle Type</th>&emsp;&emsp;&emsp;
			<th>email</th>&emsp;&emsp;&emsp;
     		<th>Update</th>&emsp;&emsp;&emsp;
     		<th>Delete</th>&emsp;&emsp;&emsp;
        	</tr>
        <%
try{ 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
	statement=con.createStatement();
	String sql ="SELECT * FROM driverdetails";
	
	resultSet = statement.executeQuery(sql);
	
	while(resultSet.next()){
	%>
	<tr>

	<td><%=resultSet.getString("Uname") %></td>
	<td><%=resultSet.getString("HNumber") %></td>
	<td><%=resultSet.getString("MNumber") %></td>
	<td><%=resultSet.getString("National") %></td>
	<td><%=resultSet.getString("Date") %></td>
	<td><%=resultSet.getString("vehicle") %></td>
	<td><%=resultSet.getString("question") %></td>
	<td><%=resultSet.getString("email") %></td>
	

	<td><a href='updateelectricity.jsp?name=<%=resultSet.getString("Uname") %>'><button>Update</button></a></td>
    <td><a href='deleteElectricity.jsp?name=<%=resultSet.getString("Uname") %>'><button>Delete</button></a> </td>
	</tr>

	<% 
		}

	} catch (Exception e) {
	e.printStackTrace();
	}
%>
        	
    </table>
    </div>
</body></html>