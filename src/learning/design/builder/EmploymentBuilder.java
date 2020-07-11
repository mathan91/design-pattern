package learning.design.builder;

public class EmploymentBuilder extends PersonBuilder<EmploymentBuilder> {

	public EmploymentBuilder workAs(String position) {
		person.setPosition(position);
		return self();
	}
	
	public EmploymentBuilder worksAt(String company) {
		person.setCompany(company);
		return self();
	}
	
	protected EmploymentBuilder self() {
		return this;
	}
}
