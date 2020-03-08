package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CartDao;

@Service
public class CartService {

	@Autowired
	private CartDao dao;
	
}
