package learning.design.visitor;

public interface ExpressionVisitor extends Visitor {

	void visit(Expression obj);
	
}
