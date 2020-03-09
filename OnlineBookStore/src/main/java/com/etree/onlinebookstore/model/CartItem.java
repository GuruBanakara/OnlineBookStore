package com.etree.onlinebookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cartItemId", scope = CartItem.class)
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartItemId;
	private int quantity;
	private double totalPrice;

	@ManyToOne
	@JoinColumn(name = "bookId")
	private Book book;

	@ManyToOne
	@JsonIgnore
	private Cart cart;

	public int getCartItemId() {
		return cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public Book getBook() {
		return book;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
