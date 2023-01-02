package com.example.spring.BusReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

}
