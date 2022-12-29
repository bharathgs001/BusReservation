package com.example.spring.BusReservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@Column(name="emailId")
	private String emailId;
@Column(name="password")
private String password;
public User(String emailId, String password) {
	super();
	this.emailId = emailId;
	this.password = password;
}
public User() {
	super();
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
