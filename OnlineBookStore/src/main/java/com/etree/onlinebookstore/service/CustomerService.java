package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CustomerDao;
import com.etree.onlinebookstore.dao.UserDao;
import com.etree.onlinebookstore.model.Customer;
import com.etree.onlinebookstore.model.User;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public Customer save(Customer entity) {
		entity.getUser().setPassword(passwordEncoder.encode(entity.getUser().getPassword()));
		return dao.save(entity);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public User findCustomerByMailId(String mailId) {
		return userDao.findByMailId(mailId);

	}

}
