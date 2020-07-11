package learning.design.builder;

public class FacetBuilderDemo {

	public static void main(String[] args) {
		
		PersBuilder builder = new PersBuilder();
		Person person = builder
			.lives()
				.setName("Mathan")
				.setCity("Bangalore")
				.setPin("560035")
				.setStreet("Sarjapura Road")
			.works()
				.setwork("Bosch")
				.setworkin("Bangalore")
				.setAnnual(70000)
			.build();
		System.out.println(person);
	}

}
