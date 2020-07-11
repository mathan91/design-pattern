package learning.design.command;

public class BankAmount {

	private int balance;
	private int overdraftLimit = -500;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("The balance is: " + balance);
	}
	
	public boolean withDraw(int amount) {
		if (balance - amount > 0) {
			balance -= amount;
			System.out.println("The balance is: " + balance);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankAmount [balance=" + balance + 
			   ", overdraftLimit=" + overdraftLimit + "]";
	}
	
}
