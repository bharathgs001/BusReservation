package com.example.spring.BusReservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bus {
	@Id
	@Column(name = "busno")
	private int busno;
	@Column(name = "totalseats")
	private int totalseats;
	@Column(name = "seaterorsleeper")
	private boolean seaterorsleeper;
	public Bus() {
		super();
	}
	public Bus(int busno, int totalseats, boolean seaterorsleeper) {
		super();
		this.busno = busno;
		this.totalseats = totalseats;
		this.seaterorsleeper = seaterorsleeper;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public boolean isSeaterorsleeper() {
		return seaterorsleeper;
	}
	public void setSeaterorsleeper(boolean seaterorsleeper) {
		this.seaterorsleeper = seaterorsleeper;
	}
	//public boolean isPresent() {
		// TODO Auto-generated method stub
		//return false;
	//}
	
}