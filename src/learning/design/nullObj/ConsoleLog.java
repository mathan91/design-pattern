package learning.design.nullObj;

public class ConsoleLog implements Log {

	@Override
	public void info(String msg) {
		System.out.println("INFO");
		
	}

	@Override
	public void warn(String msg) {
		System.out.println("WARNING");
		
	}
}
