package learning.design.prototype;

import java.io.Serializable;

public class Foo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8428450865065587290L;
	public String name;
	private String whatever;
	
	public Foo(String name, String whatever) {
		this.name = name;
		this.whatever = whatever;
	}
	@Override
	public String toString() {
		return "Foo [name=" + name + ", whatever=" + whatever + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhatever() {
		return whatever;
	}
	public void setWhatever(String whatever) {
		this.whatever = whatever;
	}
}
