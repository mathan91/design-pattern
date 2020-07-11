package learning.design.principles;

public class Triplet {

	private Person parent;
	private Relationship relation;
	private Person child;
	
	public Triplet(Person parent, Relationship relation, Person child) {
		super();
		this.parent = parent;
		this.relation = relation;
		this.child = child;
	}
	
	public Person getParent() {
		return parent;
	}
	public void setParent(Person parent) {
		this.parent = parent;
	}
	public Relationship getRelation() {
		return relation;
	}
	public void setRelation(Relationship relation) {
		this.relation = relation;
	}
	public Person getChild() {
		return child;
	}
	public void setChild(Person child) {
		this.child = child;
	}
	
	
	
	
}
