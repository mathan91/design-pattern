package learning.design.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<User> names = Arrays.asList(
				new User("Peter", 20, Arrays.asList("1", "2")),
				new User("Peter", 20, Arrays.asList("3", "4")),				
				new User("Peter", 20, Arrays.asList("5", "6"))
				);
		
		Optional<String> stringOptional = names.stream().map(user -> user.getPhoneNumbers().stream())
				.flatMap(stringStream -> stringStream.filter(phNo -> phNo.equals("10")))
				.findAny();
		
		stringOptional.ifPresent(System.out::println);
	}
	
	
	static class User {
		
		private String name;
		private Integer age = 30;
		private List<String> phoneNumbers;
		
		public User(String name, Integer age, List<String> phoneNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumbers = phoneNumbers;
		}

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

		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
	}
}
