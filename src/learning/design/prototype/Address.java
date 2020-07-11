package learning.design.prototype;

public class Address implements Cloneable {

	private String streetName, city;
	
	Address() {
		
	}
	
	Address(String street, String city) {
		this.setStreetName(street);
		this.setCity(city);
	}

	public Address clone() {
		return new Address(streetName, city);
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}
}
