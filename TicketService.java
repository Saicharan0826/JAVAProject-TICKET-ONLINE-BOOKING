package com.jsp.jdbc.service;

public interface TicketService {

	void Booking();
	
	void changePassengerNameByTicketId();

	void changeServiceCategoryByNameandTicketId();

	void changePassengerMobileNumberByTicketId();

	void changeTravellingDateByTicketIdandNameandGender();

	void removeTicketByTicketId();

	void removeTicketByMobileNumberandTicketId();

	void removeTicketByNameandMobileandId();

	void fetchAllTicketDetails();

	void fecthAllTicketDetailsById();

	void fetchAllTicketDetailsByName();

	void fetchAllTicketDetailsByTravellingDate();

	void fetchAllTicketDetailsByServiceCategory();

}