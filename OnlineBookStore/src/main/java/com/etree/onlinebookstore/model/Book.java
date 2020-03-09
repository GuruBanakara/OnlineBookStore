package com.etree.onlinebookstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookId", scope = Book.class)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private int numberOfPages;
	private String bookDescription;
	private String bookName;
	private double bookPrice;
	private String unitStock;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "categoryId")
	private Category bookCategory;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "authorId")
	private Author author;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public Category getBookCategory() {
		return bookCategory;
	}

	public Author getAuthor() {
		return author;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookCategory(Category bookCategory) {
		this.bookCategory = bookCategory;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public String getUnitStock() {
		return unitStock;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public void setUnitStock(String unitStock) {
		this.unitStock = unitStock;
	}

}
