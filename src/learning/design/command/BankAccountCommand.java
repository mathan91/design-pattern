package learning.design.command;

public class BankAccountCommand implements Command {
	
	private BankAmount amount;
	private boolean succeeded;
	
	@Override
	public void call() {
		switch (action) {
			case DEPOSIT : 
			succeeded = true;
			amount.deposit(amt);
			break;
		case WITHDRAW : 
			succeeded = amount.withDraw(amt);
			break;
		}
	}
	
	private Action action;
	private int amt;

	public BankAccountCommand(BankAmount amount, Action action, int amt) {
		super();
		this.amount = amount;
		this.action = action;
		this.amt = amt;
	}

	@Override
	public void undo() {
		if (!succeeded) return;
		switch (action) {
		case DEPOSIT : 
			amount.withDraw(amt);
			break;
		case WITHDRAW : 
			amount.deposit(amt);
			break;
		}
	}	
}