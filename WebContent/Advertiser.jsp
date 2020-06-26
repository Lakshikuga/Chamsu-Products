<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="vendor/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="admin/css/default.css">
    <link rel="stylesheet" href="admin/css/product.css">
    
<title>Advertisers</title>
</head>
<body>

<div class="container-fluid display-table">
                  <div class="row display-table-row">

                      <!--side-menu-->
                      <div class="col-md-2 col-sm-1 hidden-xs display-table-cell valign-top" id="side-menu">
                          <h1 class="hidden-xs hidden-sm">Navigation</h1>
                          <ul>
                              <li class="link">
                                  <a href="index.html">
                                      <span class="glyphicon glyphicon-th" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Dashboard</span>
                                  </a>
                              </li>

                               <li class="link">
                                  <a href="#collapse-post" data-toggle="collapse" aria-controls="collapse-post">
                                      <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Page Management</span>
                                      <!--span class="label label-success pull-right">20</span--->
                                  </a>
                                  <ul class="collapse collapseable" id="collapse-post">
                                      <li><a href="logo.html">Logo Management</a></li>
                                  </ul>
                              </li>

                              <li class="link active">
                                  <a href="#collapse-product" data-toggle="collapse" aria-controls="collapse-product">
                                      <span class="glyphicon glyphicon-gift" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Product Management</span>
                                      <!--span class="label label-success pull-right">20</span--->
                                  </a>
                                  <ul class="collapse collapseable" id="collapse-product">
                                      <li>
                                      <a href="addproduct.html">Add Products
                                      <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
                                      <span class="label label-success pull-right hidden-sm hidden-xs">10</span>
                                      </a></li>

                                      <li>
                                      <a href="deleteproduct.html">Delete Products
                                      <span class="glyphicon glyphicon-minus-sign" aria-hidden="true"></span>
                                      <span class="label label-warning pull-right hidden-sm hidden-xs">10</span>
                                      </a></li>
                                  </ul>
                              </li>

                                <li class="link">
                                  <a href="location.html">
                                      <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Location Management</span>
                                      
                                  </a>
                              </li>

                                   <li class="link">
                                  <a href="Users.html">
                                      <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">User Management</span>
                                  </a>
                              </li>

                                   <li class="link">
                                  <a href="admin.html">
                                      <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Admin User Management</span>
                                  </a>
                              </li>

                                   <li class="link">
                                  <a href="Orders.html">
                                      <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Order Management</span>
                                  </a>
                              </li>

                                   <li class="link">
                                  <a href="email.html">
                                      <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Email Management</span>
                                  </a>
                              </li>

                                   <li class="link">
                                  <a href="merchants.html">
                                      <span class="glyphicon glyphicon-qrcode" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Merchant Management</span>
                                  </a>
                              </li>

                                 <li class="link">
                                  <a href="advertisers.html">
                                      <span class="glyphicon glyphicon-film" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Advertiser Management</span>
                                  </a>
                              </li>

                                 <li class="link settings-btn">
                                  <a href="settings.html">
                                      <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                                      <span class="hidden-sm hidden-xs">Settings</span>
                                  </a>
                              </li>
                          </ul>
                      </div>

                      <!---main content-->
                      <div class="col-md-10 col-sm-11 display-table-cell valign-top box">

                          <div class="row">
                              <header id="nav-header" class="clearfix">
                                  <div class="col-md-5">
                                     <nav class="navbar-default pull-left">
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="offcanvas" data-target="#side-menu">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                          </button>
                                     </nav>
                                      <input type="text" class="hidden-sm hidden-xs" id="header-search-field" placeholder="Search for something...">
                                  </div>
                                  <div class="col-md-7">
                                      <ul class="pull-right">
                                          <li id="welcome" class="hidden-xs">Welcome to your administration area</li>
                                          <li class=" fixed-width">
                                              <a href="#">
                                                  <span class="glyphicon glyphicon-bell" aria-hidden="true"></span>
                                                  <span class="label label-warning">3</span>

                                              </a>
                                          </li>

                                          <li class="fixed-width">
                                              <a href="#">
                                                <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                                                  <span class="label label-message">3</span>  
                                              </a>
                                          </li>
                                          <li>
                                              <a href="#" class="logout">
                                                  <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> log out
                                              </a>
                                          </li>
                                      </ul>
                                  </div>
                              </header>
                            </div>
                            
                            <div id="content">
                               <header class="clearfix">
                                   <h2 class="page-title pull-left">All Advertisers</h2>
                                   <!-- - --button type="button" class="btn btn-xs btn-primary pull-right" onclick="location.href='addproduct.html'">Add Product</button---->
                               </header> 

                                <div class="content-inner">
                                   <div class="row search-row">
                                       <div class="col-md-12">
                                           <div class="input-group">
                                               <input type="text" class="form-control search-field" id="search" placeholder="Search">
                                               <span class="input-group-btn">
                                                   <button type="button" class="btn btn-primary go">Go!</button>
                                               </span>
                                           </div>
                                       </div>
                                   </div>
                                   
                                   <div class="row">
                                      
                                      <table class="table table-bordered">
                                          
                                              <tr>
                                                  <th>#</th>
                                                  <th>First Name</th>
                                                  <th>Last Name</th>
                                                  <th>Email</th>
                                                  <th>Password</th>
                                                  <th>Gender</th>
                                                  <th>Joined Date</th>
                                                  <th>Options</th>
                                                  
                                              </tr>
                                          
                                        
