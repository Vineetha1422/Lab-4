package lab4.exercise1;

public class SavingsAccount extends Account{
	
	
	final double minBalance = 500;
	
	
	public SavingsAccount(String accHolder, double balance) {
		super(accHolder, balance);
	}

	public void withdraw(double wamount)
	{
		if((this.getBalance() - wamount) > minBalance)
		{
			this.setBalance(this.getBalance() - wamount);
			System.out.println("Current Balance of"+getAccHolder()+" is : "+ getBalance());
		}
		else
		{
			System.out.println("Less balance to perform Withdrawl");
		}
	}
}
