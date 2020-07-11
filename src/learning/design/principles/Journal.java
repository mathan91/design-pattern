package learning.design.principles;

import java.util.ArrayList;
import java.util.List;

public class Journal {

	final List<String> entries = new ArrayList<String>();
	private int count = 0;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<String> getEntries() {
		return entries;
	}
	
	public void addItem(String newEntry) {
		entries.add("" + (++count) + ":" + newEntry);	
	}
	
	public void removeItem(int index) {
		entries.remove(index);
	}
	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
}
