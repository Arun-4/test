(function($) {
	$.Class
			.extend(
					"home.familyBudget.addEmployee",
					{
						init : function(el, data) {
							this.el = $(el);
							$('input[name="jd"]',this.el).datepicker();
							this.form = $('.addEmployeeForm', this.el);
							$(".btnBack", this.el).on('click',
									this.callback("onBackHandler"));
							$(".btnSubmit", this.el).on('click',
									this.callback("onSubmitMethod"));
							this.form = this.form
									.validate({
										rules : {
											name : {
												required : true
											},
											gender : {
												required : true
											},
											jd : {
												required : true
											},
											mobNo1 : {
												required : true
											},
											address : {
												required : true
											}
										},
										messages : {
											name  :{
												required : "Enter your name"
											},
											gender  :{
												required : "Select valid gender"
											},
											jd : {
												required : 'Select valid date.'
											},
											mobNo1 : {
												required : 'Enter valid mobile number.'
											},
											address : {
												required : 'Enter valid address'
											}
										},
										errorClass : "help-inline",
										errorElement : "span",
										highlight : function(element,
												errorClass, validClass) {
											$(element)
													.parents('.control-group')
													.removeClass('success');
											$(element)
													.parents('.control-group')
													.addClass('error');
										},
										unhighlight : function(element,
												errorClass, validClass) {
											$(element)
													.parents('.control-group')
													.removeClass('error');
											$(element)
													.parents('.control-group')
													.addClass('success');
										}
									});

						},
						onSubmitMethod : function() {
							if (this.form.valid()) {

							}

						},
						onBackHandler : function() {
							window.open('employeeList', '_self');
						}

					})
})(jQuery);