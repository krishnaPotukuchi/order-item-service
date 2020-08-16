package com.order.orderitemservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="order_item")
public class OrderItem {
	
	@Id
	@Column(name="product_code")
	@NotNull
	private int productCode;
	
	@Column(name="product_name")
	@NotNull
	@Size(min = 2, max = 50, message 
		      = "Product Name must be between 2 and 50 characters")
	private String productName;
	
	@Column
	@Min(value = 1, message = "Quantity should not be less than 1")
	private int quantity;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
}
