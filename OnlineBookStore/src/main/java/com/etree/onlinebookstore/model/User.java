package com.etree.onlinebookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String mailId;
	private String password;
	private boolean enabled;

	@OneToOne(mappedBy = "user")
	private Customer customer;

	public int getUserId() {
		return userId;
	}

	public String getMailId() {
		return mailId;
	}

	public String getPassword() {
		return password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
