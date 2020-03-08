package com.etree.onlinebookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Author;
import com.etree.onlinebookstore.service.AuthorService;

@RestController
public class AuthorController {

	private AuthorService service;

	/**
	 * @param <S>
	 * @param entity
	 * @return
	 * @see com.etree.onlinebookstore.service.AuthorService#save(com.etree.onlinebookstore.model.Author)
	 */
	@PostMapping("/author")
	public <S extends Author> S save(S entity) {
		return service.save(entity);
	}

	/**
	 * @return
	 * @see com.etree.onlinebookstore.service.AuthorService#findAll()
	 */
	@GetMapping("authors")
	public List<Author> findAll() {
		return service.findAll();
	}
	
	
}
