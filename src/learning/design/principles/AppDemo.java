package learning.design.principles;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AppDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
				
		Journal j = new Journal();
		j.addItem("I slept fine");
		j.addItem("I like fresh air");
		System.out.println(j);
		
		Persistence persistence = new Persistence();
		persistence.saveToFile(j, "d:\\journal.txt", true);
		Runtime.getRuntime().exec("notepad.exe " + "d:\\journal.txt");
	}
}
