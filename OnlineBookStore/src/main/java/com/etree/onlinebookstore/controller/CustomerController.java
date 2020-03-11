package com.etree.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Cart;
import com.etree.onlinebookstore.model.Customer;
import com.etree.onlinebookstore.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;


	@PostMapping("/register")
	public Customer save(@RequestBody Customer customer) {
		customer.setCart(new Cart());
		return service.save(customer);
	}

	@DeleteMapping("/user/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

}
