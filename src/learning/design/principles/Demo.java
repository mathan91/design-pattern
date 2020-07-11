package learning.design.principles;

public class Demo {

	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		System.out.println("Area is : " + r.getArea());
	}
}
