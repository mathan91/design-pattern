package learning.design.builder;

public class HTMLBuilder {

	private String rootName;
	private HTMLElement root = new HTMLElement();
	
	public HTMLBuilder(String rootName) {
		this.setRootName(rootName);
		root.setName(rootName);
	}
	
	public HTMLBuilder addChild(String childName, String childText) {
		HTMLElement e = new HTMLElement(childName, childText);
		root.getElement().add(e);
		return this;
	}
	
	public void clear() {
		root = new HTMLElement();
		root.setName(rootName);
	}
	
	public String toString() {
		return root.toString();
	}

	public String getRootName() {
		return rootName;
	}

	public void setRootName(String rootName) {
		this.rootName = rootName;
	}
}
