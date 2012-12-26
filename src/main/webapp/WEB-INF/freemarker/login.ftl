<#import "/spring.ftl" as spring />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Family Budget - Login Page</title>
	<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<style>
		body {
			padding: 0px;
			background-image : -moz-radial-gradient(#CD7785 0%, #551350 100%);
			background-color : rgb(205, 119, 133);
			color : white;
		}
	</style>
</head>
<body>
	<div class="container" id="login">
		<div class="loginPopup">
			<div class="span3"></div>
			<div class="span6" style="background: none repeat scroll 0 0 rgba(255, 255, 255, 0.2);">
				<form class="form-horizontal loginForm boradered"
					action="login" method='post' action=''>
					<div class="control-group">
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
							<button type="submit" class="btn btn-primary btnSubmit">Login</button>
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
			<div class="span3"></div>
		</div>
	</div>
</div>
<script src="js/jquery/jquery-1.8.2.js"></script>
<script src="js/jquery/jquery.validate.js"></script>
<script src="js/jquery/lang.js"></script>
<script src="js/jquery/class.js"></script>
<script src="js/pages/login.js"></script>
<script>
	jQuery(document).ready(function() {
		new home.familyBudget.login("#login", {});
	});
</script>
</body>
</html>