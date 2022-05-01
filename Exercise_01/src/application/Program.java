package application; 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Quota;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Enter contract data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Date (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());
			sc.nextLine();
			System.out.print("Contract value: ");
			double contractValue = sc.nextDouble();
			System.out.print("Number of installments: ");
			int installments = sc.nextInt();
			
			ContractService contractService = new ContractService(new Contract(number, date, contractValue), installments);
			contractService.processContract();
			
			System.out.println("Installments: ");
			System.out.println(contractService.toString());
		
			for(Quota q: contractService.getList()) {
				System.out.println(sdf.format(q.getDueDate()) + " - " + q.getTotal());
			}
			
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
		
		
	}

}
