<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Account Information</title>
<!-- Le styles -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<body>


	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">Project name</a>
				<div class="btn-group pull-right">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i> ${user.userName } <span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li class="divider"></li>
						<li><a href="logout">Sign Out</a></li>
					</ul>
				</div>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#about">About</a></li>
						<li><a href="#contact">Contact</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Add</li>
						<li><a href="homePage">Home</a></li>
						<li class="active"><a href="bankAccount">BankAccount</a></li>
						<li><a href="expense">Expense</a></li>
						<li><a href="income">Income</a></li>
						<li class="nav-header">Edit</li>
						<li><a href="#">BankAccount</a></li>
						<li><a href="#">Expense</a></li>
						<li><a href="#">Income</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<div class="span9">
				<div class="container" id="bankaccount">
					<div class="row-fluid">
						<div class="offset2 span7">
							<form class="form-horizontal bankaccount" method='post' action=''>
								<fieldset>

									<legend>Bank Account</legend>

									<div class="control-group">
										<label class="control-label">Bank Name</label>
										<div class="controls">
											<input type="text" class="input-large" id="bankName"
												name="bankName" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Account Number</label>
										<div class="controls">
											<input type="text" class="input-large" id="accountNo"
												name="accountNo" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Account Type</label>
										<div class="controls">
											<select name="accountType">
												<option value="">--Select--</option>
												<option value="savings">Savings</option>
												<option value="current">Current</option>
											</select>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Bank Branch</label>
										<div class="controls">
											<input type="text" class="input-large" id="branchName"
												name="branchName" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Bank Location</label>
										<div class="controls">
											<input type="text" class="input-large" id="bankLocation"
												name="bankLocation" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label"></label>
										<div class="controls">
											<button type="submit" class="btn btn-success btnSubmit">Save
												Changes</button>
											<button type="reset" class="btn">Clear</button>
										</div>
									</div>
								</fieldset>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!--/span-->
		</div>
	</div>
	<hr>

	<footer>
	<p>&copy; Company 2012</p>
	</footer>

	</div>
	<script src="js/jquery/jquery-1.8.2.js"></script>
	<script src="js/bootstrap/bootstrap.js"></script>
	<script src="js/bootstrap/bootstrap.min.js"></script>
	<script src="js/bootstrap/bootstrap-dropdown.js"></script>

	<script src="js/jquery/jquery.validate.js"></script>
	<script src="js/jquery/lang.js"></script>
	<script src="js/jquery/class.js"></script>
	<script src="js/bankaccount.js"></script>


	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.register("#bankaccount", {});
		});
	</script>
</body>
</html>