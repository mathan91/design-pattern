package learning.design.singleton;

import java.util.Dictionary;
import java.util.Hashtable;

public class DummyDatabase implements Database {

	private Dictionary<String, Integer> data 
		= new Hashtable<>();
	
	public DummyDatabase() {
		data.put("alpha", 100);
		data.put("beta", 200);
		data.put("gamma", 150);
	}
	
	@Override
	public int getPopulation(String city) {
		return data.get(city);
	}
}
