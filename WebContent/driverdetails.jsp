<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
</head>
<body>
<div class="newclass">


<div class="w3l-main">
	<div class="w3l-from">
		<form action="driverdetails" method="post">	
		<div class="w3l-lef1">
				
	
	
			<div class="w3l-lef1">
				
			<div class="w3l-user">
				<label class="head">Name<span class="w3l-star"> * </span></label>
				<input type="text" name="Uname" >
			</div>
			
				<div class="w3l-num">
					<label class="head">Contact Number<span class="w3l-star"> * </span></label>
					<input type="text"  name="HNumber" placeholder="" >
				</div>
			<div class="w3l-sym">
					<label class="head">Driver License number<span class="w3l-star"> * </span></label>
					<input type="text" name="MNumber" >
			</div><div class="clear"></div>
			</div>
			<div class="w3l-user">
				<label class="head">National Id <span class="w3l-star"> * </span></label>
				<input type="text" name="National" placeholder="" required="">
			</div>
			<div class="clear"></div>
			<div class="w3l-num">
					<label class="head">Date of Birth<span class="w3l-star"> * </span></label>
					<input type="text"  name="Date" placeholder="" required="">
				</div>
				<div class="clear"></div>
			<div class="w3l-num">
			<label class="head">vehicle type<span class="w3l-star"> * </span></label>
					<input type="text"  name="vehicle" placeholder="" required="">
						
						

			</div>
			<div class="clear"></div>
			
			
			<div class="clear"></div>
			
			<div class="w3l-mail">
				<label class="head">Email<span class="w3l-star"> * </span></label>
				<input type="email" name="email" placeholder="" required="">
			</div>
			<div class="clear"></div>
			</div>	
				
				
				<input type="submit" name="submit"  value="SUBMIT" >
				
				
				
			</div>
			
</div>
	<div class="clear"></div>
		</form>
		
		
	</div>	
	</body>
	</html>	