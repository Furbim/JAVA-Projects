package entities;

import java.time.LocalDate;

import entities.enu.Level;

public class HourContract {

	
	public LocalDate mes;
	public Double hourvalue;
	public Integer hours;
	
	public HourContract() {
	
	}

	public HourContract(LocalDate mes, Double hourvalue, Integer hours) {
		this.mes = mes;
		this.hourvalue = hourvalue;
		this.hours = hours;
		
	}
	
	public LocalDate getMes() {
		return mes;
	}

	public void setMes(LocalDate date) {
		this.mes = date;
	}

	public Double totalValue() {
		
		return hourvalue * hours;
	} 
	
	
	
	
	
}
