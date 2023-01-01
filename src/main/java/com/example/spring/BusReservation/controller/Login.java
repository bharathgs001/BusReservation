package com.example.spring.BusReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BusReservation.model.User;
import com.example.spring.BusReservation.model.UserNotFoundException;
import com.example.spring.BusReservation.service.UserService;


@RestController
@RequestMapping("/busbookig")
public class Login {

	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/busbookig")
	public String displaySite() {
		return "ok";
	
	}
	
	@RequestMapping("/busbookig")
	public ResponseEntity<List<User>> getusers()
	{
		List<User> list=userservice.getUsers();
		return new ResponseEntity<List<User>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@PostMapping
	   public ResponseEntity<User> createOrUpdateEmployee(@RequestBody User user)
	   throws UserNotFoundException{
		User updated=userservice.createOrUpdateUser(user);
		return new ResponseEntity<User>(updated,new HttpHeaders(),HttpStatus.CREATED);
		hkcbiugWCIWOW
	
	}

}
