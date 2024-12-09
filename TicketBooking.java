package com.jsp.jdbc.entity;

import java.sql.Date;
import java.sql.Time;

public class TicketBooking {
	
 private int TicketId;
 private String PassengerName;
 private  int   PassengerSeatNo;
 private String PassengerGender;
 private String PassengerMobile;
 private String ServiceCategory;
 private String FromCity;
 private String ToCity;
 private double TicketPrice;
 private Date TravellingDate;
 private Time StartTimeOrigin;
 
 public TicketBooking() {
	
}

public TicketBooking(int ticketId, String passengerName, int passengerSeatNo, String passengerGender,
		String passengerMobile, String serviceCategory, String fromCity, String toCity, double ticketPrice,
		Date travellingDate, Time startTimeOrigin) {

	TicketId = ticketId;
	PassengerName = passengerName;
	PassengerSeatNo = passengerSeatNo;
	PassengerGender = passengerGender;
	PassengerMobile = passengerMobile;
	ServiceCategory = serviceCategory;
	FromCity = fromCity;
	ToCity = toCity;
	TicketPrice = ticketPrice;
	TravellingDate = travellingDate;
	StartTimeOrigin = startTimeOrigin;
}

public int getTicketId() {
	return TicketId;
}

public void setTicketId(int ticketId) {
	TicketId = ticketId;
}

public String getPassengerName() {
	return PassengerName;
}

public void setPassengerName(String passengerName) {
	PassengerName = passengerName;
}

public int getPassengerSeatNo() {
	return PassengerSeatNo;
}

public void setPassengerSeatNo(int passengerSeatNo) {
	PassengerSeatNo = passengerSeatNo;
}

public String getPassengerGender() {
	return PassengerGender;
}

public void setPassengerGender(String passengerGender) {
	PassengerGender = passengerGender;
}

public String getPassengerMobile() {
	return PassengerMobile;
}

public void setPassengerMobile(String passengerMobile) {
	PassengerMobile = passengerMobile;
}

public String getServiceCategory() {
	return ServiceCategory;
}

public void setServiceCategory(String serviceCategory) {
	ServiceCategory = serviceCategory;
}

public String getFromCity() {
	return FromCity;
}

public void setFromCity(String fromCity) {
	FromCity = fromCity;
}

public String getToCity() {
	return ToCity;
}

public void setToCity(String toCity) {
	ToCity = toCity;
}

public double getTicketPrice() {
	return TicketPrice;
}

public void setTicketPrice(double ticketPrice) {
	TicketPrice = ticketPrice;
}

public Date getTravellingDate() {
	return TravellingDate;
}

public void setTravellingDate(Date travellingDate) {
	TravellingDate = travellingDate;
}

public Time getStartTimeOrigin() {
	return StartTimeOrigin;
}

public void setStartTimeOrigin(Time startTimeOrigin) {
	StartTimeOrigin = startTimeOrigin;
}

@Override
public String toString() {
	return "TicketBooking [TicketId=" + TicketId + ", PassengerName=" + PassengerName + ", PassengerSeatNo="
			+ PassengerSeatNo + ", PassengerGender=" + PassengerGender + ", PassengerMobile=" + PassengerMobile
			+ ", ServiceCategory=" + ServiceCategory + ", FromCity=" + FromCity + ", ToCity=" + ToCity
			+ ", TicketPrice=" + TicketPrice + ", TravellingDate=" + TravellingDate + ", StartTimeOrigin="
			+ StartTimeOrigin + "]";
}

 
}