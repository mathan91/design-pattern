package learning.design.builder;

public class PersBuilder {

	protected Person person = new Person();
	
	PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}
	
	PersonJobBuiler works() {
		return new PersonJobBuiler(person);
	}
	
	Person build() {
		return person;
	}
}
