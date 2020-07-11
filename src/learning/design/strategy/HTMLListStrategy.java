package learning.design.strategy;

public class HTMLListStrategy implements ListStrategy {

	@Override
	public void addListItem(StringBuilder sb, String item) {
		
		sb.append("   <li>").append(item)
				.append("</li>")
				.append(System.lineSeparator());
		
	}

	@Override
	public void start(StringBuilder sb) {
		// TODO Auto-generated method stub
		sb.append("<ul>").append(System.lineSeparator());
	}

	@Override
	public void end(StringBuilder sb) {
		// TODO Auto-generated method stub
		sb.append("</ul>").append(System.lineSeparator());
	}

	
	
}
