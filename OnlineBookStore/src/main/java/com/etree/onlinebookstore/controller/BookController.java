package com.etree.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Book;
import com.etree.onlinebookstore.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/admin/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		Book book2 = service.save(book);
		return ResponseEntity.ok().body(book2);

	}

	@GetMapping("/admin/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		return ResponseEntity.ok().body(service.findAll());

	}

	@GetMapping("/book/{bookName}")
	public ResponseEntity<Book> getBookByBookName(@PathVariable String bookName) {
		Book book = service.findByBookName(bookName);
		return ResponseEntity.ok().body(book);

	}

}
