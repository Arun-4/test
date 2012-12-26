<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col" id ="mainDiv">
	<div>
        <h3>Add Expense</h3>
	</div>
	<div class="container">
		<div class="row-fluid">
			<div class="span3">
			</div>
			<!--/span-->
			<div class="span9">
				<div class="container" id="pgexpense">
					<div class="row-fluid">
						<div class="span7">
								<fieldset>
							
									<legend>Expense Information</legend>
									<form class="form-horizontal expense" method='post'>
									<div class="control-group">
										<label class="control-label">Title</label>
										<div class="controls">
											<input type="text" class="input-large" id="expTitle"
												name="expTitle" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Date</label>
										<div class="controls">
											<input type="text" class="input-large" id="expenseDate"
												name="expenseDate" data-date-format="dd M yyyy" />
										</div>
									</div>
									
									<div class="control-group">
										<label class="control-label">Description</label>
										<div class="controls">
											<textarea rows="3" cols="10" name="expDesc"></textarea>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Amount</label>
										<div class="controls">
											<input type="text" class="input-large" id="amount"
												name="amount" />
										</div>
									</div>
									</form>
									<div class="control-group">
										<label class="control-label"></label>
										<div class="controls">
											<button type="submit" class="btn btn-success btnSubmit">Save
												Changes</button>
											<button type="reset" class="btn">Clear</button>
											<button type="reset" class="btn btn-success btnBack">Back</button>
										</div>
									</div>
								</fieldset>
						</div>
					</div>
				</div>
			</div>
		</div></div>
	</div>


<@macro.showFooter>
	<script type="text/javascript" src="js/pages/expense.js"></script>
	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.expense("#pgexpense", {});
		});
	</script>
</@macro.showFooter>
