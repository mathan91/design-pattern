package learning.design.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperIntExample {

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
		
		user.stream().forEach(System.out::println);
		
	}
	
	static class User {
		
		private String name;
		private Integer age = 30;
		
		public String getName() {
			return name;
		}
		
		public User(String name) {
			this.name = name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		public String toString() {
			return "name:" + name + ", age:" + age;
		}
	}
}
