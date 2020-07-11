package learning.design.proxy;

public class Demo {

	public static void main(String[] args) {
		Creature cr = new Creature(10);
		System.out.println(cr.getAgility().getValue());
	}
}