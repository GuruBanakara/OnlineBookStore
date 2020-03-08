package com.etree.onlinebookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CategoryDao;
import com.etree.onlinebookstore.model.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryDao dao;

	public Category save(Category category) {
		return dao.save(category);
	}

	public List<Category> findAll() {
		return dao.findAll();
	}
}
