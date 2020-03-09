package com.etree.onlinebookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.UserDao;
import com.etree.onlinebookstore.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public User save(User entity) {
		return dao.save(entity);
	}

	public Optional<User> findById(Integer id) {
		return dao.findById(id);
	}

	public void delete(User entity) {
		dao.delete(entity);
	}

}
