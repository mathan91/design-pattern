package learning.design.visitor;

public class ExpressionPrinter implements DoubleExpressionVisitor , 
			AdditionExpressionVisitor {
	
	public StringBuilder sb = new StringBuilder();
	
	@Override
	  public void visit(DoubleExpression obj) {
	    sb.append(obj.value);
	  }

	  @Override
	  public void visit(AdditionExpression obj) {
	    sb.append('(');
	    obj.left.accept(this);
	    sb.append('+');
	    obj.right.accept(this);
	    sb.append(')');
	  }

	  @Override
	  public String toString() {
	    return sb.toString();
	  }
}
