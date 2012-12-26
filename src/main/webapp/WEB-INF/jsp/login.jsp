<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<style>
body {
	padding: 0px;
}
</style>
</head>
<body>
	<div class="container" id="register">
		<div class="row-fluid">
			<div class="span4"></div>
			<div class="span5">
				<form class="form-horizontal accountRegister loginPopup boradered"
					action="login" method='post' action=''>
					<div class="control-group content">
						<div class="controls">
							<h1>Login</h1>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">UserName</label>
						<div class="controls">
							<input type="text" class="input-medium" id="userName"
								name="userName" rel="popover"
								data-content="Enter your user name."
								data-original-title="User Name">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Password</label>
						<div class="controls">
							<input type="password" class="input-medium" id="password"
								name="password" rel="popover"
								data-content="Enter your password."
								data-original-title="Password">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label"></label>
						<div class="controls">
							<button type="submit" class="btn btn-success btnSubmit">Login</button>
							<button type="reset" class="btn">Clear</button>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label"></label>
						<div class="controls">
							Create New Account click <a href="register">here</a>.
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
	<script src="js/jquery/ui/jquery.ui.core.js"></script>
	<script src="js/jquery/ui/jquery.ui.widget.js"></script>
	<script src="js/jquery/ui/jquery.ui.datepicker.js"></script>
	<script src="js/register.js"></script>


	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.register("#register", {});
		});
	</script>
</body>
</html>