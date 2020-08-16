package com.order.orderitemservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.orderitemservice.entity.OrderItem;
import com.order.orderitemservice.exception.OrderItemNotFoundException;
import com.order.orderitemservice.service.OrderItemService;

@RestController
public class OrderItemController {
	
	@Autowired
	private OrderItemService service;
	
	
	@PostMapping("/order-item/create")
	public void createOrder(@Valid @RequestBody OrderItem orderItem) {
		service.createOrderItem(orderItem);
		
	}
	
	@GetMapping("/order-item/{productCode}")
	public OrderItem getOrderItemDetails(@PathVariable int productCode) throws OrderItemNotFoundException {
		return service.getOrderItemDetails(productCode);
	}
	
	@GetMapping("/order-items")
	public List<OrderItem> getAllOrderItemDetails() {
		return service.getAllOrderItemDetails();
	}

}
