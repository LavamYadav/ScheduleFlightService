package com.schedule.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

//mark class as an Entity 
	@Entity
//defining class name as Table name
	@Table
public class ScheduleFlight 
{
	@Id
	@Column
	private int scheduleFlightId;
	
	@Autowired
	private Flight flight;
	
	@Column
	private int availableSeats;
	
	@Autowired
	private Schedule schedule;
	@Column
	private Double ticketCost;
	@Column
	private Boolean scheduleFlightState;
	
	public int getScheduleFlightId() {
		return scheduleFlightId;
	}
	public void setScheduleFlightId(int scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Boolean getScheduleFlightState() {
		return scheduleFlightState;
	}
	public void setScheduleFlightState(Boolean scheduleFlightState) {
		this.scheduleFlightState = scheduleFlightState;
	}
	


}
