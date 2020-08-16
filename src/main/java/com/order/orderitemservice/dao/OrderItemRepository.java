package com.order.orderitemservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.orderitemservice.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	OrderItem findByProductCode(int ProductCode);
}
