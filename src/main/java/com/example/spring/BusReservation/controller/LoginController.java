package com.example.spring.BusReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BusReservation.model.Passenger;
import com.example.spring.BusReservation.model.PassengerNotFoundException;
import com.example.spring.BusReservation.service.PassengerService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	PassengerService passengerService;
	
	@PostMapping
	public ResponseEntity<Passenger> createOrUpdatePassengers(@RequestBody Passenger passenger) throws PassengerNotFoundException{
		Passenger updated=passengerService.createOrUpdatePassengers(passenger);
		return new ResponseEntity<Passenger>(updated,new HttpHeaders(),HttpStatus.CREATED);
	}
}
