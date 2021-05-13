package lab4.exercise1;

public class Account {
	private long accNum;
	private double balance;
	private String accHolder;
	 
	
	public Account(String name, double balance) {
		super();
		accHolder = name;
		this.accNum = (long)Math.random() * 10000;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount)
	{
		this.balance = balance+amount;
		
	}
	
	public void withdraw(double amount){
		if((this.balance - amount) > 500){
			this.balance = balance-amount;
			System.out.println("The balance after deposit in "+getAccHolder()+" is "+ getBalance());
		}else{
			System.out.println(accHolder + " can withdraw only "+ (balance-500));
		}
	}
}
