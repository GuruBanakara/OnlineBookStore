package com.etree.onlinebookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.BookDao;
import com.etree.onlinebookstore.model.Book;

@Service
public class BookService {

	@Autowired
	private BookDao dao;

	public Book save(Book book) {
		return dao.save(book);
	}

	public List<Book> findAll() {
		return dao.findAll();
	}

	public Book findByBookName(String bookName) {
		return dao.findByBookName(bookName);
	}
}
