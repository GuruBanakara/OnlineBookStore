package com.etree.onlinebookstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "customerId", scope = Customer.class)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String phoneNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User users;

	@OneToOne
	@JoinColumn(name = "cartId")
	@JsonIgnore
	private Cart cart;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
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

	public User getUser() {
		return users;
	}

	public void setUser(User user) {
		this.users = user;
	}

}
