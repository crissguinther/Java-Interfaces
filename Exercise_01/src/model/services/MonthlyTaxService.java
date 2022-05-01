package model.services;

public class MonthlyTaxService implements TaxService{
	
	public double tax(double ammount) {
		return ammount * 0.01;
	}
	
}
