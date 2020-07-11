package learning.design.decorator;

public class Square implements Shape {
	
	private float size;
	
	public Square (float size) {
		this.size = size;
	}
	
	@Override
	public String info() {
		return "This is a Square of side " + size;
	}

}
