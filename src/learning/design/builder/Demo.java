package learning.design.builder;

public class Demo {

	public static void main(String[] args) {

//		String hello = "<p>hello</p>";
//		String[] words = {"hello", "world"};
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(hello + "\n");
//		sb.append("<ul>\n");
//		for (String word : words) {
//			sb.append(String.format("<li>%s</li>\n", word));
//		}
//		sb.append("</ul>");
//		System.out.println(sb);
		
		HTMLBuilder builder = new HTMLBuilder("ul");
		builder.addChild("li", "hello").addChild("li", "world");
		System.out.println(builder);
		
	}

}
