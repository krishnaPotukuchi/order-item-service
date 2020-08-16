package com.order.orderitemservice.exception;

public class OrderItemNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public OrderItemNotFoundException() {
		super();
	}
	
	public OrderItemNotFoundException(String errorMessage, Throwable ex) {
		super(errorMessage, ex);
	}
	
	
	
}
