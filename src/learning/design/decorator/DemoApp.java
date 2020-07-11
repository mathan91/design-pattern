package learning.design.decorator;

public class DemoApp {

	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
		System.out.println(circle.info());
		
		ColoredShape<Circle> blueCircle = new ColoredShape<Circle>("blue", 
				() -> circle	
				);
		System.out.println(blueCircle.info());	
		
		TransparentShape<ColoredShape<Circle>> transCircle = 
					new TransparentShape<ColoredShape<Circle>>(
							() -> blueCircle
							, 10);
		System.out.println(transCircle.info());
	}
}
