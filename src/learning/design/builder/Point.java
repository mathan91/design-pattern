package learning.design.builder;

public class Point {

	private double x, y;
	
	private Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public static class Factory {
		
		public static Point cartesionPoint(double a, double b) {
			return new Point(a, b);
		}
		
		public static Point polarPoint(double rho, double theta) {
			return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
		}
	}
}
