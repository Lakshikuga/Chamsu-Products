<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
   <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id =request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "chamsu";
String userid = "root";
String password = "1234";
try {
	
	Class.forName(driver);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from delivery where id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>   
     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

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
    width: 500px;
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
                    
                    <div id="content">
                       <header>
                           <h2 class="page-title" align="center">Delete Expences </h2>
                       </header> 
                        
                        <div class="content-inner">
                            <div class="form-wrapper">
                            
                                <form action="deletec" method="post">
                                   <table align="center">
                                   <tr> <td>
                                        <label class="sr-only">Title</label>
                                           <input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
										   <input type="text" name="id" value="<%=resultSet.getString("id") %>">
                                    </td>
                                    </tr>
                                       
                                   <tr>
                                    	<td>
                                        <button type="submit" class="btn btn-primary pull-right">Delete</button> 
                                      </td>
                                   </tr> 
                                       <!-- - --div class="clearfix">
                                        <button type="submit" class="btn btn-primary pull-left" onclick="window.location.href='viewAdmin.jsp'">View</button> 
                                    </div------->
                                 </table>
                                </form>
                            </div>
                        </div>
                    </div>
 	<% 	}
				connection.close();
				} catch (Exception e) {
					e.printStackTrace();
			}
      
      
      
      %>                         
      
<c:if test="${not empty msg }">

<script>
	window.addEventListener("load", function(){
		alert("${msg}");
	})

</script>

</c:if>




</body>
</html>