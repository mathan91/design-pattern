package learning.design.bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BridgeDemo {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ShapeModule());
		Circle instance = injector.getInstance(Circle.class);
		instance.radius = 6;
		instance.draw();
		instance.resize(2);
		instance.draw();
	}

}
