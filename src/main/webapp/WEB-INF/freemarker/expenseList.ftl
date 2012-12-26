<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col">
    <h3>Expenses Info</h3>
    <div class="row-fluid">
    	<div class="span11">
    		<a href="expense"><button type="submit" class="btn btn-success addExpense pull-right">Add Expense</button></a><br /><br />
    	</div>
    </div>
    <div class="container span11">
    	<table class="table table-bordered expenseList">
    		<tr>
    			<th>Expense Date</th>
    			<th>Expense Title</th>
    			<th>Amount</th>
    			<th>Delete</th>
    		</tr>
    		<#list expenses as expense>
    			<tr class="exp-${expense.id}">
    				<td><#if expense.expenseDate?exists>${expense.expenseDate?string("dd MMM yyyy")}</#if></td>
    				<td><#if expense.expTitle?exists>${expense.expTitle}</#if></td>
    				<td><#if expense.amount?exists>${expense.amount}</#if></td>
    				<td><#if expense.id?exists><span style="cursor:pointer;" class="deleteExpense" delete-id="${expense.id}">Delete</a></#if></td>
    			</tr>
    		</#list>
    	</table>
    </div>
</div>
<@macro.showFooter>
<script>
jQuery(document).ready(function() {
			jQuery(".deleteExpense").click(function(){
				jQuery.ajax(
								{
									url : 'deleteExpense',
									type : 'GET',
									data : {
										id : jQuery(this).attr('delete-id')
									},
									msgprocessing : {
										hideMessage : true
									}
								}).done(function(data) {
							if (data.success && data.deletedid) {
								jQuery('.expenseList tr.exp-'+data.deletedid).empty();
								bootbox.alert("Expense deleted successfully.");
							}
						});
			});
		});
</script>
</@macro.showFooter>
