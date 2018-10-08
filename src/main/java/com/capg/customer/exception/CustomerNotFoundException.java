package com.capg.customer.exception;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String message) {
		super(message);
	}
}
