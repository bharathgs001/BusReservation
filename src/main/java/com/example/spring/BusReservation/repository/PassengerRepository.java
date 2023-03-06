package com.example.spring.BusReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.spring.BusReservation.model.Passenger;
import com.example.spring.BusReservation.service.Login;

public interface PassengerRepository extends CrudRepository<Passenger, String>{

	List<Passenger> findByUserName(String userName);

}