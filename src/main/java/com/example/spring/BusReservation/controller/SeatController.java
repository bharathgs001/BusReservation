package com.example.spring.BusReservation.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
import com.example.spring.BusReservation.model.Seat;
import com.example.spring.BusReservation.model.SeatNotFoundException;
import com.example.spring.BusReservation.service.SeatServices;

import jakarta.persistence.Entity;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	SeatServices seatservice;

	@GetMapping("/list")
	public ResponseEntity<List<Seat>> getSeats() {
		List<Seat> seats = seatservice.getSeat();

		return new ResponseEntity<List<Seat>>(seats, HttpStatus.ACCEPTED);
	}

	@GetMapping("/{seatno}")
	public ResponseEntity<Seat> findSeat(@PathVariable("seatno") int seatno) throws SeatNotFoundException {
		Seat seat = seatservice.findSeats(seatno);
		return new ResponseEntity<Seat>(seat, HttpStatus.OK);

	}
	@PostMapping
	public ResponseEntity<Seat> createOrUpdateSeat(@RequestBody Seat seat) throws SeatNotFoundException{
		Seat updated=seatservice.createOrUpdateSeat(seat);
		return new ResponseEntity<Seat>(updated,HttpStatus.CREATED);
	}

	@DeleteMapping("/{seatno}")
	public HttpStatus deleteSeat(@PathVariable("seatno") Integer seatno) throws BusNotFoundException {
		seatservice.deleteSeat(seatno);
		return HttpStatus.GONE;

	}
}
