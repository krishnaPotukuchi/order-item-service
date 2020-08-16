package com.order.orderitemservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.orderitemservice.entity.OrderItem;

@Repository
public class OrderItemDAO {
	
	@Autowired
	private OrderItemRepository repository;
	
	public void createOrderItem(OrderItem orderItem) {
		 repository.save(orderItem);
	}
	
	public OrderItem getOrderItemDetails(int productCode) {
		return repository.findByProductCode(productCode);
	}
	
	
	public List<OrderItem> getAllOrderItemDetails() {
		return repository.findAll();
	}

}
