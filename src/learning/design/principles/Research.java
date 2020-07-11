package learning.design.principles;

import java.util.List;

public class Research {

	public Research(RelationshipBrowser browser)
	  {
	    List<Person> children = browser.findAllChilder("John");
	    for (Person child : children)
	      System.out.println("John has a child called " + child.getName());
	  }
	
}
