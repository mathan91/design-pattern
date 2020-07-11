package learning.design.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HTMLElement {

	private String name, text;
	private ArrayList<HTMLElement> elements = new ArrayList<>();
	private final int INDENTSIZE = 2;
	private final String NEWLINE = System.lineSeparator();
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<HTMLElement> getElement() {
		return elements;
	}
	public void setElement(ArrayList<HTMLElement> element) {
		this.elements = element;
	}
	
	public HTMLElement() {
	}
	
	public HTMLElement(String name, String text) {
		this.name = name;
		this.text = text;
	}
	
	private String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		String i = String.join("", Collections.nCopies(indent * INDENTSIZE, " "));
		sb.append(String.format("%s<%s>%s", i, name, NEWLINE));
		if (text != null && !text.isEmpty()) {
			sb.append(String.join("", Collections.nCopies(INDENTSIZE*(indent+1), " ")))
			  .append(text)
			  .append(NEWLINE);
		}
		for (HTMLElement e : elements) 	sb.append(e.toStringImpl(indent+1));
		
		sb.append(String.format("%s</%s>%s", i, name, NEWLINE));
		return sb.toString();

	}
	
	@Override
	public String toString() {
		return toStringImpl(0);
	}
	
}