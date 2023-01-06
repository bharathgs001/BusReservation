package com.example.spring.BusReservation.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {
	 
		@Id
		@Column(name = "busno")
		private int busno;
		@Column(name = "totalseats")
		private int totalseats;
		@Column(name = "seaterorsleeper")
		private String seaterorsleeper;
		@Column(name = "date")
		private String date;
		@Column(name = "time")
		private String time;
		@Column(name = "placefrom")
		private String placefrom;
		@Column(name = "placeto")
		private String placeto;
		public Bus() {
			super();
		}
		public Bus(int busno, int totalseats, String seaterorsleeper, String date, String time, String placefrom,
				String placeto) {
			super();
			this.busno = busno;
			this.totalseats = totalseats;
			this.seaterorsleeper = seaterorsleeper;
			this.date = date;
			this.time = time;
			this.placefrom = placefrom;
			this.placeto = placeto;
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
		public String getSeaterorsleeper() {
			return seaterorsleeper;
		}
		public void setSeaterorsleeper(String seaterorsleeper) {
			this.seaterorsleeper = seaterorsleeper;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getPlacefrom() {
			return placefrom;
		}
		public void setPlacefrom(String placefrom) {
			this.placefrom = placefrom;
		}
		public String getPlaceto() {
			return placeto;
		}
		public void setPlaceto(String placeto) {
			this.placeto = placeto;
		}
						
}
