package learning.design.singleton;

import java.util.Hashtable;
import java.util.List;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;

public class DatabaseSingleton implements Database {

	private Dictionary<String, Integer> pops = new Hashtable<>();
	private static int instanceCount = 0;
	
	public static int getCount() { 
		return instanceCount; 
	};
	
	private DatabaseSingleton() {
		instanceCount++;
		System.out.println("Initializing Database");
		try {
		File f = new File(DatabaseSingleton.class.getProtectionDomain()
				.getCodeSource().getLocation().getPath());	
		Path fullPath = Paths.get(f.getAbsolutePath(), "capitals.txt");
		List<String> lines = Files.readAllLines(fullPath);
		
		Iterables.partition(lines, 2)
			.forEach(kv -> pops.put(kv.get(0).trim(), 
								    Integer.parseInt(kv.get(1))));
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private static final DatabaseSingleton INSTANCE = new DatabaseSingleton();
	
	public static DatabaseSingleton getInstance() {
		return INSTANCE;
	}
	
	@Override
	public int getPopulation(String city) {
		return pops.get(city);
	}
}