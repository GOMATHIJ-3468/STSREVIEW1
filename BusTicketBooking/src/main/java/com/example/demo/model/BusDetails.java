package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BusInfo")
public class BusDetails {
@Id
	private int id;
	private String bus_no;
	private String bus_type;
	private String boardingpoint;
	private String droppingpoint;
	private int seat_no;
	private Date dateofjourney;
	public BusDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusDetails(int id, String bus_no, String bus_type, String boardingpoint, String droppingpoint, int seat_no,
			Date dateofjourney) {
		super();
		this.id = id;
		this.bus_no = bus_no;
		this.bus_type = bus_type;
		this.boardingpoint = boardingpoint;
		this.droppingpoint = droppingpoint;
		this.seat_no = seat_no;
		this.dateofjourney = dateofjourney;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public String getBus_type() {
		return bus_type;
	}
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDroppingpoint() {
		return droppingpoint;
	}
	public void setDroppingpoint(String droppingpoint) {
		this.droppingpoint = droppingpoint;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	
}
