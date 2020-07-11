package learning.design.prototype;

public class DemoApp {

	public static void main(String[] args) {
		
		Person mathan = new Person("Mathan", new Address("Sarjapur", "Bangalore"));
		System.out.println(mathan);
		
		Person mat = mathan.clone();
		mat.setName("Math");
		mat.getAddress().setStreetName("Whitefield");
		System.out.println(mathan);
		System.out.println(mat);

	}
}
