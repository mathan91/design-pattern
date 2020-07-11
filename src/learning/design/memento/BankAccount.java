package learning.design.memento;

public class BankAccount {

	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	
	public Memento withdraw(int amount) {
		Memento m = new Memento(balance);
		balance += amount;
		return m;
	}
	
	public void restore(Memento m) {
		balance = m.getBalance();
	}
	
	@Override
	public String toString() {
		return "Balance :" + balance;
	}
}
