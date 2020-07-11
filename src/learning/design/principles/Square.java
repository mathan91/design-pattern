package learning.design.principles;

public class Square extends Rectangle {
	
	Square() {	
	}
	
	public Square(int size) {
		width = height = size;
	}
	
	@Override
	public void setHeight(int size) {
		super.setHeight(size);
		super.setWidth(size);
	}

	public int getArea() {
		return width * height;
	}
	
	@Override
	public void setWidth(int size) {
		super.setHeight(size);
		super.setWidth(size);
	}
}
