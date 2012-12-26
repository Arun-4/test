package net.viralpatel.contact.model;

import java.util.Date;

public class ExpenseForm {

	private Date expenseDate;

	private String expTitle;

	private String expDesc;

	private double amount;

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public String getExpTitle() {
		return expTitle;
	}

	public void setExpTitle(String expTitle) {
		this.expTitle = expTitle;
	}

	public String getExpDesc() {
		return expDesc;
	}

	public void setExpDesc(String expDesc) {
		this.expDesc = expDesc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
