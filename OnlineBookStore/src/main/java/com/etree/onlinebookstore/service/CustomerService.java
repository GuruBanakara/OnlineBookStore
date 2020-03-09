package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CustomerDao;
import com.etree.onlinebookstore.dao.UserDao;
import com.etree.onlinebookstore.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Autowired
	private UserDao userDao;

	public Customer save(Customer entity) {
		return dao.save(entity);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public Customer findCustomerByMailId(String mailId) {
		return userDao.findByMailId(mailId);

	}

}
