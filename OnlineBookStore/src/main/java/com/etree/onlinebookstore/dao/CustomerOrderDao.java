package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.CustomerOrder;

@Repository
public interface CustomerOrderDao extends JpaRepository<CustomerOrder, Integer> {

}
