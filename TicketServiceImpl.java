package com.jsp.jdbc.service;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.jdbc.dao.TicketDao;
import com.jsp.jdbc.entity.TicketBooking;

@Service("ticketService")
public class TicketServiceImpl implements TicketService {

	Scanner sc=new Scanner(System.in);
	@Autowired
	private TicketDao dao;
	@Override
	public void Booking() {
	TicketBooking t=new TicketBooking ();
	System.out.print("Enter the Ticket Id: ");
	t.setTicketId(sc.nextInt());
	System.out.print("Enter the PassengerName: ");
	t.setPassengerName(sc.next());
    System.out.print("Enter the Passenger Seat No: ");
    t.setPassengerSeatNo(sc.nextInt());
    System.out.print("Enter the Gender: ");
    t.setPassengerGender(sc.next());
    System.out.print("Enter the Mobile: ");
    t.setPassengerMobile(sc.next());
    System.out.print("Enter the Service Category: ");
    t.setServiceCategory(sc.next());
    System.out.print("From City: ");
    t.setFromCity(sc.next());
    System.out.print("To City: ");
    t.setToCity(sc.next());
    System.out.print("Ticket Price: ");
    t.setTicketPrice(sc.nextDouble());
    System.out.print("Travelling Date: ");
    t.setTravellingDate(Date.valueOf(sc.next()));
    System.out.print("Time Origin: ");
    t.setStartTimeOrigin(Time.valueOf(sc.next()));
    dao.insertBookingDetails(t);
		
	}
	@Override
	public void changePassengerNameByTicketId() {
	System.out.print("Enter the Ticket Id: ");
	int id=sc.nextInt();
	System.out.print("Enter the PassengerName: ");
	String name=sc.next();
	dao.updatePassengerNameByTicketId(id,name);
		
	}
	@Override
	public void changeServiceCategoryByNameandTicketId() {
	System.out.print("Enter the Name: ");
	String name=sc.next();
	System.out.print("Enter the Ticket Id: ");
	int id=sc.nextInt();
	System.out.println("Choose the Service->>(SuperLuxury,Garuda,Rajadhani,LahariSleeper): ");
	String service=sc.next();
	dao.changeServiceCategoryByNameandTicketId(name,id,service);	
	}
	@Override
	public void changePassengerMobileNumberByTicketId() {
		System.out.print("Enter the PassengerMobileNumber: ");
		String mobile=sc.next();
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		dao.updatePassengerMobileNumberById(mobile,id);
		
	}
	@Override
	public void changeTravellingDateByTicketIdandNameandGender() {
		System.out.print("Enter the New Travelling Date: ");
		String date=sc.next();
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		System.out.print("Enter the Passenger Name: ");
		String name=sc.next();
		System.out.print("Enter the Gender: ");
		String gender=sc.next();
		dao.updateTravellingDateByTicketIdandNameandGender(date,id,name,gender);
		
	}
	@Override
	public void removeTicketByTicketId() {
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		dao.deleteTicketByUsingTicketId(id);
		
	}
	@Override
	public void removeTicketByMobileNumberandTicketId() {
		System.out.print("Enter the Mobile Number: ");
		String mobile=sc.next();
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		dao.deleteTicketIdByMobileNumberandTicketId(mobile,id);
		
	}
	@Override
	public void removeTicketByNameandMobileandId() {
		System.out.print("Enter the Passenger Name: ");
		String name = sc.next();
		System.out.print("Enter the Passenger Mobile Number: ");
		String mobile=sc.next();
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		dao.deleteTicketByNameandMobileandId(name,mobile,id);
		
	}
	@Override
	public void fetchAllTicketDetails() {
		{
			dao.displayAllTicketDetails();
		}
		
	}
	@Override
	public void fecthAllTicketDetailsById() {
		System.out.print("Enter the Ticket Id: ");
		int id=sc.nextInt();
		dao.displayAllTicketDetailsById(id);
		
	}
	@Override
	public void fetchAllTicketDetailsByName() {
		System.out.print("Enter the Passenger Name: ");
		String name=sc.next();
		dao.displayAllTicketDetailsByName(name);
		
		
	}
	@Override
	public void fetchAllTicketDetailsByTravellingDate() {
		System.out.print("Enter the Travelling Date: ");
		String date=sc.next();
		dao.displayAllTicketDetailsByTravellingDate(date);
		
	}
	@Override
	public void fetchAllTicketDetailsByServiceCategory() {
		System.out.print("Enter the Service Category: ");
		String category=sc.next();
		dao.displayAllTicketDetailsByServiceCategory(category);
		
	}
}