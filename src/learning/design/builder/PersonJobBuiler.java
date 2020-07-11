package learning.design.builder;

public class PersonJobBuiler extends PersBuilder {

	public PersonJobBuiler(Person person) {
		this.person = person;
	}
	
	PersonJobBuiler setwork(String work) {
		person.setWorkAt(work);
		return this;
	}
	
	PersonJobBuiler setworkin(String loc) {
		person.setWorksIn(loc);
		return this;
	}
	
	PersonJobBuiler setAnnual(int sal) {
		person.setAnnualSal(sal);
		return this;
	}
}
