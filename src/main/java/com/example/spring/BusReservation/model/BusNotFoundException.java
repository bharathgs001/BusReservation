package com.example.spring.BusReservation.model;


@SuppressWarnings("serial")


public class BusNotFoundException extends RuntimeException {

	
		public BusNotFoundException(String exception) {
			super(exception);
		}
		public BusNotFoundException(String exception, Throwable t) {
			super(exception, t);
		}
	}

