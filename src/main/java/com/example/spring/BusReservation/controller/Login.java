package com.example.spring.BusReservation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

	@GetMapping("/reservation")
	public String travelsSite() {
		return "welcome to GreenBus...";
	}
	@GetMapping("/{id},{password}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id")String id) ,@RequestBody("passward")String password)
		Student entity=studentservice.getStudentById(id);
		return new ResponseEntity<Student>(entity,new HttpHeaders(),HttpStatus.OK);
	}

}
