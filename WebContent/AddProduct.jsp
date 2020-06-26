<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="vendor/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/chosen_v1.8.7/chosen.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/summernote-master/summernote-master/dist/summernote.css">
    <link rel="stylesheet" type="text/css" href="vendor/fontawesome-free-5.3.1-web/fontawesome-free-5.3.1-web/css/fontawesome.min.css">
    <link rel="stylesheet" type="text/css" href="admin/css/default.css">
    <link rel="stylesheet" type="text/css" href="admin/css/addProduct.css">

    <title>Admin</title>
    
    <!-- -script language="javascript">
    	function validateForm()
    	{
    		var n=document.forms["myform"]["proname"].value;
    			if(n==""){
    				alert("Product Name must be filled out");
    				return false;
    			}
    	}
    
    
    
    
    </script----->
    
    
   <script language="javascript">

	function addProducts(){
		
		if(document.addProductForm.proname.value==""){
			alert('Please input Product name');
			document.addProductForm.proname.focus();
			return false;
		}
		
		if(document.addProductForm.category.value==""){
			alert('Please select a category');
			document.addProductForm.category.focus();
			return false;
		}
		
		if(document.addProductForm.price.value==""){
			alert('Please enter the unit price');
			document.addProductForm.price.focus();
			return false;
		}
		
		if(document.addProductForm.qty.value==""){
			alert('Please enter the quantity in kg');
			document.addProductForm.qty.focus();
			return false;
		}
		
	
	
		
		document.addProductForm.submit();
	}
</script>
  </head>
  
  
  <body>
      <div class="container-fluid display-table">
          <div class="row display-table-row">
              
              <!--side-menu-->
              <div class="col-md-2 col-sm-1 hidden-xs display-table-cell valign-top" id="side-menu">
                  <h1 class="hidden-xs hidden-sm">Navigation</h1>
                  <ul>
                      <li class="link">
                          <a href="Admin.jsp">
                              <span class="glyphicon glyphicon-th" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">Dashboard</span>
                          </a>
                      </li>
                      
                
                      
                      <li class="link active">
                          <a href="#collapse-product" data-toggle="collapse" aria-controls="collapse-product">
                              <span class="glyphicon glyphicon-gift" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">Product Management</span>
                              <!--span class="label label-success pull-right">20</span--->
                          </a>
                          <ul class="collapse collapseable" id="collapse-product">
                              <li>
                              <a href="AddProduct.jsp">Add Products
                              <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
                              <span class="label label-success pull-right hidden-sm hidden-xs">10</span>
                              </a></li>
                              
                              <li>
                              <a href="deletePro.jsp">Delete Products
                              <span class="glyphicon glyphicon-minus-sign" aria-hidden="true"></span>
                              <span class="label label-warning pull-right hidden-sm hidden-xs">10</span>
                              </a></li>
                              
                              <li>
                              <a href="viewproducts.jsp">View Products
                              <span class="glyphicon glyphicon-minus-sign" aria-hidden="true"></span>
                              <span class="label label-warning pull-right hidden-sm hidden-xs">10</span>
                              </a></li>
                          </ul>
                      </li>
                      
                       
                      
                           <li class="link">
                          <a href="UserManage.jsp">
                              <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">User Management</span>
                          </a>
                      </li>
                      
                           <li class="link">
                          <a href="AddAdmin.jsp">
                              <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">Admin User Management</span>
                          </a>
                      </li>
                      
                           <li class="link">
                          <a href="Order.jsp">
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
                          <a href="Merchant.jsp">
                              <span class="glyphicon glyphicon-qrcode" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">Merchant Management</span>
                          </a>
                      </li>
                      
                         <li class="link">
                          <a href="Advertisers.jsp">
                              <span class="glyphicon glyphicon-film" aria-hidden="true"></span>
                              <span class="hidden-sm hidden-xs">Advertiser Management</span>
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
                       <header>
                           <h2 class="page-title">Add Products</h2>
                            <button type="button" class="btn btn-xs btn-primary pull-right" onclick="location.href='viewproducts.jsp'">View Products</button>
                       </header> 
                        
                        <div class="content-inner">
                            <div class="form-wrapper">
                                
                                <form name="addProductForm" action="AddPro" onsubmit="return addProducts()"  method="post"  enctype="multipart/form-data">
                                
                                    <!-- -- --div class="form-group">
                                        <label class="sr-only">Title</label>
                                        <input type="number" class="form-control" name="proid" placeholder="Product Id">
                                    </div------->
                                    
                                       <div class="form-group">
                                        <label class="sr-only">Name</label>
                                        <input type="text" class="form-control" name="proname" placeholder="Product Name">
                                    </div>
                                    
                                     <!---div class="form-group">
                                        <label class="sr-only">Product Id</label>
                                    </div----->
                                    
                                     <div class="form-group">
                                        <label class="sr-only">Category Name</label>
                                        <select data-placeholder="Select category" name="category"  class="form-control chosen-select">
                                        <option></option>
                                        <option>Seeds</option>
                                        <option>Fruits</option>
                                        <option>Leaves</option>
                                        <option>plants and trees</option>
                                        <option>other</option>
                                         </select>
                                    </div>
                                    
                                      <!-- -- --div class="form-group">
                                        <label class="sr-only">Description</label>
                                        <textarea class="form-control summernote" placeholder="Description"  name="desc"></textarea>
                                    </div------->
                                    
                                      <div class="form-group">
                                        <label class="sr-only">Product Price</label>
                                        <input type="text" class="form-control" name="price" placeholder="Product Price">
                                    </div>
                                    
                                       <div class="form-group">
                                        <label class="sr-only">Qty</label>
                                        <input type="text" class="form-control" name="qty" placeholder="Quantity in kg">
                                    </div>
                                    
                                <div class="form-group">
                                        <label class="sr-only">	Image Link</label>
                                        <input type="file" name="imgfile">
                                    </div>
                                    
                                  
                                    
                                    
                                    <div class="clearfix">
                                        <button type="submit" name="submit" class="btn btn-primary pull-right">Save</button> 
                                    </div>
                                </form>
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
    <script src="vendor/chosen_v1.8.7/chosen.jquery.min.js"></script>
    <script src="vendor/summernote-master/summernote-master/dist/summernote.min.js"></script>
    <script src="admin/js/default.js"></script>
    
    <script type="text/javascript">
      var config={
          '.chosen-select':{},
          '.chosen-select-deselect':{allow_single_deselect:true},
          '.chosen-select-single':{disable_search_threshold:10},
          '.chosen-select-no-result':{no_results_text:'Oops, nothing found!'},
          '.chosen-select-width':{width:"95%"}
      }
      
      for(var selector in config){
          $(selector).chosen(config[selector]);
      }
      
      </script>
      
      <script type="text/javascript">
          $('.summernote').summernote({
              height:200
          })
      </script>
  
<c:if test="${not empty msg }">

<script>
	window.addEventListener("load", function(){
		alert("${msg}");
	})

</script>

</c:if>    
      



</body>

</html>