package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	User findByMailId(String mailId);

}
