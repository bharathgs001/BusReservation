package com.example.spring.BusReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String>{

}
