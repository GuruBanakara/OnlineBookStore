package com.etree.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Cart;
import com.etree.onlinebookstore.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService service;

	@PostMapping("/cart")
	public Cart save(@RequestBody Cart entity) {
		return service.save(entity);
	}

	@GetMapping("cartItems")
	public List<Cart> findAll() {
		return service.findAll();
	}

}
