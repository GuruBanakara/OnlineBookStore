package com.etree.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Category;
import com.etree.onlinebookstore.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		return service.save(category);

	}

	@GetMapping("categories")
	public List<Category> getAllCategories() {
		return service.findAll();

	}
}
