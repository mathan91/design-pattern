package learning.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vignesh
 *
 */
public class Person {
	
	public String name;
	public ChatRoom room;
	private List<String> msgLog = new ArrayList<>();
	
	public Person(String name) {
		this.name = name;
	}
	
	public void receive(String sender, String message) {
		String s = sender + ": " + message;
		System.out.println(s);
		msgLog.add(s);
	}
	
	public void say(String message) {
		room.broadcast(name, message);
	}
	
	public void privateMessage(String who, String message) {
		room.message(name, who, message);
	}
	
	
	
}
