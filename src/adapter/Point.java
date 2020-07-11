package adapter;

public class Point {

	public int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
