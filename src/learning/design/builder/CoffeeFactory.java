package learning.design.builder;

public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Amount of coffee required");
		return new Coffee();
	}

}
