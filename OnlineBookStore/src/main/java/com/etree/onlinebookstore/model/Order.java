package com.etree.onlinebookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(initialValue = 10000000, name = "order")
public class Order {
	@Id
	@GeneratedValue(generator = "order", strategy = GenerationType.IDENTITY)
	private long orderId;

}
