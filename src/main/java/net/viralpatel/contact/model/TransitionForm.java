package net.viralpatel.contact.model;

import java.util.Date;

public class TransitionForm {

	private Integer id;

	private int bankName;

	private double Amount;

	private String code;

	private Date transitionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBankName() {
		return bankName;
	}

	public void setBankName(int bankName) {
		this.bankName = bankName;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getTransitionDate() {
		return transitionDate;
	}

	public void setTransitionDate(Date transitionDate) {
		this.transitionDate = transitionDate;
	}

}
