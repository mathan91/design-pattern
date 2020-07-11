package learning.design.visitor;

public class IntrusiveDemo {

	public static void main(String[] args) {
		
		AdditionExpression newAdditionExp 
			= new AdditionExpression(new DoubleExpression(1), 
					new AdditionExpression(new DoubleExpression(2), 
										   new DoubleExpression(3)));
		
		StringBuilder sb = new StringBuilder();
//		ExpressionPrinter.print(newAdditionExp, sb);
		System.out.println(sb);

	}
}
