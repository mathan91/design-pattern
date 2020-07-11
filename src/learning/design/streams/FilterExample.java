package learning.design.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		
		names.stream().filter(st -> st.equals("Sam")).forEach(System.out::println);
		
	}

}
