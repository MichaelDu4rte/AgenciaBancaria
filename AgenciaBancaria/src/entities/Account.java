package entities;

public class Account {
	
	private static int idAccount;
	
	private int accountNumber;
	private Client client;
	private double coins;
	
	public Account() {
		
	}
	
	public Account(Client client) {
		this.accountNumber = idAccount;
		this.client = client;
		
		idAccount++;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getCoins() {
		return coins;
	}
	

	public void setCoins(Double coins) {
		this.coins = coins;
	}


	@Override
	public String toString() {
		return "Account:" + accountNumber + 
				"\nClient:" + client.getName() + 
				"\nCpf:" + client.getCpf() + 
				"\nCoins: $" + String.format("%02d", getCoins());
	}
	
	
	public void deposit(double valueDeposit) {
		
		if (valueDeposit > 0 )
		{
			setCoins(getCoins() + valueDeposit);
			System.out.println("Deposit Sucess.");
			System.out.println("You coins: $" + getCoins());
		} else {
			System.out.println("Deposit fail.");
		}
		
		
	}
	
	
	public void withdraw(double valueWithdraw) {
		
		if (valueWithdraw > 0 && getCoins() >= valueWithdraw) {
			setCoins(getCoins() - valueWithdraw);
			System.out.println("Withdraw $" + valueWithdraw +" sucess.");
			System.out.println("You coins: $" + getCoins());
		} else {
			System.out.println("Withdraw fail.");
		}
	}
	
	
	public void transference(Account accountTransfere, double valueTransfere) {
		
		if (valueTransfere > 0 && getCoins() >= valueTransfere) {
			
			accountTransfere.setCoins(getCoins() + valueTransfere);
			
			setCoins(getCoins() - valueTransfere);
			System.out.println("Transference sucess.");
			System.out.println("You coins: $" + getCoins());

		} else {
			System.out.println("Transference Fail.");
		}
		
	}
	
	
	

}
