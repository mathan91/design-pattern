package learning.design.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

	private List<Person> people = new ArrayList<>();
	
	public void join(Person p) {
		String msg = p.name + " joins the chat ";
		broadcast("room", msg);
		p.room = this;
		people.add(p);
	}
	
	public void broadcast(String person, String message) {
	for (Person p : people) 
		if (!p.name.equalsIgnoreCase(person)) 
			p.receive(person, message);
	}

	public void message(String name, String who, String message) {
		
		people.stream()
			.filter(p -> p.name.equalsIgnoreCase(who))
			.findAny()
			.ifPresent(p -> p.receive(name, message));
	}
}