package learning.design.builder;

public class DemoPoint {

	public static void main(String[] args) {
		
		Point newPoint = Point.Factory.cartesionPoint(2, 3);
		System.out.println(newPoint);
		newPoint = Point.Factory.polarPoint(4, 45);
		System.out.println(newPoint);

	}

}
