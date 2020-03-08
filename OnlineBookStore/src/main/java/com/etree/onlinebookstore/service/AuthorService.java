package com.etree.onlinebookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.AuthorDao;
import com.etree.onlinebookstore.model.Author;

@Service
public class AuthorService {

	private AuthorDao dao;

	/**
	 * @param <S>
	 * @param entity
	 * @return
	 * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
	 */
	public <S extends Author> S save(S entity) {
		return dao.save(entity);
	}

	/**
	 * @return
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	public List<Author> findAll() {
		return dao.findAll();
	}
}
