package learning.design.singleton;

import java.util.List;

public class SingletonRecordFinder {
	
	private Database database;
	
	public SingletonRecordFinder(Database database) {
		this.database = database;
	}
	
	public int getTotalPop(List<String> cities) {
		
		int tp = 0;
		for (String city : cities) {
			tp += database.getPopulation(city);
		}
		return tp;
	}
}
