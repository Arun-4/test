(function($) {
	$.Class
			.extend(
					"home.familyBudget.register",
					{
						init : function(el, data) {
							this.el = $(el);
							$('input[name="dob"]',this.el).datepicker();
							this.form = $('.accountRegister', this.el);
							$(".btnSubmit", this.el).on('click',
									this.callback("onSubmitMethod"));
							this.form = this.form
									.validate({
										rules : {
											familyName : {
												required : true
											},
											userName : {
												required : true
											},
											password : {
												required : true
											},
											confirmPassword : {
												required : true,
												equalTo : "#password"
											},
											name : {
												required : true
											},
											dob : {
												required : true
											},
											mobNo : {
												required : true
											},
											email : {
												required : true,
												email : true
											},
											location : {
												required : true
											},
											street : {
												required : true
											},
											city : {
												required : true
											},
											state : {
												required : true
											},
											country : {
												required : true
											}
										},
										messages : {
											familyName : {
												required : "Enter your family name"
											},
											userName : {
												required : "Enter your user name"
											},
											password : {
												required : "Enter your password"
											},
											confirmPassword : {
												required : "Enter confirm password",
												equalTo : "Password and Confirm Password must match"
											},
											name  :{
												required : "Enter your name"
											},
											dob : {
												required : 'Select valid date.'
											},
											mobNo : {
												required : 'Enter valid mobile number.'
											},
											email : {
												required : 'Enter valid email.',
												email : 'Enter valid email.'
											},
											location : {
												required : 'Enter valid location'
											},
											street : {
												required : 'Enter valid street address'
											},
											city : {
												required : 'Enter valid city'
											},
											state : {
												required : 'Enter valid State'
											},
											country : {
												required : 'Enter valid country'
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

						}

					})
})(jQuery);