package learning.design.builder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class HotDrinkMachine {

	private Map<AvailableDrink, HotDrinkFactory> factories 
		= new HashMap<>();
	
	private List<Pair<String, HotDrinkFactory>> namedFactories 
		= new ArrayList<>();
	
	HotDrinkMachine() throws Exception {
		
//		for (AvailableDrink drink : AvailableDrink.values()) {
//			String s = drink.toString();
//			String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase(); 
//			Class<?> factory = Class.forName("learning.design.builder" + factoryName + "Factory");
//			factories.put(drink, (HotDrinkFactory) factory.getDeclaredConstructor().newInstance());
//		}
		
		Set<Class<? extends HotDrinkFactory>> types 
			= new Reflections("learning.design.builder")
			.getSubTypesOf(HotDrinkFactory.class);
		
		for (Class<? extends HotDrinkFactory> fact : types ) {
			namedFactories.add(new Pair<>(fact.getSimpleName()
					.replace("Factory",  ""), fact.getDeclaredConstructor().newInstance()));
		}
	}
	
	public HotDrink makeDrink() throws Exception {
		System.out.println("Available Drinks");
		for (int index = 0; index <= namedFactories.size(); index++) {
			Pair<String, HotDrinkFactory> item = namedFactories.get(index);
			System.out.println(" " + index + " " + item.getString());
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s;
			int i, amount;
			if ((s = reader.readLine()) != null && (i = Integer.parseInt(s)) >= 0
			        && i < namedFactories.size()) {
				System.out.println("Specify Amount : " );
				s = reader.readLine();
				if (s != null && (amount = Integer.parseInt(s)) > 0) {
					return (HotDrink) namedFactories.get(i).getDrinkFactory().prepare(amount);
				}
			}
			System.out.println("Incorrect Input! Try again!");
		}
	}
}