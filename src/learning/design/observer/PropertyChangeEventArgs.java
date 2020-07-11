package learning.design.observer;

public class PropertyChangeEventArgs<T> {

	public T source;
	public String propertyName;
	public Object newValue;
	
	public PropertyChangeEventArgs(T source, String propertyName, Object newValue) {
		super();
		this.source = source;
		this.propertyName = propertyName;
		this.newValue = newValue;
	}
}
