package com.infotech.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@Service	
public class TicketBookingService {
	
	
    @Autowired
	private TicketBookingDao ticketBookingDao; //Class having dependency on DAO
	public Ticket createTicket(Ticket ticket) {
		
		return ticketBookingDao.save(ticket);//saving entity claas in database
	}
	
	
	public Optional<Ticket> getTicketById(Integer ticketId) {
		
		return ticketBookingDao.findById(ticketId);
	}


	public Iterable<Ticket> getAllBookedTickets() {
		
		return ticketBookingDao.findAll();
	}


	public void deleteTicket(Integer ticketId) {
	
		 ticketBookingDao.deleteById(ticketId);
	}


	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		Ticket updatedTicket=ticketBookingDao.save(ticketFromDb);
		return updatedTicket;	
	}
	

}
