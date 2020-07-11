package learning.design.decorator;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

	private Shape shape;
	private int transparency;
	
	public TransparentShape(Supplier<? extends T> spr, int transparency) {
		shape = spr.get();
		this.transparency = transparency;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " of transparency " + transparency;
	}
	
}
