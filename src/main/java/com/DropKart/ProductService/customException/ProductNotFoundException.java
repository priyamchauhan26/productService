package com.DropKart.ProductService.customException;

public class ProductNotFoundException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	
	

}
