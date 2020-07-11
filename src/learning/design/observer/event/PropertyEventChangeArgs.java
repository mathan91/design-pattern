package learning.design.observer.event;

public class PropertyEventChangeArgs {

	public Object source;
	public String propertyName;
	
	public PropertyEventChangeArgs(Object source, String propertyName) {
		super();
		this.source = source;
		this.propertyName = propertyName;
	}
}
