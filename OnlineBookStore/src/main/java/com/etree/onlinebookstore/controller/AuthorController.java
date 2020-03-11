package com.etree.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Author;
import com.etree.onlinebookstore.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService service;

	@PostMapping("/admin/author")
	public Author save(@RequestBody Author entity) {
		return service.save(entity);
	}

	@GetMapping("/admin/authors")
	public List<Author> findAll() {
		return service.findAll();
	}

}
