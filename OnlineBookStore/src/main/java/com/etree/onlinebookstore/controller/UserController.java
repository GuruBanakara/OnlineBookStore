package com.etree.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	/*
	 * @GetMapping("/login") public String login(@RequestParam(value = "error",
	 * required = false) String error,
	 * 
	 * @RequestParam(value = "logout", required = false) String logout, Model model)
	 * { if (error != null) model.addAttribute("error",
	 * "Invalid username and Password"); if (logout != null)
	 * model.addAttribute("logout", "You have logged out successfully"); return
	 * "login"; }
	 */

}
