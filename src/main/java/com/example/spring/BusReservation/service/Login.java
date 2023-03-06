package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.MyUser;
import com.example.spring.BusReservation.model.Passenger;
import com.example.spring.BusReservation.repository.PassengerRepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class Login implements UserDetailsService {
   
     @Autowired
 	PassengerRepository passengerRepository;
 	
 	@Override
 	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
 		List<Passenger> user=passengerRepository.findByUserName(name);
 		if(user==null)
 			throw new UsernameNotFoundException("Bad credentials");
 		

 		return new MyUser(user);
 	}



	
	
}
