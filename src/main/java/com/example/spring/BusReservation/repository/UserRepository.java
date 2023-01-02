package com.example.spring.BusReservation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.User;

public interface UserRepository extends JpaRepository<User,String> {

}