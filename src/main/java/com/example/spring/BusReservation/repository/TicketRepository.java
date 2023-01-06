package com.example.spring.BusReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.Ticket;


public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
