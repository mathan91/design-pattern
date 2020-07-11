package learning.design.principles;

public class ShapeFactory {

	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width, height);
	}
	
	public static Rectangle newSquare(int size) {
		return new Square(size);
	}
	
}