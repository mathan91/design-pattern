package learning.design.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

	private BasicSingleton() {
	}
	
	private static BasicSingleton instance;
	static {
		try {
		instance = new BasicSingleton();
		}
		catch (Exception e) {
			System.err.print("Error in creating singleton");
		}
	}
	
	public static BasicSingleton getInstance() {
		return instance;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private int value = 0;
	
	public Object readResolve() {
		return instance;
	}
}


