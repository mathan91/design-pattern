package learning.design.visitor;

public class AcyclicVisitorDemo {

	public static void main(String[] args) {
		
	AdditionExpression e = new AdditionExpression(
	        new DoubleExpression(1),
	        new AdditionExpression(
	          new DoubleExpression(2),
	          new DoubleExpression(3)
	        )
	    );
	    ExpressionPrinter ep = new ExpressionPrinter();
	    ep.visit(e);
	    System.out.println(ep.toString());
	}
}
