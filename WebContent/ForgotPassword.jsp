<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>

<link rel="stylesheet" type="text/css" href="css/forgotPassword.css">
</head>
<body>

<script language="javascript">

	function forgtSubmit(){
		
		if(document.ForgotPassword.em.value==""){
			alert('Please input email');
			document.ForgotPassword.em.focus();
			return false;
		}
		
		if(document.ForgotPassword.pw.value==""){
			alert('Please input Old Password');
			document.ForgotPassword.pw.focus();
			return false;
		}
		
		if(document.ForgotPassword.npw.value==""){
			alert('Please input New Password');
			document.ForgotPassword.npw.focus();
			return false;
		}
		
		if(document.ForgotPassword.cpw.value==""){
			alert('Please input Confirm Password');
			document.ForgotPassword.cpw.focus();
			return false;
		}
		
		if(document.ForgotPassword.npw.value!=document.ForgotPassword.cpw.value){
			alert('Passwords do not match');
			document.ForgotPassword.cpw.focus();
			return false;
		}
	
		
		document.ForgotPassword.submit();
	}
</script>


<div class="login-box">
    <div class="imgcontainer">
        
        <img src="user.png" class="user"></div>
    <h1>Reset Password</h1>
    
    <form name="ForgotPassword" action="ForgotPassword" method="post" onsubmit="return forgtSubmit();">
    
   		<p>E-mail</p>
   		<input type="text" name="em" placeholder="Enter Email">
   		
        <p>Old Password</p>
        <input type="password" name="pw" id="pw" placeholder="Enter Old Password">
        
        <p>New Password</p>
        <input type="password" name="npw" id="npw" placeholder="Enter New Password">
       
       	<p>Confirm Password</p>
        <input type="password" name="cpw" id="cpw" placeholder="Confirm Password">
        
        <input type="submit" name="submit" value="Change Password">
        
     
		
    </form>
</div>

<c:if test="${not empty msg}">

<script>
	window.addEventListener("load", function(){
		alert("${msg}");
	})


</script>

</c:if>



</body>
</html>