package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer> {

}
