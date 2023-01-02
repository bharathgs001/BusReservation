package com.example.spring.BusReservation.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BusNotFoundException extends RuntimeException{
	public BusNotFoundException(String exception) {
		super(exception);
	}
	public BusNotFoundException(String exception, Throwable t) {
		super(exception, t);
	}
}