package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class User {


	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;
	
	@Id
	@Column(name = "uname")

	private String uname;

	@Column(name = "upass")
	private String upass;
	


	public User() {

	}

	public User(String uname, String upass, String fname, String lname, String address, String phone) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserLogin [uname=" + uname + ", upass=" + upass + ", fname=" + fname + ", lname=" + lname + ", address="
				+ address + ", phone=" + phone + "]";
	}

}