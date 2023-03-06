package com.example.spring.BusReservation.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PassengerNotFoundException extends RuntimeException{
	public  PassengerNotFoundException(String exception) {
		super(exception);
	}
	public  PassengerNotFoundException(String exception, Throwable t) {
		super(exception, t);
	}
}