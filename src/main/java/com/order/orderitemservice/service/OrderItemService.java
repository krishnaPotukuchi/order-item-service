package com.order.orderitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.orderitemservice.dao.OrderItemDAO;
import com.order.orderitemservice.entity.OrderItem;
import com.order.orderitemservice.exception.OrderItemNotFoundException;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemDAO dao;
	
	public void createOrderItem(OrderItem orderItem) {
		 dao.createOrderItem(orderItem);
	}
	

	public OrderItem getOrderItemDetails(int productCode) throws OrderItemNotFoundException {
		OrderItem orderItem = dao.getOrderItemDetails(productCode);
		if(orderItem == null) {
			throw new OrderItemNotFoundException();
		}
			
		return orderItem;
	}
	
	public List<OrderItem> getAllOrderItemDetails() {
		return dao.getAllOrderItemDetails();
	}
	
}
