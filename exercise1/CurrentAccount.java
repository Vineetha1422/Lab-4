package lab4.exercise1;

public class CurrentAccount extends Account{
	private double overdraft = 10000;

	public CurrentAccount(String accHolder, double balance) {
		super(accHolder, balance);
	}
	
	public void deposit(double amount)
	{
		if((this.getBalance()-amount) < overdraft)
			System.out.println("Current Balance of "+getAccHolder()+" is : "+ getBalance());
		else
			System.out.println(getAccHolder()+"Over Drafted : Cannot deposit anymore!");
	}
	
	
}
