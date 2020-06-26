<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chamsu product delivery</title>

<link rel="stylesheet" type="text/css" href="css/style123.css">


</head>
<body>

<div class="newclass">


<div class="w3l-main">
	<div class="w3l-from">
		<form   action="delivery" method="post" >	
		<div class="w3l-lef1">
				
	
	
			<div class="w3l-lef1">
				<h3>Enter Delivery Details</h3>
			<div class="w3l-user">
		
				<label class="head">Name<span class="w3l-star"> * </span></label>
				<input type="text" name="uname" >
			</div>
			
				<div class="w3l-num">
			
					<label class="head">Contact Number<span class="w3l-star"> * </span></label>
					<input type="text"  name="hno" placeholder="" required >
				</div>
			<div class="w3l-sym">
				
					<label class="head">Mobile Number<span class="w3l-star"> * </span></label>
					<input type="text" name="mno" required >
			</div><div class="clear"></div>
			</div>
			<div class="w3l-user">
	
				<label class="head">Address<span class="w3l-star"> * </span></label>
				<input type="text" name="address" placeholder="" required>
			</div>
	
			<div class="clear"></div>
			<div class="w3l-user">

				<label class="head">City<span class="w3l-star"> * </span></label>
				<input type="text" name="city" placeholder="" required>
			</div>
			<div class="clear"></div>
			<div class="w3l-num">
				
					<label class="head">Postal / Zip Code<span class="w3l-star"> * </span></label>
					<input type="text"  name="postal" placeholder="" required>
				</div>
			<div class="clear"></div>
			
			<div class="w3l-mail">
				
				<label class="head">Email<span class="w3l-star"> * </span></label>
				<input type="email" name="email" placeholder="" required >
			</div>
			<div class="clear"></div>
			</div>	
				
				
				<input type="submit" name="submit"  value="submit" >
				
				
				
			</div>
			
</div>
	<div class="clear"></div>
		</form>
	</div>
</div>
</div> 



		
</body>
</html>