<%
try{ 
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamsu","root","1ak10ve5#Kuga");
	String sql ="SELECT * FROM user";
	Statement stm=con.createStatement();
	
	ResultSet rs=stm.executeQuery(sql);
	
	while(rs.next()){
	%>
	<tr>
	<td><%=rs.getInt("UserId") %></td>
	<td><%=rs.getString("FirstName") %></td>
	<td><%=rs.getString("LastName") %></td>
	<td><%=rs.getString("Email") %></td>
	<td><%=rs.getString("Password") %></td>
	<td><%=rs.getString("Gender") %></td>
	<td><%=rs.getString("JoinedDate") %></td>
	
	
	
	<!-- - --td><span class="label label-success">active</span></td-------->
    <td>
    
    <!-- -a class="btn btn-xs btn-default" href="#" role="button">
    <span class="glyphicon glyphicon-folder-open" aria-hidden="true">&nbsp;View</span></a------->
                                               
    <!-- - --a class="btn btn-xs btn-default" href="#" role="button">
    <span class="glyphicon glyphicon-pencil" aria-hidden="true">&nbsp;Edit</span>
    </a------->
                                               
    <a class="btn btn-xs btn-default" href="delete.html" role="button">
    <span class="glyphicon glyphicon-remove" aria-hidden="true">&nbsp;Delete</span>
    </a></td>                                         
	</tr>

	
    
 <% 
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
%>


</table>


                                     
                                           
                                        
                                    
                                          
                                                        
                                           
                                           <!---div class="product-actions">
                                               <a class="btn btn-xs btn-default" href="#" role="button">
                                                   <span class="glyphicon glyphicon-folder-open" aria-hidden="true">&nbsp;View</span>
                                               </a>
                                               
                                               <a class="btn btn-xs btn-default" href="#" role="button">
                                                   <span class="glyphicon glyphicon-pencil" aria-hidden="true">&nbsp;Edit</span>
                                               </a>
                                               
                                               <a class="btn btn-xs btn-default" href="#" role="button">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true">&nbsp;Delete</span>
                                               </a>
                                           </div---->
                                       <!---/div--->
                                       
                                       
                                   </div>
                                </div>
                            </div>


                          <div class="row">
                              <footer id="admin-footer" class="clearfix">
                                  <div class="pull-left"><b>Copyright </b>&copy; 2015</div>
                                  <div class="pull-right">admin system</div>
                              </footer>
                          </div>
                      </div>
                  </div>
              </div>
   


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="vendor/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    
                            


</body>
</html>