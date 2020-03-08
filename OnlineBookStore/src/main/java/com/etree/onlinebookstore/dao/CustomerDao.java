package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
