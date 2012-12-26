package net.viralpatel.contact.model;

import java.util.Date;

public class AddEmployeeForm {

	private String employeeno;
	private String name;
	private String gender;
	private Date jd;
	private String mobNo1;
	private String mobNo2;
	private String address;

	public String getEmployeeno() {
		return employeeno;
	}

	public void setEmployeeno(String employeeno) {
		this.employeeno = employeeno;
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

	public Date getJd() {
		return jd;
	}

	public void setJd(Date jd) {
		this.jd = jd;
	}

	public String getMobNo2() {
		return mobNo2;
	}

	public void setMobNo2(String mobNo2) {
		this.mobNo2 = mobNo2;
	}

	public String getMobNo1() {
		return mobNo1;
	}

	public void setMobNo1(String mobNo1) {
		this.mobNo1 = mobNo1;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
