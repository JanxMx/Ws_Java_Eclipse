package com.javawebtutor.hibernate.model;

import java.util.Date;

public class Customer {

	private Long customerId;
	private String firstname;
	private String lastname;
	private Date birthDate;
	private String cellphone;
	private Bank bank;

	public Customer(String firstname, String lastname, Date birthDate,
			String cellphone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.cellphone = cellphone;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
