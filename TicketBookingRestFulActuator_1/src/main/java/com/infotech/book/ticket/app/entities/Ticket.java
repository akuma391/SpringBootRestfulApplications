// This class is used Database connection. We are using JPA .
//This class only contains database entities and corresponding setter and getter methods


package com.infotech.book.ticket.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                   
@Table(name="ticket")     
public class Ticket {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ticket_id") 
	private Integer ticketId;
	
	@Column(name="passenger_name", nullable=false) 
	private String passengerName;
	
	@Column(name="booking_date")
	private Date bookingDate;
	

	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_Station")
	private String destinationStation;
	
	@Column(name="email")
	private String email;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
				+ ", sourceStation=" + sourceStation + ", destinationStation=" + destinationStation + ", email=" + email
				+ "]";
	}
	
	
}
