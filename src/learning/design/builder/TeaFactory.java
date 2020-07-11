package learning.design.builder;

public class TeaFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Amount is specified");
		return new Tea();
	}
}
