package learning.design.visitor;

public class AdditionExpression extends Expression {

	public Expression left, right;

	public AdditionExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
	
	@Override
	  public void accept(Visitor visitor) {
	    if (visitor instanceof AdditionExpressionVisitor) {
	      ((AdditionExpressionVisitor) visitor).visit(this);
	    }
	  }
	
}
