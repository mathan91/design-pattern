package learning.design.singleton;

/**
 * @author Vignesh
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		
		BasicSingleton single = BasicSingleton.getInstance();
		single.setValue(100);
		System.out.println(single.getValue());
		
	}
}
