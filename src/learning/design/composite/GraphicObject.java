package learning.design.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GraphicObject {

	protected String name = "Object";
	
	GraphicObject() {
		
	}
 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String color;
	public List<GraphicObject> children = new ArrayList<>();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		print(sb,0);
		return sb.toString();
	}

	private void print(StringBuilder sb, int depth) {
		sb.append(String.join("", Collections.nCopies(depth, "*")))
			.append(depth > 0 ? " ": "")
			.append((color == null || color.isEmpty()) ? "" : color + " " )
			.append(getName())
			.append(System.lineSeparator());
		for (GraphicObject child : children) {
			child.print(sb, depth + 1);
		}
	}
}
