package learning.design.bridge;

public class RasterRenderer implements Renderer {

	@Override
	public void renderCircle(float radius) {
		System.out.println("Developing a pixel of radius: " + radius);
	}

}
