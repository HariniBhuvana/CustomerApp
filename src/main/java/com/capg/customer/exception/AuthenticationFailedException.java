package com.capg.customer.exception;

public class AuthenticationFailedException extends RuntimeException {

	public AuthenticationFailedException(String message) {
		super(message);
	}
}
