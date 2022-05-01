package model.entities;

import java.util.Date;

public class Quota {

	private Date dueDate;
	private double total;

	public Quota() {

	}

	public Quota(Date dueDate, double total) {
		this.dueDate = dueDate;
		this.total = total;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
