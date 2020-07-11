package adapter;

public class VectorRectange extends VectorObject {
	
	public VectorRectange(int x, int y, int height, int width) {
		
		add(new Line(new Point(x,y) , new Point(x+width, y) ));
		add(new Line(new Point(x,y+height), new Point(x+width,y+height) ));
		add(new Line(new Point(x, y), new Point(x, y+height) ));
		add(new Line(new Point(x+width, y), new Point(x+width, y+height) ));
	
	}	
}
