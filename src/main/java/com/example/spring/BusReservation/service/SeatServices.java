package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.spring.BusReservation.model.Seat;
import com.example.spring.BusReservation.model.SeatNotFoundException;
import com.example.spring.BusReservation.repository.SeatRepository;

import jakarta.transaction.Transactional;

@Service
public class SeatServices {

	@Autowired
	SeatRepository seatrepository;
	
	public List<Seat> getSeat(){
		List<Seat> seats=seatrepository.findAll();
		if(seats.size()>0)
		{
			return seats;
		}
		else {
			return new ArrayList<Seat>();
		}
		
	}

	public Seat getSeatById(Integer seatno) throws SeatNotFoundException{
		Optional<Seat> seat=seatrepository.findById(seatno);
		if(seat.isPresent())
		{
		return seat.get();
		}
		else
		{
			throw new SeatNotFoundException("seats not available");
		}
	}
	@Transactional
	public Seat createOrUpdateSeats(Seat seat) throws SeatNotFoundException{
		Optional<Seat> seat1=seatrepository.findById(seat.getSeatNo());

		if(seat1.isPresent()) {
			Seat newSeats=seat1.get();
			newSeats.setSeatNo(0);
			newSeats.setSeatPrice(500);
			
			newSeats=seatrepository.save(newSeats);

			return newSeats;
		}
		return null;
		
	}
	public void deleteSeat(Integer seatno) throws SeatNotFoundException{
		Optional<Seat> seats = seatrepository.findById(seatno);

		if(seats.isPresent()) {
			seatrepository.deleteById(seatno);
		}
		else {
			throw new SeatNotFoundException("No such seats found");
		}
	}

	public Seat findSeat(int seatno) {
		// TODO Auto-generated method stub
		return null;
	}
}
