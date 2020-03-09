package com.etree.onlinebookstore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.User;
import com.etree.onlinebookstore.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public User save(User entity) {
		return service.save(entity);
	}

	public Optional<User> findById(Integer id) {
		return service.findById(id);
	}

	public void delete(User entity) {
		service.delete(entity);
	}

}
