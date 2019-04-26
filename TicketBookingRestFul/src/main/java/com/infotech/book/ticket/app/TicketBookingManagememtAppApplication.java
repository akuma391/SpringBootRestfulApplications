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
public class TicketBookingManagememtAppApplication {
	
	public static void main(String[] args) {
		
	
		SpringApplication.run(TicketBookingManagememtAppApplication.class, args);

		
		}

	}


