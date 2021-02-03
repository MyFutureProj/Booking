package com.smarteinc.assignment.booking;

import java.util.Objects;

public class BookingApp
{

	public int bookingProcess(Ticket ticket)
	{

		if (ticket.getType() != 1 && ticket.getType() != 2)
		{
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}

		validateAllFieldsPresent(ticket);

		if (ticket.getType() == 1)
		{
			bookBusTicket(ticket);
		}
		else
		{
			bookCarTicket(ticket);
		}
		sendTicketBookedMail(ticket);
		return ticket.getType();
	}

	private void bookCarTicket(Ticket x)
	{
		// assume Car is booked by making some entries in db
	}

	private void bookBusTicket(Ticket x)
	{
		// assume Bus is booked by making some entries in db
	}

	private void sendTicketBookedMail(Ticket x)
	{
		// Assume email is sent to passenger that his/her ticket is booked
	}

	// Ensure all input data is present
	void validateAllFieldsPresent(Ticket ticket)
	{
		Objects.requireNonNull(ticket);
		Objects.requireNonNull(ticket.getStartDate());
		Objects.requireNonNull(ticket.getEndDate());

		Objects.requireNonNull(ticket.getFrom());
		Objects.requireNonNull(ticket.getDestination());
		Objects.requireNonNull(ticket.getPassenger());

	}
}
