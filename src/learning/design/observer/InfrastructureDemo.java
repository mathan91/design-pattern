package learning.design.observer;

public class InfrastructureDemo implements Observer<Person> {

	public InfrastructureDemo() {
		Person p = new Person();
		p.subscribe(this);
		p.setAge(10);
		p.setAge(11);
		p.setAge(12);
	
	}
	
	public static void main(String[] args) {
		
		new InfrastructureDemo();
	}

	@Override
	public void handle(PropertyChangeEventArgs<Person> args) {
		System.out.println("Person's " + args.propertyName + "has been changed to " + args.newValue);
		
	}
}
