package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	//attributes
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	//associations
	private Department dapartment;
	private List<HourContract> contracts = new ArrayList<>();
	
	//constructor
	public Worker(){
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department dapartment) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.dapartment = dapartment;
	}
	
	
	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDapartment() {
		return dapartment;
	}

	public void setDapartment(Department dapartment) {
		this.dapartment = dapartment;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract)
	{
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract)
	{
		contracts.remove(contract);
	}
	
	public double income(int year, int month)
	{
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContract i : contracts)
		{
			cal.setTime(i.getDate());
			
			int iYear = cal.get(Calendar.YEAR);
			int iMonth = 1 + cal.get(Calendar.MONTH);
			
			if(iYear == year && iMonth == month)
			{
				sum += i.totalValue();
			}
		}
		return sum;
	}
	
}
