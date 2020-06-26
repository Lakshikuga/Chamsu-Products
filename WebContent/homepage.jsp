<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 .mySlides {
        max-width: 1350px;
        position: relative;
        margin: auto;
        padding-top: 1px;
        padding-left: 2px;
    }
    
   
    table{
        width: 1200px;
        padding-left: 200px;
        padding-right: 100px;
        background-color:#BDBDBD;
		border:5px;
		border-color:black;
    }

    table img{
        padding : 40px;
        height:475px;
        width:450px;
    	padding-left:50px;
    }

    table tr td{
        font-family:"Times New Roman";
        padding:0px;
        width:350px;
    }
   
 
   
    p.a {
    font-style: italic;
    font-color:white;
    font-size:22px;
}
	p.f{
	font-family:"Comic Sans MS";
	font-size:22px;
	}
	p.s{
	font-size:30px;
	color:black;
	}
	p.s:hover{
	background-colour:black;
	color:red ;
	
	}
	
.gallery {
    margin: 0px;
    padding: 50px;
    float: center;
    width: 50px;
    height:30px;   
}
  table tr td{
padding:0px;
margin:1px;
}


button:hover{
 background-color:Red;
    color:#f5f5f5 ;
   border: 5px solid white;

}  
table.123 td:hover{
 background-color: black;
    color:#f5f5f5 ;

}  
table.123{
background:url("wp2024080-spice-wallpapers.jpg");
}

.gallery img {
    width: 225px;
    height:225px;
}

div.desc {
    width: 220px;
    padding: 20px;
    text-align: center;
}
button{
    float: right;
    background: #e5e6cf;
    border-radius: 0 5px 5px 0;
    cursor:pointer;
    position: relative;
    padding: 7px;
    font-family: 'Arial', sans-serif;
    border: none;
    font-size: 16px;
    width: 150px;
    border: 5px solid black;
}
</style>
</head>

<body>

 <!-- - --jsp:include page="header.jsp"></jsp:include----->

    <div style="max-width:1170px">
        <img class="mySlides" src= "spicy1.jpg"" style="width:1400px">   
      	<img class="mySlides" src="spicy2.jpg" style="width:1400px"> 
        <img class="mySlides" src="spicy5.jpg" style="width:1400px">  
    </div>

<br />
<br />
<h1 align="right" style=" font-size:18px;     font-family: 'Arial', sans-serif;" ><%String Uid =(String)session.getAttribute("firstName");
		out.println(Uid);%></h1>
	
<div>
<table align="center">
<p class="f" align="center">Ceylon Spices</p>
<tr>
<td id="a"><img  src= "spices-187x300.png" ></td>
<td>Sri Lanka has been part of the spice trade for millennia.
 As a country lying directly in both the marine and the terrestrial Silk Routes,
 it has almost always been a gateway between eastern and western Asia and its position bang 
 in the middle of the Indian Ocean has given the island the chance to be a springboard in terms of trade and travel. 
 Throughout Sri Lanka history many civilizations have disembarked here for commercial reasons.
 Not only are spices used in cooking but even the oriental medicinal practice of Ayurveda utilizes
 them in certain healing treatments. Cloves and nutmeg are Ayurvedic spices that are still used
 in their concentrated form in herbal toothpaste. Also, citronella is a great insect repellent and is sprayed around homes to ward off mosquitoes.
 First it was the Indo-Aryan groups and then onto civilizations 
 like the Greeks and Romans, there has always been exchange between us and foreigners.
 Finally when the Classical European civilizations fell, there was still trade by the Persian Empires
 (Parthian and Sassanian Dynasties) and the Chinese Ming and the Sri Vijaya and Cham Kingdoms of
 Indonesia and Malaysia respectively. The Silk Route was mostly a Chinese enterprise, manned by them for
  a number of years until the marine Silk Route was opened up by the post-medieval Europeans
<br />
</td>
</table>
<p class="f" align="center">We provide a wide range of Sri Lankan spices such as Ceylon true (pure) cinnamon, cloves, black & white pepper, nutmegs and desiccated coconut. Ceylon spices are traded all over the world from 14th century onwards. Sri Lankan spices are broadly used in food & beverages for unique flavor and aroma.

We are passionate about providing our customers the finest spices.

in the bellow we have shown the categories we have in a stocks. </p>









<p class="f" align="center"><b>"Come Buy Your Needs"</b></p>
<br />
<br />

<table align="center" class="123"style="background:url(wp2024080-spice-wallpapers.jpg) no-repeat;;">
<p class="s" align="center"  Style="font-family:Times New Roman; font-size:40px;">CATEGORIES</p>
    <tr>
        <td class="gallery">
            <img src="M5.jpg">
            <div class="desc"><b style="font-size:30px; colour:white;">Cinnoman</b><br/><button onclick="location.href='#'">Read more</button></div>
        </td>

        <td class="gallery">
            <img src="pepper.jpg">
            <div class="desc"><b style="font-size:30px; colour:white;">Black Pepper </b><br/><button onclick="location.href='#'">Read more</button></div>
        </td>

        <td class="gallery">
            <img src="untitled.png">
            <div class="desc"><b style="font-size:30px; colour:white;">Cloves</b><br/><button onclick="location.href='#'">Read more</button></div>
        </td>
	
	
	 <td class="gallery">
            <img src="thDFFBP4JU.jpg">  
            <div class="desc"><b style="font-size:30px; colour:dark black;">Cardamon</b><br/><button onclick="location.href='#'">Read more</button></div>
        </td>
</tr>
</table>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 10000); 
}
</script>


</div>

<br />
<br />
<br />
 <!--  --jsp:include page="footer.jsp"></jsp:include---->
 
 
 
</body>
</html>