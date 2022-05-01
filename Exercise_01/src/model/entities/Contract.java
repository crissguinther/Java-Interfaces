package model.entities;

import java.util.Date;

public class Contract {

	private int number;
	private Date date;
	private double value;
	
	public Contract() {}

	public Contract(int number, Date date, double value) {
		super();
		this.number = number;
		this.date = date;
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
