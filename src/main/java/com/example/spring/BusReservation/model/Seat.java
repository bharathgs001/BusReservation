package com.example.spring.BusReservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seat {

	@Id
	@Column(name="seatno")
	private int seatNo;
	private int seatPrice;
	public Seat(int seatNo, int seatPrice) {
		super();
		this.seatNo = seatNo;
		this.seatPrice = seatPrice;
	}
	public Seat() {
	
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	
}
