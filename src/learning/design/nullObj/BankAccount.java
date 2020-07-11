package learning.design.nullObj;

public class BankAccount {

	private Log log;
	private int balance;
	
	public BankAccount(Log log) {
		this.log = log;
	}
	
	public void deposit(int deposit) {
		balance+= deposit;
		log.info("Done");
	}
	
	public void withdraw(int amount) {
	    if (balance >= amount)
	    {
	      balance -= amount;
	      if (log != null)
	      {
	        log.info("Withdrew " + amount
	          + ", we have " + balance + " left");
	      }
	    }
	    else {
	      if (log != null)
	      {
	        log.warn("Could not withdraw "
	          + amount + " because balance is only " + balance);
	      }
	    }
	  }
}