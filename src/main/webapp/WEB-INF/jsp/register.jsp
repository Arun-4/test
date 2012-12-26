<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/datepicker.css" rel="stylesheet">
<style>
body {
	padding: 10px 0px 0px 0px;
}
</style>
</head>
<body>
	<div class="container" id="register">
		<div class="row-fluid">
			<div class="span3"></div>
			<div class="span6">
				<form class="form-horizontal accountRegister boradered"
					method='post' action=''>
					<div class="control-group content">
						<div class="controls">
							<h1>Register</h1>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Family Name</label>
						<div class="controls">
							<input type="text" class="input-large" id="familyName"
								name="familyName" rel="popover"
								data-content="Enter your Family Name."
								data-original-title="Family Name">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">UserName</label>
						<div class="controls">
							<input type="text" class="input-large" id="userName"
								name="userName" rel="popover"
								data-content="Enter your user name."
								data-original-title="User Name">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Password</label>
						<div class="controls">
							<input type="password" class="input-large" id="password"
								name="password" rel="popover"
								data-content="Enter your password."
								data-original-title="Password">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Confirm Password</label>
						<div class="controls">
							<input type="password" class="input-large" id="confirmPassword"
								name="confirmPassword" rel="popover"
								data-content="Enter your confirm password."
								data-original-title="Confirm Password">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Name</label>
						<div class="controls">
							<input type="text" class="input-large" id="name" name="name"
								rel="popover" data-content="Enter your name."
								data-original-title="Name">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Date of Birth</label>
						<div class="controls">
							<input type="text" class="input-large datepicker" id="dob"
								name="dob" value="" data-date-format="dd M yyyy" />
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Mobile No</label>
						<div class="controls">
							<input type="text" class="input-large" id="mobNo" name="mobNo"
								rel="popover" data-content="Enter your mobile no."
								data-original-title="Mobile No">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Email</label>
						<div class="controls">
							<input type="text" class="input-large" id="email" name="email"
								rel="popover" data-content="What's your email address?"
								data-original-title="Email">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Street</label>
						<div class="controls">
							<input type="text" class="input-large" id="street" name="street"
								rel="popover" data-content="Enter your street."
								data-original-title="Street">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Location</label>
						<div class="controls">
							<input type="text" class="input-large" id="location"
								name="location" rel="popover"
								data-content="Enter your location."
								data-original-title="Location">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">City</label>
						<div class="controls">
							<input type="text" class="input-large" id="city" name="city"
								rel="popover" data-content="Enter your city."
								data-original-title="City">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">State</label>
						<div class="controls">
							<input type="text" class="input-large" id="state" name="state"
								rel="popover" data-content="Enter your state."
								data-original-title="State">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Country</label>
						<div class="controls">
							<input type="text" class="input-large" id="country"
								name="country" rel="popover" data-content="Enter your country."
								data-original-title="Country">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label"></label>
						<div class="controls">
							<button type="submit" class="btn btn-success btnSubmit">Create
								My Account</button>
							<button type="reset" class="btn">Clear</button>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label"></label>
						<div class="controls">
							Already Have Account. click here to <a href="login">Login</a>.
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/jquery/jquery-1.8.2.js"></script>
	<script src="js/jquery/jquery.validate.js"></script>
	<script src="js/jquery/lang.js"></script>
	<script src="js/jquery/class.js"></script>
	<script src="js/register.js"></script>
	<script src="js/bootstrap/bootstrap-datepicker.js"></script>


	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.register("#register", {});
		});
	</script>
</body>
</html>