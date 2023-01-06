package com.example.spring.BusReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.BusReservation.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

}
