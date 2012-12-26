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
@Table(name = "TRANSITION")
public class Transition {

	@Id
	@GenericGenerator(name = "pk_transition", strategy = "increment")
	@GeneratedValue(generator = "pk_transition")
	@Column(name = "CID")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "BANKID")
	private BankAccount bankId;

	@ManyToOne
	@JoinColumn(name = "USERID")
	private User user;

	@Column(name = "CREDIT")
	private double credit;

	@Column(name = "DEBIT")
	private double debit;

	@Column(name = "CODE")
	private String code;

	@Column(name = "TRANSITIONDATE")
	private Date transitionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BankAccount getBankId() {
		return bankId;
	}

	public void setBankId(BankAccount bankAccount) {
		this.bankId = bankAccount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	
	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
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
