package learning.design.singleton;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SingletonDemo {

	@Test
	public void dependentTest() {
		List<String> cities = new ArrayList<String>();
		cities.add("alpha");
		cities.add("beta");
		
		Database db = new DummyDatabase();
		SingletonRecordFinder rf = new SingletonRecordFinder(db);
		assertEquals(200, rf.getTotalPop(cities));		
	}
}
