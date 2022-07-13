<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="Style/login.css">
<title>Registration</title>
</head>
<body>
<div class="jumbotron">
	<h2>REGISTRATION PAGE</h2>
	 <a href="LoginPage.jsp" class="btn"id="btn1">Login</a> 
</div>	
<div class="container">
	<div class=row>
		<div class="col-sm-5 mx-auto">
			<form action="">
				<div class="form-group">
				<label>User Name</label>
				<input type="text" name="userid" class="form-control" placeholder="UserID">
				</div>
				<div class="form-group">
				<label>Select Gender</label>
				<select name="Category" class="form-control" id="categor" >
					<option value="">--Please choose an option--</option>
  					<option value="Male">Male</option>
  					<option value="Female">Female</option>
				</select>
				</div>
				<div class="form-group">
				<label>Password</label>
				<input type="text" name="pass" class="form-control" placeholder="Password">
				</div>
				<div class="form-group">
				<label>Confirm Password</label>
				<input type="text" name="Cpass" class="form-control" placeholder=" confirm Password">
				</div>
				<input type="submit" value ="Submit" name="" class="btn" placeholder="Password">
			</form>
		</div>
	</div>
</div>
</body>
</html>