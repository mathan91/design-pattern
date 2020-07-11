package learning.design.builder;

public class Person {
	
	private String name;
	
	private String streetName, pincode, city;
	
	private String workAt, worksIn;
	
	private int annualSal;
	
	Person(String name) {
		this.name = name;
	}
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWorkAt() {
		return workAt;
	}

	public void setWorkAt(String workAt) {
		this.workAt = workAt;
	}

	public String getWorksIn() {
		return worksIn;
	}

	public void setWorksIn(String worksIn) {
		this.worksIn = worksIn;
	}

	public int getAnnualSal() {
		return annualSal;
	}

	public void setAnnualSal(int annualSal) {
		this.annualSal = annualSal;
	}

	@Override
	public String toString() {
		return "Person [name= " + name +" streetName=" + streetName + ", pincode=" + pincode + ", city=" + city
				+ ", workAt=" + workAt + ", worksIn=" + worksIn + ", annualSal=" + annualSal + "]";
	}
	
	Person() {
		
	}
	
	public Person(String name, String streetName, String pincode, String city, String workAt, String worksIn,
			int annualSal) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
		this.city = city;
		this.workAt = workAt;
		this.worksIn = worksIn;
		this.annualSal = annualSal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
