package model.services;

public class BrazilTaxService {

	public double tax(Double ammount) {
		if(ammount <= 100.0)
			return ammount*0.2;
		else 
			return ammount * 0.15;
	}
}
