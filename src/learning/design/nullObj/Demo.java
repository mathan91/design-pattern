package learning.design.nullObj;

import java.lang.reflect.Proxy;

public class Demo {
	
	@SuppressWarnings("unchecked")
	public static <T> T noOp(Class<T> itf) {
	
		return (T) Proxy.newProxyInstance(
				itf.getClassLoader(),
				new	Class<?>[] { itf },
				(proxy, method, args) ->
				{
				 if (method.getReturnType().equals(Void.TYPE))
					 return null;
				 else return method.getReturnType().getConstructor().newInstance();
				});
		
	}

	
	public static void main(String[] args) {
		
		Log log = noOp(Log.class);
		BankAccount ba = new BankAccount(log);
		
	}
}
