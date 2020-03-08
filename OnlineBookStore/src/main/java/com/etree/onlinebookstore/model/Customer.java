package com.etree.onlinebookstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String phoneNumber;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
	@JsonIgnore
	private Cart cart;

	@OneToOne(cascade = CascadeType.ALL)
	private Address customerAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Cart getCart() {
		return cart;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
