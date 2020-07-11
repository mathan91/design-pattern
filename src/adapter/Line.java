package adapter;

public class Line {

	public Point start, end;

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = start.hashCode();
		result = prime * result + end.hashCode();
//		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		Line other = (Line) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Line [a=" + start + ", b=" + end + "]";
	}
	
}
