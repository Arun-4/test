<#import "/spring.ftl" as spring />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Employee</title>
	<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/bootstrap/datepicker.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<style>
		body {
			padding: 0px;
			background-color : white;
		}
	</style>
</head>
<body>
	<div class="container" id="addEmployee">
		<div class="row-fluid">
			<div class="span3"></div>
			<div class="span6">
				<form class="form-horizontal addEmployeeForm boradered"
					method='post' action=''>
					<div class="control-group">
						<div class="controls">
							<h1>Add Employee</h1>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Employee No</label>
						<div class="controls">
							<input type="text" class="input-large" id="employeeno"
								name="employeeno">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Name</label>
						<div class="controls">
							<input type="text" class="input-large" id="name"
								name="name">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Gender</label>
						<div class="controls">
							<select name="gender" class="input-large">
								<option value="">--Select--</option>
								<option value="M">Male</option>
								<option value="F">Female</option>
							</select>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Join Date</label>
						<div class="controls">
							<input type="text" class="input-large datepicker" id="jd"
								name="jd" value="" data-date-format="dd M yyyy" />
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label">Mobile No</label>
						<div class="controls">
							<input type="text" class="input-large" id="mobNo1" name="mobNo1">
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label">Alternate No</label>
						<div class="controls">
							<input type="text" class="input-large" id="mobNo2" name="mobNo2">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">Address</label>
						<div class="controls">
							<textarea id="address" name="address" class="input-large"></textarea>
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label">Attachement</label>
						<div class="controls">
							<input type="file" name="file" id="file" />
						</div>
					</div>

					<div class="control-group">
						<label class="control-label"></label>
						<div class="controls">
							<button type="submit" class="btn btn-success btnSubmit">Add</button>
							<button type="reset" class="btn">Clear</button>
							<button type="reset" class="btn btn-success btnBack">Back</button>
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
<script src="js/bootstrap/bootstrap-datepicker.js"></script>
<script src="js/pages/addEmployee.js"></script>
<script>
	jQuery(document).ready(function() {
		new home.familyBudget.addEmployee("#addEmployee", {});
	});
</script>
</body>
</html>
