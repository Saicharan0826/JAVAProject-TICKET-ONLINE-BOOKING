package com.jsp.jdbc.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.jsp.jdbc.entity.TicketBooking;



@Repository("ticketDao")
public class TicketDaoImpl implements TicketDao{
	
	@Autowired
	private JdbcTemplate template;
	
//	@Autowired
	
	private RowMapper<TicketBooking>rm=new BeanPropertyRowMapper<TicketBooking>(TicketBooking.class);
	
	public void insertBookingDetails(TicketBooking t) {
		String insert="insert into ticketbooking(TicketId, PassengerName, PassengerSeatNo, PassengerGender, PassengerMobile, ServiceCategory, FromCity, ToCity, TicketPrice, TravellingDate, StartTimeOrigin)values(?,?,?,?,?,?,?,?,?,?,?)";
		 template.update(insert,t.getTicketId(),t.getPassengerName(),t.getPassengerSeatNo(),t.getPassengerGender(),t.getPassengerMobile(),t.getServiceCategory(),t.getFromCity(),t.getToCity(),t.getTicketPrice(),t.getTravellingDate(),t.getStartTimeOrigin());
		 System.out.println("✌️✌️✌️✌️ Ticket Booking Confirmed");
		
	}
	
	public void updatePassengerNameByTicketId(int id, String name) {
	String update="update ticketbooking set PassengerName=? where TicketId=?";
	int status = template.update(update,name,id);
	if(status>0)
	{
		System.out.println("Passenger Name Updated 👍👍👍👍");
	}
	else {
		System.out.println("Student Id Not Found 👎👎👎👎");
	}
		
	}
	
	public void changeServiceCategoryByNameandTicketId(String name, int id, String service) {
		String update="update ticketbooking set ServiceCategory=? where PassengerName=? and TicketId=?";
		int status=template.update(update,service,name,id);
		if(status!=0)
		{
			System.out.println("ServiceCategory Has Changed 👍👍👍👍");
		}
		else {
			System.out.println("No Id and No Name Found 👎👎👎👎");
		}
		
	}
	
	public void updatePassengerMobileNumberById(String mobile, int id) {
		String update="update ticketbooking set PassengerMobile=? where TicketId=?";
		int status = template.update(update,mobile,id);
		if(status!=0)
		{
			System.out.println("Mobile Number Updated....👌👌👌👍");
		}
		else {
			System.out.println("Ticket Not Found 👎👎👎👎");
		}
		
	}
		public void updateTravellingDateByTicketIdandNameandGender(String date, int id, String name, String gender) {
			String update="update ticketbooking set TravellingDate=? where TicketId=? and PassengerName=? and PassengerGender=?";
			int status=template.update(update,date,id,name,gender);
			if(status!=0)
			{
				System.out.println("Travelling Date Updated 👌👌👌....");
			}
			else {
				System.out.println("Id,Name,Gender Not Found...👎👎👎👎");
			}
			
		}
		public void deleteTicketByUsingTicketId(int id) {
		String query="delete ticketbooking from ticketbooking where TicketId=?";
		int status=template.update(query, id);
		if(status>0)
		{
			System.out.println("Ticket Cancelled 💀💀💀💀");
		}
		else {
			System.out.println("Ticket Id Not Found👎👎👎👎👎 ");
		}
			
		}
		
		public void deleteTicketIdByMobileNumberandTicketId(String mobile, int id) {
			String query="delete ticketbooking from ticketbooking where PassengerMobile=? and TicketId=?";
			int status=template.update(query,mobile,id);
			if(status>0)
			{
				System.out.println("Ticket Cancelled 💀💀💀💀....");
			}
			else {
				System.out.println("Mobile Nnd Ticket Id Not Found 👎👎👎👎👎...");
			}
			
		}
		
		public void deleteTicketByNameandMobileandId(String name, String mobile, int id) {
			String query="delete ticketbooking from ticketbooking where PassengerName=? and PassengerMobile=? and TicketId=?";
			int status = template.update(query,name,mobile,id);
			if(status!=0)
			{
				System.out.println("Ticket Cancelled 💀💀💀💀....");
			}
			else {
				System.out.println("Name Id Mobile Not Found 👎👎👎👎👎...");
			}
			
		}
		
		public void displayAllTicketDetails() {
			String select="select * from ticketbooking";
			List<TicketBooking> list=template.query(select, rm);
			
			list.forEach(System.out::println);
		
		}
		
		public void displayAllTicketDetailsById(int id) {
		String select="select * from ticketbooking where TicketId=?";
		try {
		TicketBooking t=template.queryForObject(select, rm,id);
		System.out.println(t);

		}
		catch (Exception e) {
			System.out.println("###Tickets Not Found");
		}
		
			
		}
		
		public void displayAllTicketDetailsByName(String name) {
		String select="select * from ticketbooking where PassengerName=?";
		List<TicketBooking> list=template.query(select, rm,name);
		if(!list.isEmpty())
			list.forEach(System.out::println);
		else
			System.out.println("No Passenger Name Found......");

		
			
		}
		@Override
		public void displayAllTicketDetailsByTravellingDate(String date) {
			String select="select * from ticketbooking where TravellingDate=?";
			List<TicketBooking> list = template.query(select,rm,date);
			if(!list.isEmpty())
				list.forEach(System.out::println);
			else
				System.out.println("No Travelling Date  Found......");

			
			
		}
		@Override
		public void displayAllTicketDetailsByServiceCategory(String category) {
			String select="select * from ticketbooking where ServiceCategory=?";
			List<TicketBooking> list = template.query(select,rm, category);
			if(!list.isEmpty())
				list.forEach(System.out::println);
			else
				System.out.println("No Service   Found......");

		}
	
}
	