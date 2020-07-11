package learning.design.mediator;

import learning.design.mediator.ChatRoom;

public class Demo {

	public static void main(String[] args) {
	
	Person john = new Person("John");
	Person jane = new Person("Jane");
	Person simon = new Person("Simon");
	
	ChatRoom room = new ChatRoom();
	
    room.join(john); // no message here
    room.join(jane);

    john.say("hi room");
    jane.say("oh, hey john");
    
    room.join(simon);
    simon.say("Hello");
    simon.privateMessage("Jane", "Good Morning");
	
	}
}
