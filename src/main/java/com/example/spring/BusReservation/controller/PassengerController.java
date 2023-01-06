package com.example.spring.BusReservation.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BusReservation.model.Passenger;
import com.example.spring.BusReservation.model.PassengerNotFoundException;
import com.example.spring.BusReservation.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	@Autowired
	PassengerService passengerService;
	@PostMapping
	public ResponseEntity<Passenger> createOrUpdatePassengers(@RequestBody Passenger passenger) throws PassengerNotFoundException{
		Passenger updated=passengerService.createOrUpdatePassengers(passenger);
		return new ResponseEntity<Passenger>(updated,new HttpHeaders(),HttpStatus.CREATED);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Passenger>>getPassengers() throws PassengerNotFoundException{
		List<Passenger> list= passengerService.getPassengers1();

		return new ResponseEntity<List<Passenger>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}