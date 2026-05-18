package com.example.customer.exception;

public class NoSuchCustomerExistsException extends RuntimeException{
	public NoSuchCustomerExistsException(String message) {
        super(message);
    }

}
