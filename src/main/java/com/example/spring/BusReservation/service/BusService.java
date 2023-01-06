
package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.Bus;
import com.example.spring.BusReservation.model.BusNotFoundException;
import com.example.spring.BusReservation.repository.BusRepository;

@Service
public class BusService {



		@Autowired
		BusRepository busesrepository;
		
		public List<Bus> getBuses()
		{
			List<Bus> buses=busesrepository.findAll();
			if(buses.size()>0)
			{
				return buses;
			}
			else
			{
				return new ArrayList<Bus>();
			}
		}
//
//		public List<Bus> getBuses(){
//			List<Bus> buses=busesrepository.findAll();
//
//			if (buses.size()>0) {
//				return buses;
//			}
//			else {
//				return new ArrayList<Bus>();
//			}
//		}

		public Bus getBusesById(Integer busno) throws BusNotFoundException{
			Optional<Bus> buses=busesrepository.findById(busno);

			if (buses.isPresent()) {
				return buses.get();
			}
			else {
				throw new BusNotFoundException("buses not available");
			}
		}

		public Bus createOrUpdateBuses(Bus bus) throws BusNotFoundException{
			Optional<Bus> bus1=busesrepository.findById(bus.getBusno());

			if(bus1.isPresent()) {
				Bus newBuses=bus1.get();
				newBuses.setBusno(2);
				newBuses.setTotalseats(100);
				newBuses.setSeaterorsleeper("seater");
				newBuses.setDate("1-1-2023");
				newBuses.setTime("13:56");
				newBuses.setPlacefrom("Coimbatore");
				newBuses.setPlaceto("bangalore");

				newBuses=busesrepository.save(newBuses);

				return newBuses;
			}
			else {
				bus=busesrepository.save(bus);

				return bus;
			}
		}

		public void deleteBuses(Integer busno) throws BusNotFoundException{
			Optional<Bus> buses = busesrepository.findById(busno);

			if(buses.isPresent()) {
				busesrepository.deleteById(busno);
			}
			else {
				throw new BusNotFoundException("No such buses found");
			}
		}

	}
