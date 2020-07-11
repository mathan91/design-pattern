package learning.design.observer.event;

import learning.design.observer.event.PropertyEventChangeArgs;

public class Person {
	
	public Event<PropertyEventChangeArgs> propertyChanged
	 = new Event<>();
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (this.age == age) return;
		this.age = age;
		propertyChanged.fire(new PropertyEventChangeArgs(this, "age"));
	}
	
}
