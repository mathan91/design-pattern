package learning.design.visitor;

public abstract class Expression {

	public void accept(ExpressionPrinter expressionPrinter)
	  {
	    if (expressionPrinter instanceof ExpressionVisitor) {
	      ((ExpressionVisitor) expressionPrinter).visit(this);
	    }
	  }

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
	
}
