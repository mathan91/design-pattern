package learning.design.prototype;

import org.apache.commons.lang3.SerializationUtils;

public class DemoProto {
	
	public static void main(String[] args) {
	
	Foo foo = new Foo("Mathan", "New");
	Foo fooNew = SerializationUtils.roundtrip(foo);

	fooNew.setName("Name");
	System.out.println(foo);
	System.out.println(fooNew);
	
	}
}
