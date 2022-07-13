<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="Style/login.css">
  
<title>Login Page</title>
</head>
<body>
<div class="jumbotron">
	<h2>LOGIN PAGE</h2>
	<a href="Registeration.jsp" class="btn" id="btn1">Registration</a> 
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
				<label>Select Category</label>
				<select name="Category" class="form-control" id="categor" >
					<option value="">--Please choose an option--</option>
  					<option value="Admin">Admin</option>
  					<option value="Student">Student</option>
 					<option value="Grievnce Member">Grievnce Member</option>
 					<option value="Teacher">Teacher</option>
				</select>
				</div>
				<div class="form-group">
				<label>Password</label>
				<input type="text" name="pass" class="form-control" placeholder="Password">
				</div>
				<input type="submit" value ="Submit" name="" class="btn" placeholder="Password">
			</form>
		</div>
	</div>
</div>
</body>
</html>