(function($) {
	$.Class
			.extend(
					"home.familyBudget.register",
					{
						init : function(el, data) {
							this.el = $(el);
							this.form = $('.bankaccount', this.el);
							$(".btnSubmit", this.el).on('click',
									this.callback("onSubmitMethod"));
							this.form = this.form
									.validate({
										rules : {
											bankName : {
												required : true
											},
											accountNo : {
												required : true
											},
											accountType : {
												required : true
											},
											branchName : {
												required : true
											},
											bankLocation : {
												required : true
											}
										},
										messages : {
											bankName : {
												required : "Enter valid bank name."
											},
											accountNo : {
												required : "Enter valid account number."
											},
											accountType : {
												required : 'Select valid account type.'
											},
											branchName : {
												required : "Enter valid branch name."
											},
											bankLocation : {
												required : "Enter valid bank location."
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