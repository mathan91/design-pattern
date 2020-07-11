package learning.design.decorator;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> 
	implements Shape {

	private String color;
	private Shape shape;
	
	public ColoredShape(String color, Supplier<? extends T> ctor) {
		this.color = color;
		shape = ctor.get();
	}

	@Override
	public String info() {
		return shape.info() + " of color " + color;
	}
}
