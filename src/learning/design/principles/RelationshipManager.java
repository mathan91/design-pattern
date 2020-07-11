package learning.design.principles;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RelationshipManager implements RelationshipBrowser {
	
	private List<Triplet> relations = 
			new ArrayList<>();
	
	public void setRelationShip(Person parent, Relationship relation, Person child) {
		
	relations.add(new Triplet(parent, Relationship.PARENT, child));	
	relations.add(new Triplet(child, Relationship.CHILD, parent));	
	}

	@Override
	public List<Person> findAllChilder(String name) {
		return relations.stream()
			      .filter(x -> Objects.equals(x.getParent().getName(), name)
			              && x.getRelation() == Relationship.PARENT)
			      .map(person -> {
			    	 return person.getChild(); 
			      })
			      .collect(Collectors.toList());
	}
}