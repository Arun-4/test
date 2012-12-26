<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col">
    <h3>Employee Info</h3>
    <div class="row-fluid">
    	<div class="span11">
    		<a href="addEmployee"><button type="submit" class="btn btn-success addEmployee pull-right">Add Employee</button></a><br /><br />
    	</div>
    </div>
    <div class="container span11">
    	<table class="table table-bordered">
    		<tr>
    			<th>Name</th>
    			<th>Join Date</th>
    			<th>Mobile No</th>
    			<th>Address</th>
    			<th>Delete</th>
    		</tr>
    		<#list employees as employee>
    			<tr>
    				<td>${employee.name}</td>
    				<td>${employee.joinDate?string("dd MMM yyyy")}</td>
    				<td>${employee.mobNo1}</td>
    				<td>${employee.address}</td>
    				<td><a href="deleteEmployee/${employee.id}">Delete</a></td>
    			</tr>
    		</#list>
    	</table>
    </div>
</div>
<@macro.showFooter />
