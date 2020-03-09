package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CustomerOrderDao;
import com.etree.onlinebookstore.model.CustomerOrder;

@Service
public class CustomerOrderService {

	@Autowired
	private CustomerOrderDao dao;

	public CustomerOrder save(CustomerOrder entity) {
		return dao.save(entity);
	}
	

}
