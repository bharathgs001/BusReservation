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

	public Seat findSeat(Integer seatno) throws SeatNotFoundException{
		int count=seatno;
		Optional<Seat> seat=seatrepository.findById(seatno);
		
		if(seat.isPresent())
		{
			for(int i=1;i<=seatno;i++)
			{
				Seat newSeats=seat.get();
				newSeats.getSeatPrice();
			}
		return seat.get();
		}
		else
		{
			throw new SeatNotFoundException("seats not available");
		}
	}

	public Seat createOrUpdateSeats(Seat seatno) throws SeatNotFoundException{
		Optional<Seat> seat1=seatrepository.findById(seatno.getSeatNo());

		if(seat1.isPresent()) {
			Seat newSeats=seat1.get();
			newSeats.setSeatNo(4);
			newSeats.setSeatPrice(200);
		    newSeats=seatrepository.save(newSeats);
             return newSeats;
		}
		else {
			seatno=seatrepository.save(seatno);

			return seatno;
		}
		
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

	
}