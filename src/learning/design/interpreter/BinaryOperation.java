package learning.design.interpreter;

public class BinaryOperation implements Element {

	public enum Type 
	{
		ADDITION,
		SUBSTRACTION
	}
	
	public Type type;
	public Element left, right;
	
	@Override
	public int eval() {
		switch (type) {
		case ADDITION : return left.eval() + right.eval();
		case SUBSTRACTION : return left.eval() - right.eval();
		default:  return 0;
		}
	}
}
