<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col">
    <h3>Account Info</h3>
    <div class="row">
    	<div class="span11">
    		<a href="account"><button type="submit" class="btn btn-success btnAdd pull-right">Add Account</button><br /></a><br />
    	</div><div class="span1"></div>
    </div>
    <div class="span11">
    	<table class="table table-bordered accountList">
    		<tr>
    			<th>Bank Name</th>
    			<th>Account No</th>
    			<th>Branch Name</th>
    			<th>Branch Location</th>
    			<th>Delete</th>
    		</tr>
    		<#list bankAccounts as account>
	    		<tr class="acc-${account.id}">
	    			<td>${account.bankName!''}</td>
	    			<td>${account.accountNo!''}</td>
	    			<td>${account.branchName!''}</td>
	    			<td>${account.bankLocation!''}</td>
	    			<td><span style="cursor:pointer;" class="deleteAccount" delete-id="${account.id}">Delete</a></td>
	    		</tr>
    		</#list>
    	</table>
    </div><div class="span1"></div>
</div>
<@macro.showFooter>
<script>
jQuery(document).ready(function() {
			jQuery(".deleteAccount").click(function(){
				jQuery.ajax(
								{
									url : 'deleteAccount',
									type : 'GET',
									data : {
										id : jQuery(this).attr('delete-id')
									},
									msgprocessing : {
										hideMessage : true
									}
								}).done(function(data) {
							if (data.success && data.deletedid) {
								jQuery('.accountList tr.acc-'+data.deletedid).empty();
								bootbox.alert("Account deleted successfully.");
							}
						});
			});
		});
</script>
</@macro.showFooter>
