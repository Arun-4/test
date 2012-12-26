<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col" id ="mainDiv">
	<div>
        <h3>Add Account</h3>
        
        <div class="container">
			<div class="span9">
				<div class="container" id="bankaccount">
					<div class="row-fluid">
						<div class="offset2 span7">
								<fieldset>
									<legend>Bank Account</legend>
									<form class="form-horizontal bankaccount" method='post'>
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
													<option value="salary">Salary</option>
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
								</form>
								<div class="control-group">
									<label class="control-label"></label>
									<div class="controls">
										<button type="submit" class="btn btn-success btnSubmit">Save
											Changes</button>
										<button type="reset" class="btn">Clear</button>
										<button type="reset" class="btn btnBack btn-success">Back</button>
									</div>
								</div>
							</fieldset>
							
						</div>
					</div>
				</div>
			</div>
			<!--/span-->
		
	</div>
        
        
        
        
    </div>
</div>
<@macro.showFooter>
	<script type="text/javascript" src="js/pages/bankaccount.js"></script>
	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.register("#bankaccount", {});
		});
	</script>
</@macro.showFooter>
