package learning.design.observer.event;

public class HandleEventsDemo {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person();
		
		Event<PropertyEventChangeArgs>.Subscription sub = p.propertyChanged.addHandler(x -> {
			System.out.println("Person's age has changed");
		}); 
		p.setAge(20);
		p.setAge(21);
		sub.close();
		p.setAge(22);
	}

}
