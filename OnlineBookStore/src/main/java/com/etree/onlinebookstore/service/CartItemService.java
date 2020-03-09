package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.CartItemDao;
import com.etree.onlinebookstore.model.CartItem;

@Service
public class CartItemService {

	@Autowired
	private CartItemDao dao;

	public CartItem save(CartItem entity) {
		return dao.save(entity);
	}

	public void delete(CartItem entity) {
		dao.delete(entity);
	}

	public void deleteAll() {
		dao.deleteAll();
	}

}
