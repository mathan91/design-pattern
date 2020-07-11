package learning.design.builder;

public class PersonAddressBuilder extends PersBuilder {

	public PersonAddressBuilder(Person person) {
		this.person = person;
	}
	
	PersonAddressBuilder setName(String name) {
		person.setName(name);
		return this;
	}
	
	PersonAddressBuilder setCity(String city) {
		person.setCity(city);
		return this;
	}
	
	PersonAddressBuilder setPin(String pin) {
		person.setPincode(pin);
		return this;
	}
	
	PersonAddressBuilder setStreet(String street) {
		person.setStreetName(street);
		return this;
	}
}
