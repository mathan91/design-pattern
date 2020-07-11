package learning.design.bridge;

public abstract class Shape {

	protected Renderer renderer;
	
	public Shape(Renderer renderer) {
		this.renderer = renderer;
	}
	
	abstract void draw();
	abstract void resize(int factor);
	
}
