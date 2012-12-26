package net.viralpatel.contact.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tblemployee")
public class Employee {

	@Id
	@GenericGenerator(name = "pk_tblemployee", strategy = "increment")
	@GeneratedValue(generator = "pk_tblemployee")
	@Column(name = "CID")
	private Integer id;

	@Column(name = "employeeno")
	private String employeeNo;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "joindate")
	private Date joinDate;

	@Column(name = "address")
	private String address;

	@Column(name = "mobNo1")
	private String mobNo1;

	@Column(name = "mobNo2")
	private String mobNo2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNo1() {
		return mobNo1;
	}

	public void setMobNo1(String mobNo1) {
		this.mobNo1 = mobNo1;
	}

	public String getMobNo2() {
		return mobNo2;
	}

	public void setMobNo2(String mobNo2) {
		this.mobNo2 = mobNo2;
	}

}
