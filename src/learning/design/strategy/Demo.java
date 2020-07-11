package learning.design.strategy;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		TextProcessor tp = new TextProcessor(Output.MARKDOWN);
		tp.appendList(Arrays.asList("Liberte", "egalite", "fratenite"));
		System.out.println(tp);
		tp.clear();
		tp.setUpformat(Output.HTML);
		tp.appendList(Arrays.asList("JAVA", "C++", "Python"));
		System.out.println(tp);
		tp.clear();
	
	}

}
