package learning.design.chainofResp;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.Map;

public class Event<Args> {

	private int index = 0;
	private Map<Integer, Consumer<Args>>
		handlers = new HashMap<>();
	
	public int subscribe(Consumer<Args> handler) {
		int i = index;
		handlers.put(i++, handler);
		return i;
	}
	
	public void unsubscribe(int key) {
		handlers.remove(key);
	}
	
	public void fire(Args args) {
		for (Consumer<Args> handler : handlers.values()) 
			handler.accept(args);
	}
}
