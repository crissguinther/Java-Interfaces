package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.entities.Contract;
import model.entities.Quota;

public class ContractService {
	
	private Calendar cal = Calendar.getInstance();
	private Contract contract;
	private int installments;
	
	private TaxService monthlyTaxService;
	private TaxService paymentTaxService;
	
	private List<Quota> quotaList = new ArrayList<>();
	
	public ContractService(Contract contract, int installments) {
		this.contract = contract;
		this.monthlyTaxService = new MonthlyTaxService();
		this.paymentTaxService = new PaymentTaxService();
		this.installments = installments;
		cal.setTime(contract.getDate());
	}
	
	public List<Quota> getList() {
		return quotaList;
	}
	
	public void addQuota(Quota quota) {
		this.quotaList.add(quota);
	}
	
	public void removeQuota(Quota quota) {
		this.quotaList.remove(quota);
	}
	
	public void processContract() {		
		double contractValue = contract.getValue() / installments;
		
		for(int i = 1; i <= installments; i++) {
			cal.add(Calendar.MONTH, 1);		
			double totalValue = monthlyTaxService.tax(contractValue) * i
								+ paymentTaxService.tax(contractValue)
								+ contractValue;
			
			quotaList.add(new Quota(cal.getTime(), totalValue));
		}
	}

}
