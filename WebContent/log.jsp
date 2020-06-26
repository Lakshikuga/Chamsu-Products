<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Chamsu Sign-in Sign-up</title>
  
  
  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>

      <link rel="stylesheet" href="css\log.css">
     

  
</head>

<body>
	<form action="logservlet1" method ="post">
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Email Address</label>
					<input id="user" type="email" class="input" name="email">
				</div>
				<div class="group">
					<label for="pass" class="label">Type</label>
	                 <br>			
				<select name = "typeSelect">
					
  					
  					<option value="customer">Customer</option>
  					<option value="admin">Admin</option>
  					<option value="seller">Seller</option>
  					<option value="advertiser">Advertiser</option>
  
				</select>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password" name="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="ForgotPassword.jsp">Forgot Password?</a>
				</div>
			</div>
</form>

<!-- 	REGISTER FORM	BEGINS HERE	 -->

<form method="post" action="regservlet1">
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">First Name</label>
					<input id="user" type="text" class="input" name="firstName">
				</div>
				<div class="group">
					<label for="user" class="label">Last Name</label>
					<input id="user" type="text" class="input" name="lastName">
				</div>
				<div class="group">
					<label for="user" class="label">Email Address</label>
					<input id="user" type="email" class="input" name="email">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password" name="password">
				</div>
				<!-- - --div class="group">
					<label for="pass" class="label">Gender</label>
	                 <br>			
				<select name="gender">
					
  					<option value="male" >Male</option>
  					<option value="female">Female</option>
  
				</select>
				</div------>
				
				<div class="group">
					<label for="pass" class="label">Type</label>
	                 <br>			
				<select name = "typeSelect">
					
  					
  					<option value="customer">Customer</option>
  					
  					<option value="seller">Seller</option>
  					<option value="advertiser">Advertiser</option>
  
				</select>
				</div>
				
				
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
		</div>
	</div>
</div>
  
</form>


<c:if test="${not empty msg}">

<script>
	window.addEventListener("load", function(){
		alert("${msg}");
	})


</script>

</c:if>

</body>

</html>
