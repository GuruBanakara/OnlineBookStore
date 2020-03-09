
package com.etree.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etree.onlinebookstore.model.CartItem;

@Repository
public interface CartItemDao extends JpaRepository<CartItem, Integer> {

}
