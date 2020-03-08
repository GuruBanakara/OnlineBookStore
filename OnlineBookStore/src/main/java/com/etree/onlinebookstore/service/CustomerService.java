package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CustomerDao;
import com.etree.onlinebookstore.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;

	public  Customer save(Customer entity) {
		return dao.save(entity);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

}
