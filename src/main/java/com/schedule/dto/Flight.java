package com.schedule.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Flight
{
	
//Defining flightNumer as primary key
@Id
@Column
private int flightNumber;
@Column
private String flightModel;
@Column
private String carrierName;
@Column
private int seatCapacity;

public int getFlightNumber() {
	return flightNumber;
}
@Override
public String toString() {
	return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName
			+ ", seatCapacity=" + seatCapacity + "]";
}
public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public String getFlightModel() {
	return flightModel;
}
public void setFlightModel(String flightModel) {
	this.flightModel = flightModel;
}
public String getCarrierName() {
	return carrierName;
}
public void setCarrierName(String carrierName) {
	this.carrierName = carrierName;
}


public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}
}
