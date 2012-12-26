(function($) {
	$.Class.extend("home.familyBudget.expense",
			{
				init : function(el, data) {
					this.el = $(el);
					this.form = $('.expense', this.el);
					$('input[name="expenseDate"]',this.el).datepicker();
					$(".btnSubmit", this.el).on('click',
							this.callback("onSubmitMethod"));
					this.form = this.form
							.validate({
								rules : {
									expenseDate : {
										required : true
									},
									exp_title : {
										required : true
									},
									amount : {
										required : true
									}
								},
								messages : {
									expenseDate : {
										required : "Select valid date."
									},
									exp_title : {
										required : "Enter valid title."
									},
									amount : {
										required : 'Enter valid amount.'
									}
								},
								errorClass : "help-inline",
								errorElement : "span",
								highlight : function(element, errorClass,
										validClass) {
									$(element).parents('.control-group')
											.removeClass('success');
									$(element).parents('.control-group')
											.addClass('error');
								},
								unhighlight : function(element, errorClass,
										validClass) {
									$(element).parents('.control-group')
											.removeClass('error');
									$(element).parents('.control-group')
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