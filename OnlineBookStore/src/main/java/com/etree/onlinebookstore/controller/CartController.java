package com.etree.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService  service;
}
