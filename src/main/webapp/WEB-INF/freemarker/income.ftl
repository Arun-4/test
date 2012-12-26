<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col" id ="mainDiv">
	<div>
        <h3>Add New Transaction</h3>
        <div class="container">
			<div class="span9">
				<div class="container" id="pgincome">
					<div class="row-fluid">
						<div class="offset2 span7">
								<fieldset>

									<legend>Income Information</legend>
									<form class="form-horizontal income" method='post'>
									<div class="control-group">
										<label class="control-label">Bank</label>
										<div class="controls">
											<select name="bankName">
												<option value="">--Select--</option>
												<#list bankAccounts as account>
													<#if account.bankName??>
														<option value="${account.id!''}">${account.bankName!''}</option>
													</#if>
												</#list>
											</select>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Transition Date</label>
										<div class="controls">
											<input type="text" class="input-large" id="transitionDate"
												name="transitionDate" data-date-format="dd M yyyy" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label">Transition Type</label>
										<div class="controls">
											<select name="code" class="code">
												<option value="">--Select--</option>
												<option value="credit">Credit</option>
												<option value="debit">Debit</option>
											</select>
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
			<!--/span-->
			</div>
		</div>
	 </div>
</div>
<@macro.showFooter>
	<script type="text/javascript" src="js/pages/income.js"></script>
	<script>
		jQuery(document).ready(function() {
			new home.familyBudget.income("#pgincome", {});
		});
	</script>
</@macro.showFooter>
