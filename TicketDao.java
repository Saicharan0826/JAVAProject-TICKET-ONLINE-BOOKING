package com.jsp.jdbc.dao;

import com.jsp.jdbc.entity.TicketBooking;

public interface TicketDao {

	void insertBookingDetails(TicketBooking t);

	void updatePassengerNameByTicketId(int id, String name);

	void changeServiceCategoryByNameandTicketId(String name, int id, String service);

	void updatePassengerMobileNumberById(String mobile, int id);

	void updateTravellingDateByTicketIdandNameandGender(String date, int id,String name, String gender);

	void deleteTicketByUsingTicketId(int id);

	void deleteTicketIdByMobileNumberandTicketId(String mobile, int id);

	void deleteTicketByNameandMobileandId(String name, String mobile, int id);

	void displayAllTicketDetails();

	void displayAllTicketDetailsById(int id);

	void displayAllTicketDetailsByName(String name);

	void displayAllTicketDetailsByTravellingDate(String date);

	void displayAllTicketDetailsByServiceCategory(String category);

	
}