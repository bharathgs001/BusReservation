package com.example.spring.BusReservation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

	

	

}
