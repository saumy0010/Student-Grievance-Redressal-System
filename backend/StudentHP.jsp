<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home Page</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="Style/login.css">
<link rel="stylesheet" href="Style/login.css">
 <script src="js/jquery-3.5.1.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
<script>
$(function(){

			$("#cmpl").click(function(){
				alert("complain match..!!");
					var category=$("#category").val();
					var cmpln=$("#cmpln").val();
					var uid=$("#uid").val();
					if(cmpln!=="" && category!==""){
						alert("complain match..!!");
						$.post("scompln",
								{"category":category,"cmpln":cmpln,"uid":uid},
								function(output){
									window.location ='StudentHP.jsp'
					  
									}
								});8395
					}
					else{$(".msg").html("Warning: This is a warning alert!");
						 $('.alert').addClass("show");
					        $('.alert').removeClass("hide");
					        $('.alert').addClass("showAlert");
					        setTimeout(function(){
					          $('.alert').removeClass("show");
					          $('.alert').addClass("hide");
					        },5000);
					        $('.close-btn').click(function(){
					            $('.alert').removeClass("show");
					            $('.alert').addClass("hide");
					          });
					}
					//$.post(url,data,outputfunction);
				
				});
	
});
</script>
<div class="jumbotron">
	<h2>Student Home Page</h2>
	<h4><b><%=session.getAttribute("fname") %></b> <b><%=session.getAttribute("lname") %></b> </h4> 
	<a href="logout" class="btn"id="btn1">Log out</a> 

</div>	
<div class="container">
	<div class=row>
		<div class="col-sm-5 mx-auto">
		<b name="uid" id="uid"><%=session.getAttribute("uid") %></b>
			<div class="form-group">
				<label>Select Category</label>
				<select name="category" class="form-control" id="category" required >
					<option value="">--Please choose an option--</option>
  					<option value="Staff">Staff</option>
  					<option value="faculty">Faculty</option>
 					<option value="course">Course</option>
 					<option value="fees">Tuition, Fees and other charges</option>
 					<option value="Other">Other</option>
				</select>
			</div>
			<div class="form-group">
				<label>Complain Box</label>
				<textarea id="cmpln" name=" cmpln"cols="50" rows="5" style="border:solid 3px green;" placeholder="Please Enter The Complain">
				</textarea>
			</div>
			<input type="button" value ="Submit" name="cmpl" id="cmpl" class="btn">
		</div>
	</div>


</div>
</body>
</html>