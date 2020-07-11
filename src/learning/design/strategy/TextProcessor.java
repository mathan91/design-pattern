package learning.design.strategy;

import java.util.List;

public class TextProcessor {

	private StringBuilder sb = new StringBuilder();
	private ListStrategy ls;
	
	public TextProcessor(Output format) {
		setUpformat(format);
	}

	public void setUpformat(Output format) {
		
		switch(format) {
			case MARKDOWN : 
				ls = new MarkDownListStrategy();
				break;
			case HTML : 
				ls = new HTMLListStrategy();
				break;
		}
	}
	
	public void appendList(List<String> items) {
		ls.start(sb);
		for (String item : items) 
			ls.addListItem(sb, item);
		ls.end(sb);
	}
	
	public void clear() {
		sb.setLength(0);
	}
	
	@Override
	public String toString() {
		return sb.toString();
	}
	
}
