package learning.design.principles;

public class DemoApp {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2,3);
		System.out.println(rc.getArea());
		
		Rectangle sq = new Square(10);
		System.out.println(sq.getArea());

	}

}
