package learning.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
	
	private final Object target;
	public LoggingHandler(Object target) {
		super();
		this.target = target;
	}
	private Map<String, Integer> calls = new HashMap<>();
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String name = method.getName();
		if (name.contains("toString")) return calls.toString();
		
		calls.merge(name, 1, Integer::sum);
		return method.invoke(target, args);
	}

}
