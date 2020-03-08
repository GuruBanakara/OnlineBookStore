package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

	public Book findByBookName(String bookName);

}
