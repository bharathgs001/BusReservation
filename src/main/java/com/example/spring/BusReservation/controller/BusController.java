package com.example.spring.BusReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BusReservation.model.Bus;
import com.example.spring.BusReservation.model.BusNotFoundException;
import com.example.spring.BusReservation.service.BusService;
@RestController
@RequestMapping("/bus")
public class BusController {

	@Autowired
	BusService busesService;

	@GetMapping
	public ResponseEntity<List<Bus>>getBuses(){
		List<Bus> list= busesService.getBuses();

		return new ResponseEntity <List<Bus>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	@GetMapping("/{busno}")
	public ResponseEntity<Bus> getBusesById(@PathVariable("busno") int busno) throws BusNotFoundException{
		Bus entity=busesService.getBusesById(busno);

		return new ResponseEntity<Bus>(entity,new HttpHeaders(),HttpStatus.ACCEPTED);
	}

	@PostMapping
	public ResponseEntity<Bus> createOrUpdateBuses(@RequestBody Bus bus) throws BusNotFoundException{
		Bus updated=busesService.createOrUpdateBuses(bus);
		return new ResponseEntity<Bus>(updated,new HttpHeaders(),HttpStatus.CREATED);
	}

	@DeleteMapping("/{busno}")
	public HttpStatus deleteBuses(@PathVariable("busno") Integer busno) throws BusNotFoundException{
		busesService.deleteBuses(busno);
		return HttpStatus.GONE;
	}
}
