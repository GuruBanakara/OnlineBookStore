package com.etree.onlinebookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CartDao;
import com.etree.onlinebookstore.model.Cart;

@Service
public class CartService {

	@Autowired
	private CartDao dao;

	public  Cart save(Cart entity) {
		return dao.save(entity);
	}

	public Optional<Cart> findById(Integer id) {
		return dao.findById(id);
	}

	

}
