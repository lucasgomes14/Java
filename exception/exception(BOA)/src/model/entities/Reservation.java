package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.Exception.DomainException;

public class Reservation {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//ATTRIBUTES
	private int roomNumber;
	private Date checkin;
	private Date checkout;
	
	//CONSTRUCTOR
	public Reservation(int roomNumber, Date checkin, Date checkout) throws DomainException{
		if(!checkout.after(checkin)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	//METHODS
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) throws DomainException{
		Date now = new Date();
		
		if(checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
		}
		
		if(!checkout.after(checkin)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Reservation: Room "
				+ roomNumber
				+ ", chick-in: "
				+ sdf.format(checkin)
				+ ", check-out: "
				+ sdf.format(checkout)
				+ ", "
				+ duration()
				+ " nights";
	}
}
