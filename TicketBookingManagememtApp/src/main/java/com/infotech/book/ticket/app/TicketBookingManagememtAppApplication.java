package com.infotech.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagememtAppApplication implements CommandLineRunner{
	@Autowired
	private	TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource datasource; //Datasoursce is automatically created before. This is used to check. Datasource is use to connect with database

	public static void main(String[] args) {
		
	
		SpringApplication.run(TicketBookingManagememtAppApplication.class, args);

	//	TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);

		
		}

	@Override
	public void run(String... args) throws Exception {
		
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestinationStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");

		
		ticketBookingService.createTicket(ticket);
		System.out.println("Datasource::"+datasource);
	}
	}


