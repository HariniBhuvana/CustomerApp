package com.capg.customer.exception;

public class CustomerAlreadyExistException extends RuntimeException {

	public CustomerAlreadyExistException(String message) {
		super(message);
	}
}