package flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Function;

public class User {

	private String fullName;
	public final static List<String> strings = new ArrayList<>();
	private static int[] names;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public User(String fullName) {
		this.fullName = fullName;
		
		Function<String, Integer> getOrAdd = (String s) -> {
			int idx = strings.indexOf(s);
			if (idx != -1) return idx;
			else {
				strings.add(s);
				return strings.size() - 1;
			}
		};	
		names = Arrays.stream(fullName.split(" "))
				.mapToInt(st -> getOrAdd.apply(st)).toArray();
	}
	
	public static void main(String[] args) {
		User user1 = new User("Mathan Mohan");
		User user2 = new User("Mathan Raj");
		User user3 = new User("Mathan Mohan");
		System.out.println(strings);
		Arrays.stream(names)
			.forEach(n -> System.out.println(n));
		User user4 = new User("Vignesh");
		System.out.println(strings);
		Arrays.stream(names)
			.forEach(n -> System.out.println(n));
		System.out.println(names.length);
	}
}