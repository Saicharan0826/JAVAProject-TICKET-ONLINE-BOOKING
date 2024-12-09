package com.jsp.jdbc;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc.config.TicketConfig;
import com.jsp.jdbc.service.TicketService;

/**
 * Hello world!
 *
 */
public class TicketManagement
{
	
    public static void main( String[] args ) throws InterruptedException
    {
    	Scanner sc=new Scanner(System.in);
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(TicketConfig.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        TicketService service=context.getBean("ticketService",TicketService.class);
        System.out.println("     ");
        String s=("🚎🚎🚌🚌🚌🚌 WELCOME TO TSRTC ONLINE BOOKING 🚌🚌🚌🚌🚎🚎");
        for(int i=0;i<s.length();i++)
        {
        	System.out.print(s.charAt(i));
        	Thread.sleep(100);
        }
        System.out.println(" ");
        
        System.out.println("-------------------------------------------");
        while(true) {
        System.out.println("Press 1 :👉👉👉 To Book the Bus Tickets  ");
        System.out.println("Press 2 :👉👉👉 To Update Ticket Details ");
        System.out.println("Press 3 :👉👉👉 To Delete the Booked Ticket ");
        System.out.println("Press 4 :👉👉👉 To Display Ticket Details  ");
        switch(sc.nextInt()) {
        case 1:service.Booking();;break;
        case 2:
            {
        	  System.out.println("------------------------");
              System.out.println("Press 1:👉👉👉 To Update Passenger Name By TicketId");
              System.out.println("Press 2:👉👉👉 To Update Service Category By Name And TicketId");
              System.out.println("Press 3:👉👉👉 To Update Passenger Mobile By TicketId");
              System.out.println("Press 4:👉👉👉 To Update TravellingDate By TicketId and Name And Gender");
             
              switch(sc.nextInt())
              {
              case 1:service.changePassengerNameByTicketId();break;
              case 2:service.changeServiceCategoryByNameandTicketId();break;
              case 3:service.changePassengerMobileNumberByTicketId();break;
              case 4:service.changeTravellingDateByTicketIdandNameandGender();break;
              
              default :System.out.println("😑😑😑😑😑 Please Enter the Valid Input....."); break;
              }
        	}
        	break;
    
        case 3 : {
        	System.out.println("-------------------------------");
        	System.out.println("Press 1:👉👉👉 To Delete By TicketId ");
        	System.out.println("Press 2:👉👉👉 To Delete By Mobile And TicketId");
        	System.out.println("Press 3:👉👉👉 To Delete by Name and Mobile and Id");
        	switch(sc.nextInt())
        	{
        	case 1:service.removeTicketByTicketId();break;
        	case 2:service.removeTicketByMobileNumberandTicketId();break;
        	case 3:service.removeTicketByNameandMobileandId();break;
          default :System.out.println("😑😑😑😑😑 Please Enter the Valid Input.....");
        
        	}
        }
    	break;
        case 4:
        {
        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        	System.out.println("Press 1: To Display All Ticket Details ");
        	System.out.println("Press 2: To Display All Ticket Details By Id");
        	System.out.println("Press 3: To Display All Ticket Details By Name");
        	System.out.println("Press 4: To  Display All Ticket Details By TravaellingDate");
        	System.out.println("Press 5: To Display All Ticket Details By ServiceCategory");
        	switch(sc.nextInt())
        	{
        	case 1:service.fetchAllTicketDetails();break;
        	case 2:service.fecthAllTicketDetailsById();break;
        	case 3:service.fetchAllTicketDetailsByName();break;
        	case 4:service.fetchAllTicketDetailsByTravellingDate();break;
        	case 5:service.fetchAllTicketDetailsByServiceCategory();break;
        	}
        	
        }
        break;
        
        default: System.out.println("😑😑😑😑😑 Please Enter the Valid Input.....");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Do You Want To Continue Press 'YES'(OR) Press 'NO'");
        String option=sc.next();
        if(option.equalsIgnoreCase("yes"))
        {
        	continue;
        }
        else if(option.equalsIgnoreCase("no")) {
        	System.out.println("👌👌👌👌THANK YOU VISIT AGAIN...");
        	break;
        }
        
        
        else {
        System.out.println("GET LOST ....😎😎😎");
        }
        }
    
}
}


    
        
              
     