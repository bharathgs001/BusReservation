package com.example.spring.BusReservation.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SeatNotFoundException extends RuntimeException {
	public  SeatNotFoundException(String exception) {
		super(exception);
	}
	public  SeatNotFoundException(String exception, Throwable t) {
		super(exception, t);
	}
}
