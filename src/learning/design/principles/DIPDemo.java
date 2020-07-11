package learning.design.principles;

public class DIPDemo {

	public static void main(String[] args) {
		
		Person person = new Person("John");
		Person person2 = new Person("Chris");
		Person person3 = new Person("Stiff");
		
		RelationshipManager manager = new RelationshipManager();
		manager.setRelationShip(person, Relationship.PARENT, person2);
		manager.setRelationShip(person, Relationship.PARENT, person3);
		
		new Research(manager);
		
	}

}
