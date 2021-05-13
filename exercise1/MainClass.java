package lab4.exercise1;

public class MainClass {
    public static void main(String[] args) {
		
		MainClass mt = new MainClass();
		
		CurrentAccount ca = new CurrentAccount("Smith",2000);
		mt.doTrasaction(ca);
		
		SavingsAccount sa = new SavingsAccount("Kathy",3000);
		mt.doTrasaction(sa);
	}

	private void doTrasaction(Account a) {
		if(a instanceof CurrentAccount) {
			CurrentAccount c = (CurrentAccount)a;
			c.deposit(2000);
		}
		if(a instanceof SavingsAccount) {
			SavingsAccount s = (SavingsAccount)a;
			s.withdraw(3000);
		}
	}
}
