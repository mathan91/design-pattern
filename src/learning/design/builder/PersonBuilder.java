package learning.design.builder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

	protected Employee person = new Employee();
	
	public SELF addName(String name) {
		person.setName(name);
		return self();
	}
	
	@SuppressWarnings("unchecked")
	protected SELF self() {
		return (SELF) this;
	}
	
	public Employee build() {
		return person;
	}
}
