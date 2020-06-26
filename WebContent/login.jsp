<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" import="java.sql.*"  import="java.sql.Connection" import=" java.sql.DriverManager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STYLISH EVENT PLANNING</title>
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
<br />
<br />
<br />
<br />
<br />
<form action="login123" method="post">
<table class="aaa" align="center">
<tr>
<td> <h1 align="center">ADMINISTRATIVE LOGIN</h1></td>


            <tr>
                <td>
                    AdminName : </td>

                <td><input id="Text" type = "text" name = "username"/></td>
            </tr>
            <tr>

                <td> Password : </td>
                <td><input id="Text" type="password"  name="password"/></td>

            </tr>



            <tr><td><input type="submit" name="submit" value="Login"></td>
            
            </tr>
          </table>
      </form>
      <br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />

</body>
</html>