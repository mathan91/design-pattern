package learning.design.builder;

public class DrinkShop {

	public static void main(String[] args) throws Exception {
		
		HotDrinkMachine machine = new HotDrinkMachine();
		HotDrink drink = machine.makeDrink();
		drink.consume();

	}

}
