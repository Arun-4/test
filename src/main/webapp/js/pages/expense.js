(function($) {
	$.Class.extend("home.familyBudget.expense",
			{
				init : function(el, data) {
					this.el = $(el);
					this.form = $('.expense', this.el);
					$('input[name="expenseDate"]', this.el).datepicker();
					$(".btnBack", this.el).on('click',
							this.callback("onBackHandler"));
					$(".btnSubmit", this.el).on('click',
							this.callback("onSubmitMethod"));
					this.form = this.form
							.validate({
								rules : {

									exp_title : {
										required : true
									},
									expenseDate : {
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
						$.ajax(
								{
									url : 'expense',
									type : 'POST',
									data : {
										expTitle : $('input[name="expTitle"]')
												.val(),
										expenseDate : $(
												'input[name="expenseDate"]')
												.val(),
										expDesc : $('select[name="expDesc"]')
												.val(),
										amount : $('input[name="amount"]')
												.val()
									},
									msgprocessing : {
										hideMessage : true
									}
								}).done(function(data) {
							if (data.success) {
								bootbox.alert("Expense added successfully.");
							}
						});
					}

				},
				onBackHandler : function() {
					window.open('expenseList', '_self');
				}

			})
})(jQuery);