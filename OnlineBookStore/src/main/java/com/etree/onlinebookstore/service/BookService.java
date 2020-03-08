package com.etree.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.BookDao;

@Service
public class BookService {

	@Autowired
	private BookDao dao;
}
