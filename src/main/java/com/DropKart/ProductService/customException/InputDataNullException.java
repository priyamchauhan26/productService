package com.DropKart.ProductService.customException;

public class InputDataNullException extends Exception {
	private String message;

	public InputDataNullException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InputDataNullException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InputDataNullException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	

	public InputDataNullException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InputDataNullException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	
	

}
