package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {
	
	private String plainText;
	private List<TextRange> formatting = new ArrayList<>();
	
	BetterFormattedText(String text) {
		this.plainText = text;
	}
	
	public TextRange getRange(int start, int end) {
		TextRange range = new TextRange(start, end);
		formatting.add(range);
		return range;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			for (TextRange range : formatting) 
				if (range.covers(i) && range.capitalize)
					c = Character.toUpperCase(c);
			sb.append(c);
		}
		return sb.toString();
	}
	
	public class TextRange {
		
		public int start, end;
		public boolean capitalize, bold, italics;
		
		public TextRange(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public boolean covers(int position) {
			return position >= start && position <= end;
		}
	}
}
