package com.example.spring.BusReservation.model;

public class LoginDetails {

	private String loginId;
	private String password;
	
	public LoginDetails(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}

	public LoginDetails() {
		
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
