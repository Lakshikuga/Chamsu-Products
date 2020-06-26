<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chamsu product</title>
<script language="javascript">

  
function validateform(){  
	 
  if((ContactNo.length() < 10) ||(ContactNo2.length() < 10)) {
		alert('Please Enter Valied Contact Number');
		document.myform.ContactNo.focus();
		return false;
	}

</script>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<div class="newclass">


<div class="w3l-main">
	<div class="w3l-from">
		<form name="myform" action="Sell" method="post">	
		
		<div class="w3l-lef1">
				
	<h1><B>Sell your product</B></h1>
		<h3><B>Enter Product Details</B>></h3>
<div class="gender">
				<div class="clear"></div>
				<label class="head" id="Ctd">Categary<span class="w3l-star">  </span></label>	
					<select class="form-control" name="Ctd">
						<option>catogary</option>
						<option>cinaman</option>
						<option>cily</option>
					</select></div>

			<div class="w3l-options2">
			<label class="head" id="Dis">Distric<span class="w3l-star">  </span></label>	
				<select class="category2" name="Dis">
						<option >Distric</option>
						<option >Colombo</option>
						<option >Negombo</option>
						<option >Galle</option>
						<option >Puththalam</option>
						
					</select>
			</div>
			
			<div class="clear"></div>
			
			<div class="w3l-num">
					<label class="head">Quntity<span class="w3l-star"> </span></label>
					<input type="text"  name="Qunty" value=""placeholder="KG" required="">
					<script>
  						$('#area').restrictLength($('#maxlength'));
						</script>
				</div>
			<div class="w3l-sym">
					<label class="head">Price<span class="w3l-star"> </span></label>
					<input type="text"name="Price" value=""placeholder="RS" required=""">
			</div><div class="clear"></div>
			</div>
			<div class="clear"></div>
			<div class="w3l-lef1">
				<h3><B>Enter Personal Details</B></h3>
			<div class="w3l-user">
				<label class="head">Name<span class="w3l-star"> </span></label>
				<input type="text" name="Name" placeholder="" required="" >
			</div>
			
				<div class="w3l-num">
					<label class="head">Contact No1<span class="w3l-star"> </span></label>
					<input type="text"  name="ContactNo" placeholder="" required="">
				</div>
			<div class="w3l-sym">
					<label class="head">Contact No2<span class="w3l-star">  </span></label>
					<input type="text" name="ContactNo2" placeholder="" required="">
			</div><div class="clear"></div>
			</div>
			<div class="w3l-user">
				<label class="head">Street Address<span class="w3l-star"> </span></label>
				<input type="text" name="StreetAddress" placeholder="" required="">
			</div>
			<div class="w3l-num">
					<label class="head">City<span class="w3l-star">  </span></label>
					<input type="text"  name="City" placeholder="" required="">
				</div>
			<div class="w3l-sym">
					<label class="head">State<span class="w3l-star">  </span></label>
					<input type="text" name="State" placeholder="" required="">
			</div>
			<div class="clear"></div>
			<div class="w3l-num">
					<label class="head">Postal / Zip Code<span class="w3l-star">  </span></label>
					<input type="text"  name="Postal" placeholder="" required="">
				</div>
			<div class="w3l-options2">
			<label class="head" id="Country">Country<span class="w3l-star"></span></label>	
				<select class="category2" name="Country">
						<option >Country</option>
						<option >Srilanka</option>
						<option >India</option>
						<option >China</option>
						<option >Pakisthan</option>
						<option >Australiya</option>
						<option >SriLanka</option>
						<option >Nepal</option>
						<option >Japan</option>
						<option >England</option>
						
					</select>
			</div>
			
			<div class="w3l-mail">
				<label class="head">Email<span class="w3l-star">  </span></label>
				<input type="email" name="Email" >
			</div>
			<div class="clear"></div>
			
							<div class="btn">
					
							   <input type="submit" id="btnValidityCheck" value="Submit" onclick="return validateform();" />
							
			</div>
			</form></div>					</div>
			
</div>
 

</body>
</html>