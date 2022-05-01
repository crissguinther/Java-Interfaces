package model.services;

public class PaymentTaxService implements TaxService{

	public double tax(double ammount) {
		return ammount * 0.02;
	}
	
}
