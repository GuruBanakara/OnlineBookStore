package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao dao;
}
