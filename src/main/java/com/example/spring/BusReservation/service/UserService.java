package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.User;
import com.example.spring.BusReservation.model.UserNotFoundException;
import com.example.spring.BusReservation.repository.UserRepository;


@Service

public class UserService {

	@Autowired
	
	UserRepository userrepository;
	
	public List<User> getUsers() {
		List<User> users=userrepository.findAll();
		if(users.size()>0)
		{
			return users;
		}
		else
		{
			return new ArrayList<User>();
		}
		}
	
	public User createOrUpdateUser(User user) throws UserNotFoundException{
		
	Optional<User> users=userrepository.findById(user.getEmailId());
	if(users.isPresent())
	{
		User newUser=users.get();
		newUser.setEmailId(user.getEmailId());
		newUser.setPassword(user.getPassword());
		newUser=userrepository.save(newUser);
		return newUser;
	}
	else
	{
		user=userrepository.save(user);
		return user;
		
	}

}

	
}