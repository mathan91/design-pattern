package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

	private static final List<VectorObject> VECTOR
		= new ArrayList<>(Arrays.asList(new VectorRectange(1, 3, 5, 4),
										new VectorRectange(3, 3, 6, 6)));
	
	private static void drawpoint(Point p) {
		System.out.println(".");
	}
	
	private static void draw() {
		for (VectorObject vo : VECTOR) {
			for (Line line : vo) {
				LinetoPointAdapter lp = new LinetoPointAdapter(line);
				lp.forEach(AdapterDemo::drawpoint);
			}
		}
	}
	
	public static void main(String[] args) {
		draw();
		draw();
	}
}
