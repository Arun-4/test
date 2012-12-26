<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col">
    <h3>Income Info</h3>
    <div class="row-fluid">
    	<div class="span11">
    		<a href="income"><button type="submit" class="btn btn-success addIncome pull-right">Add Income</button></a><br /><br />
    	</div>
    </div>
    <div class="container span11">
    	<table class="table table-bordered transitionList">
    		<tr>
    			<th>Bank Name</th>
    			<th>Transition Date</th>
    			<th>Transaction Type</th>
    			<th>Amount</th>
    			<th>Delete</th>
    		</tr>
    		<#list transactions as transaction>
    			<tr class="trans-${transaction.id}">
    			<td>${transaction.bankId.bankName}</td>
    			<td>${transaction.transitionDate?string("dd MMM yyyy")}</td>
    			<td>
    				${transaction.code}
    			</td>
    			<td>
	    			<#if transaction.code == 'credit'>
	    				${transaction.credit}
	    			<#else>
	    				${transaction.debit}
	    			</#if>
    			</td>
    			<td><#if transaction.id?exists><span style="cursor:pointer;" class="deleteTransaction" delete-id="${transaction.id}">Delete</a></#if></td>
    		</tr>
    		</#list>
    	</table>
    </div>
</div>
<@macro.showFooter>
<script>
jQuery(document).ready(function() {
			jQuery(".deleteTransaction").click(function(){
				jQuery.ajax(
								{
									url : 'deleteTransaction',
									type : 'GET',
									data : {
										id : jQuery(this).attr('delete-id')
									},
									msgprocessing : {
										hideMessage : true
									}
								}).done(function(data) {
							if (data.success && data.deletedid) {
								jQuery('.transitionList tr.trans-'+data.deletedid).empty();
								bootbox.alert("Transition deleted successfully.");
							}
						});
			});
		});
</script>
</@macro.showFooter>