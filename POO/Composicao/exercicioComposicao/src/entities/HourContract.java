package entities;

import java.util.Date;

public class HourContract {

	//attributes
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	
	//constructor
	public HourContract()
	{
		
	}
	
	public HourContract(Date date, double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	
	//methods
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}	
	
	public double totalValue()
	{
		return valuePerHour * hours;
	}
}
