package learning.design.decorator;

public class Circle implements Shape {
	
	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public void resize(int factor) {
		radius *= factor;
	}
	
	@Override
	public String info() {
		return "This is a circle of radius " + radius;
	}

}
