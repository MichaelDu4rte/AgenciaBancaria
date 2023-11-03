package application;

import java.util.Scanner;

import entities.Account;
import entities.Client;
import entities.Validation;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Validation validation = new Validation();
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("------------Welcome Create Account---------------");
		System.out.println("-------------------------------------------------");
		
		System.out.println("");
		System.out.print("Name: ");
		String clientName = sc.next();
		
		System.out.print("Cpf: ");
		String clientCpf = sc.next();
		
		System.out.print("Email: ");
		String clientEmail = sc.next();
		
		while(validation.isCPF(clientCpf) != true) {
			
			System.out.println("");
			System.out.println("CPF INCORRET ");
			System.out.println("please try entering a valid CPF. ");
			
			System.out.println("");
			
			System.out.print("Cpf: ");
			
			clientCpf = sc.next();
			
		} 
		
		while(validation.valEmail(clientEmail) != true) {
			
			System.out.println("");
			System.out.println("EMAIL INCORRET. ");
			System.out.println("We were unable to validate your email, please try entering a valid email. ");
			
			System.out.println("");
			
			System.out.print("Email: ");
			
			clientEmail = sc.next();
		} 
		
		
		
		
		
			
		Client c = new Client(clientName, clientCpf, clientEmail);
		Account account = new Account(c);
			
		System.out.println("Sucess Create. ");
		System.out.println();
			
		System.out.println("-------------------------------");
		System.out.println("------ Welcome Bank " + c.getName() + " ------");
		System.out.println("-------------------------------");

		
			
		System.out.println("");
		System.out.println("Make your first deposit to validate your account!");
		System.out.println("");
		System.out.print("Enter the deposit amount: ");
		account.deposit(sc.nextDouble());
			
		System.out.println("");
		System.out.println("Choose an option");
		System.out.println("[0] Account information");
		System.out.println("[1] Withdraw");
		System.out.println("[2] Transference");
		System.out.println("[3] End");
		System.out.println("");
			
		int option =  sc.nextInt();
		System.out.println("");
			
		switch(option) {
			
			case 0:
				System.out.print(c.toString());
			break;
				
			case 1:
				System.out.print("Enter the Withdraw amount: ");
				account.withdraw(sc.nextDouble());
			break;
				
				
			case 2:
				System.out.print("Enter the Transference amount: ");
				account.withdraw(sc.nextDouble());
			break;
				
			case 3:
				System.out.print("Goodbye.");
				System.exit(0);
			break;
				
				
			default: 
				System.out.println("");
				System.out.println("Choose an option");
				System.out.println("[1] Deposit");
				System.out.println("[2] Withdraw");
				System.out.println("[3] Transference");
				System.out.println("[4] End");
			break;
		}
		
		sc.close();

	}
	


}
