package net.viralpatel.contact.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EXPENSE")
public class Expense {

	@Id
	@GenericGenerator(name = "pk_expense", strategy = "increment")
	@GeneratedValue(generator = "pk_expense")
	@Column(name = "CID")
	private Integer id;

	@Column(name = "EXPENSEDATE")
	private Date expenseDate;

	@ManyToOne
	@JoinColumn(name = "USERID")
	private User user;

	@Column(name = "EXP_TITLE")
	private String expTitle;

	@Column(name = "EXP_DESC")
	private String expDesc;

	@Column(name = "AMOUNT")
	private double amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
