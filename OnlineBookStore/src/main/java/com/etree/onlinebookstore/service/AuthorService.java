package com.etree.onlinebookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.AuthorDao;
import com.etree.onlinebookstore.model.Author;

@Service
public class AuthorService {

	@Autowired
	private AuthorDao dao;

	public Author save(Author entity) {
		return dao.save(entity);
	}

	public List<Author> findAll() {
		return dao.findAll();
	}
}
