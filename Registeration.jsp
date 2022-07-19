<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="Style/login.css">
	<script src="js/jquery-3.5.1.js"></script>
	<script src="js/bootstrap.js"></script>
<title>Registration</title>
</head>
<body>
<script>
$(function(){
	$("#cpass").blur(function(){
		var pass=$("#pass").val();
		var cpass=$("#cpass").val();
		
		if(pass!==cpass || cpass=="" ){
			alert("Password not match..!!");
			$(".msg").html("Password not matched");
			$("#pass").val("");
			$("#cpass").val("");
		}
	});
	$("#userid").blur(function(){
		var userid=$(this).val();
		$.post("SVerifyuser",
				{"userid":userid},
				function(output){
					if(output.trim()=="no"){
						$(".msg").html("Please try again");
						$("#userid").val("");
					}
					else{
						$(".msg").html("Username available");
					}
				});
	
	
	});
});
</script>

<div class="jumbotron">
	<h1>Student Griveance System</h1>
	<h5>REGISTRATION PAGE</h5>
	<a href="LoginPage.jsp" class="btn"id="btn1">Login</a> 
</div>	
<div class="container">
	<div class=row>
		<div class="col-sm-5 mx-auto">
			<form action="sreg" method="post">
				<div class="form-group">
				<div class="row">
					<div class="col-sm-5">
						<label>First Name</label>
						<input type="text" required name="fname" id="fname" class="form-control" placeholder="First Name">
					</div>
					<div class="col-sm-5">
						<label>Last Name</label>
						<input type="text" required name="lname" id="lname" class="form-control" placeholder="Last Name">
					</div>
				</div>
				</div>
				<div class="form-group">
					<label>Email ID</label>
					<input type="text" required  name="userid" id="userid" class="form-control" placeholder="Email ID">
				</div>
				<div class="form-group">
					<label>Password</label>
					<input type="password" required name="pass" id="pass" class="form-control" placeholder="Password">
				</div>
				<div class="form-group">
					<label>Confirm Password</label>
					<input type="password" name="cpass" id="cpass" class="form-control" placeholder=" confirm Password">
				</div>
				<input type="submit" value ="Submit" name="" class="btn" placeholder="Password">
			</form>
		</div>
	</div>
</div>
</body>
</html>