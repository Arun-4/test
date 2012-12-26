(function($) {
	$.Class.extend("home.familyBudget.login",
			{
				init : function(el, data) {
					this.el = $(el);
					this.form = $('.loginForm', this.el);
					$(".btnSubmit", this.el).on('click',
							this.callback("onSubmitMethod"));
					this.form = this.form
							.validate({
								rules : {
									userName : {
										required : true
									},
									password : {
										required : true
									}
								},
								messages : {
									userName : {
										required : "Enter your user name"
									},
									password : {
										required : "Enter your password"
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