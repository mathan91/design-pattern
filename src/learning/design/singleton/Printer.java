package learning.design.singleton;

import java.util.HashMap;

public class Printer {

	private static HashMap<Subsystem, Printer> sys =
			new HashMap<>();
	
	private static int count = 0;
	
	private Printer() {
		count++;
		System.out.println("Instance created " + count);
	}
	
	public static Printer get(Subsystem ss) {
		if (sys.containsKey(ss)) return sys.get(ss);
	else {
		Printer instance = new Printer();
		sys.put(ss, instance);
		return instance;
		}
	}
}
