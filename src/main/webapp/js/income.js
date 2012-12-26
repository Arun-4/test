(function($) {
	$.Class
			.extend(
					"home.familyBudget.income",
					{
						init : function(el, data) {
							this.el = $(el);
							this.form = $('.income', this.el);
							$('input[name="transitionDate"]', this.el).datepicker();
							$(".btnSubmit", this.el).on('click',
									this.callback("onSubmitMethod"));
							this.form = this.form
									.validate({
										rules : {
											bankName : {
												required : true
											},
											transitionDate : {
												required : true
											},
											code : {
												required : true
											},
											amount : {
												required : true
											}
										},
										messages : {
											bankName : {
												required : "Select valid Bank."
											},
											transitionDate : {
												required : "select valid date."
											},
											code : {
												required : 'Select valid transition type.'
											},
											amount : {
												required : 'Enter the valid amount.'
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