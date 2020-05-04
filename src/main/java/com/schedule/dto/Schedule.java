package com.schedule.dto;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Schedule
{
//Defining book id as primary key
@Id
@Column
private int scheduleId;
@Autowired
private Airport sourceAirport;
@Autowired
private Airport destinationAirport;
@Column
private LocalDateTime departureDateTime;
@Column
private LocalDateTime arrivalDateTime;

public int getScheduleId() {
	return scheduleId;
}
public void setScheduleId(int scheduleId) {
	this.scheduleId = scheduleId;
}
public Airport getSourceAirport() {
	return sourceAirport;
}
public void setSourceAirport(Airport sourceAirport) {
	this.sourceAirport = sourceAirport;
}
public Airport getDestinationAirport() {
	return destinationAirport;
}
public void setDestinationAirport(Airport destinationAirport) {
	this.destinationAirport = destinationAirport;
}
public LocalDateTime getDepartureDateTime() {
	return departureDateTime;
}
public void setDepartureDateTime(LocalDateTime departureDateTime) {
	this.departureDateTime = departureDateTime;
}
public LocalDateTime getArrivalDateTime() {
	return arrivalDateTime;
}
public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
	this.arrivalDateTime = arrivalDateTime;
}

}
