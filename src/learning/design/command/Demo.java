package learning.design.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		BankAmount amt = new BankAmount();
		System.out.println(amt);
		
		List<BankAccountCommand> commands = new ArrayList<>();
		commands.add(new BankAccountCommand(amt, Action.DEPOSIT, 100));
		commands.add(new BankAccountCommand(amt, Action.WITHDRAW, 1000));
		
		for (BankAccountCommand comm : commands)
		{
			comm.call();
			System.out.println(amt);
		}
		
		Collections.reverse(commands);
		
		for (BankAccountCommand c : commands) {
			c.undo();
			System.out.println(amt);
		}
		
	}

}
