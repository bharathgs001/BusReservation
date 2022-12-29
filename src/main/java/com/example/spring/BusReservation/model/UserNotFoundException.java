package com.example.spring.BusReservation.model;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String exception) {
		super(exception);
		
	}
	public UserNotFoundException (String exception,Throwable t) {
		super(exception,t);
	}
		
	}


