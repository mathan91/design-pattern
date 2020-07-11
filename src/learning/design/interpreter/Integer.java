package learning.design.interpreter;

public class Integer implements Element {
	
	private int value;
	
	public Integer(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public int eval() {
		return value;
	}
	
}
