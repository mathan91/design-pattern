package learning.design.interpreter;

public class Token {

	public Type type;
	public String text;
	
	public Token(Type type, String text) {
		super();
		this.type = type;
		this.text = text;
	}

	@Override
	public String toString() {
		return "`" + text + "`" ;
	}
}
