package com.example.spring.BusReservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.Bus;
import com.example.spring.BusReservation.model.BusNotFoundException;
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
		return null;
		
	}

	public Seat findSeats(int seatno) {
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
	public Seat createOrUpdateSeat(Seat seat) throws SeatNotFoundException{
		Optional<Seat> seat1=seatrepository.findById(seat.getSeatNo());

		if(seat1.isPresent()) {
			Seat newSeat=seat1.get();
			newSeat.setSeatNo(100);
			newSeat.setSeatPrice(200);
			
			newSeat=seatrepository.save(newSeat);

			return newSeat;
		}
		else {
			seat=seatrepository.save(seat);

			return seat;
		}
		
	}
	public void deleteSeat(Integer seatno) throws BusNotFoundException{
		Optional<Seat> seats = seatrepository.findById(seatno);

		if(seats.isPresent()) {
			seatrepository.deleteById(seatno);
		}
		else {
			throw new BusNotFoundException("No such buses found");
		}
	}
}
