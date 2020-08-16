package com.order.orderitemservice.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.order.orderitemservice.exception.OrderItemNotFoundException;

@ControllerAdvice
public class OrderItemNotFoundExceptionHandler
	extends ResponseEntityExceptionHandler {
		 
	    @ExceptionHandler(value =  OrderItemNotFoundException.class)
	    protected ResponseEntity<Object> handleConflict(
	      RuntimeException ex, WebRequest request) {
	        String bodyOfResponse = "Order item Not Found";
	        return handleExceptionInternal(ex, bodyOfResponse, 
	          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	    }
}
