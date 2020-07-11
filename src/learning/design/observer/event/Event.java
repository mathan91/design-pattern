package learning.design.observer.event;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {

	private int count = 0;
	private Map<Integer, Consumer<TArgs>> handlers 
		= new HashMap<>();
	
	public Subscription addHandler(Consumer<TArgs> handler) {
		
		int i = count;
		handlers.put(count++, handler);
		return new Subscription(this, i);
		
	}
	
	public void fire(TArgs args) {
		for (Consumer<TArgs> arg : handlers.values()) 
			arg.accept(args);
	}
	
	public class Subscription implements AutoCloseable {
		
		private Event<TArgs> event;
		private int id;
		
		public Subscription(Event<TArgs> event, int id) {
			this.event = event;
			this.id = id;
		}

		@Override
		public void close() throws Exception {
			event.handlers.remove(id);
		}
		
	}
	
}
