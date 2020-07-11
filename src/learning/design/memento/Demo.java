package learning.design.memento;

public class Demo {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(100);
		Memento m1 = ba.withdraw(100);
		Memento m2 = ba.withdraw(12);
		System.out.println(ba);
		
		ba.restore(m2);
		System.out.println(ba);
		ba.restore(m1);
		System.out.println(ba);
		
	}
}
