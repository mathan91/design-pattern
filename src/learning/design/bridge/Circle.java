package learning.design.bridge;

import com.google.inject.Inject;

public class Circle extends Shape {
	
	public float radius;
	
	@Inject
	public Circle(Renderer renderer) {
		super(renderer);
	}
	
	public Circle(Renderer renderer, float radius) {
	    super(renderer);
	    this.radius = radius;
	}
	
	@Override
	void draw() {
		renderer.renderCircle(radius);
	}

	@Override
	void resize(int factor) {
		radius *= factor;
		
	}
}	