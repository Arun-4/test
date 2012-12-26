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
@Table(name = "BANKACCOUNT")
public class BankAccount {

	@Id
	@GenericGenerator(name = "bankaccount", strategy = "increment")
	@GeneratedValue(generator = "bankaccount")
	@Column(name = "CID")
	private Integer id;

	@Column(name = "BANKNAME")
	private String bankName;

	@Column(name = "ACCOUNTNO")
	private String accountNo;
	
	@ManyToOne
	@JoinColumn(name = "USERID")
	private User user;

	@Column(name = "BRANCHNAME")
	private String branchName;

	@Column(name = "BANKLOCATION")
	private String bankLocation;

	@Column(name = "ACCOUNTTYPE")
	private String accountType;

	@Column(name = "MODIFIEDDATE")
	private Date modifiedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
