<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>

<@macro.showHeader />
<div class="inner-col" id ="mainDiv">
		<div class="container">
			  <!-- Example row of columns -->
			  <div class="row">
					<div class="span12">
						<h1>Hi <#if user?exists>${user.name} </#if>! Welcome to my application..</h1>
						<p>Thanks for visiting my application.</p>
					</div>
				</div>
		      <div class="row">
		        <div class="span4">
		          <h2>Account</h2>
		           <p>Your account related information ....</p>
		           <p>
		           	<#if bankAccounts?exists>
		           		<#list bankAccounts as bankAccount>
		           			<b>${bankAccount.bankName}</b><br />
		           		</#list>
		           	</#if>
		           </p>
		          <p><a href="accountList" class="btn">View details >></a></p>
		        </div>
		        <div class="span4">
		          <h2>Transactions</h2>
		           <p> For your account transaction related information..</p>
		           <p>
		           	<#if transitions?exists>
		           		<#list transitions as transition>
		           			<#if transition.bankname?exists><b>${transition.bankname}</b><br /></#if>
		           			Credits :<b>${transition.credit}</b><br />
		           			Debits :<b>${transition.debit}</b><br />
		           			Balance : <b>${transition.credit - transition.debit}</b><br />
		           		</#list>	
		           	<#else>
		           		<b>No Transitions.</b>
		           	</#if>
		           	
		           	</p>
		          <p><a href="incomeList" class="btn">View details >></a></p>
		       </div>
		        <div class="span4">
		          <h2>Expense</h2>
		          <p>For more details about your expense information.</p>
		          <p>
		          	<#if expenseAmount?exists>
		           		<#list expenseAmount as expense>
		           			Total Amount: <b><#if expense.amount?exists>${expense.amount}<#else>0</#if></b>
		           		</#list>	
		           	<#else>
		           		<b>No Expense.</b>
		           	</#if>
		          </p>
		          <p><a href="expenseList" class="btn">View details >></a></p>
		        </div>
	      </div>
</div></div>
<@macro.showFooter>
<style>
body{
background-image : -moz-radial-gradient(#CD7785 0%, #551350 100%);
background-color : rgb(205, 119, 133);
}
</style>
</@macro.showFooter>
