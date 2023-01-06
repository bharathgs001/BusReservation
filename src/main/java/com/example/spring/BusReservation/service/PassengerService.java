package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.BusReservation.model.Passenger;
import com.example.spring.BusReservation.model.PassengerNotFoundException;
import com.example.spring.BusReservation.repository.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	PassengerRepository passengerRepository;

	public Passenger createOrUpdatePassengers(Passenger passenger) throws PassengerNotFoundException{
		Optional<Passenger> passenger1=passengerRepository.findById(passenger.getName());

		if(passenger1.isPresent()) {
			Passenger newPassengers=passenger1.get();
			newPassengers.setName("kishore");
			newPassengers.setGender("male");
			newPassengers.setAge(24);

			newPassengers=passengerRepository.save(newPassengers);

			return newPassengers;
		}
		else {
			passenger=passengerRepository.save(passenger);

			return passenger;
		}
	}
	public List<Passenger> getPassengers1(){
		List<Passenger> passenger=passengerRepository.findAll();

		if (passenger.size()>0) {
			return passenger;
		}
		else {
			return new ArrayList<Passenger>();
		}
	}
}
