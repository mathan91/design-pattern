package learning.design.builder;

public class Pair<String, HotDrinkFactory> {
	
	private String string;
	private HotDrinkFactory drinkFactory;
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public HotDrinkFactory getDrinkFactory() {
		return drinkFactory;
	}
	public void setDrinkFactory(HotDrinkFactory drinkFactory) {
		this.drinkFactory = drinkFactory;
	}
	public Pair(String string, HotDrinkFactory drinkFactory) {
		super();
		this.string = string;
		this.drinkFactory = drinkFactory;
	}
}
