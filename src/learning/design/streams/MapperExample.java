package learning.design.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		names.stream().filter(st -> !st.equals("Sam"))
				.map(name -> {
					return new User(name);
				})
				.forEach(st -> System.out.println(st));
		
		names.stream().filter(st -> !st.equals("Sam"))
				.map(User::new)
				.forEach(st -> System.out.println(st));
		
		List<User> user = names.stream().filter(st -> !st.equals("Sam"))
				.map(User::new)
				.collect(Collectors.toList());
		
		int sum = user.stream().mapToInt(usr -> {
			return usr.getAge();
		}).sum();
		
		int count = (int) user.stream().mapToInt(User::getAge).count();
		
		System.out.println(sum);
		System.out.println(count);
		
	}	
	
	static class User {
		
		private String name;
		private int age = 30;
		
		public String getName() {
			return name;
		}
		
		public User(String name) {
			this.name = name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public String toString() {
			return "name:" + name + ", age:" + age;
		}
	}
}
