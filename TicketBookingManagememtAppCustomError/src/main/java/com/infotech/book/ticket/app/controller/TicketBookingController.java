package com.infotech.book.ticket.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@RestController
//@RequestMapping(value="/api/tickets")  
public class TicketBookingController implements ErrorController{
	
	//Declaring error path
	private static final String PATH="/error";
	
	
	@Autowired  
	private TicketBookingService ticketBookingService;
	
	
	@PostMapping(value="/create") 
	public Ticket createTicket(@RequestBody Ticket ticket) {
	//@RequestBody . Client can send ticket of json type
		
		return ticketBookingService.createTicket(ticket);
		
	} 
	
	
	@GetMapping(value="/ticket/{ticketId}") 	
	public Optional<Ticket> getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
 
	@GetMapping(value="/ticket/BookedTickets") 
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		 ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value="/ticket/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail") String newEmail) {
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}


	@Override 
	//overidding unimplmented method of controller
	public String getErrorPath() {
		
		return PATH;
	}
	
	
	@RequestMapping(value=PATH, method=RequestMethod.GET) 
	public String defaultErrorMessage() {
		return "Requested resource not found!!";
	}
	
}