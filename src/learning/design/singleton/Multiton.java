package learning.design.singleton;

public class Multiton {

	public static void main(String[] args) {
		
		Printer primary = Printer.get(Subsystem.PRIMARY);
		Printer primary2 = Printer.get(Subsystem.PRIMARY);
		Printer aux = Printer.get(Subsystem.AUXILLARY);
		
		
	}
}
