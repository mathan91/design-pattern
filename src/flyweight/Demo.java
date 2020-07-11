package flyweight;

public class Demo {

	public static void main(String[] args) {
		BetterFormattedText text = new BetterFormattedText("India is great");
		text.getRange(0, 4).capitalize = true;
		System.out.println(text);
	}
}
