package learning.design.principles;

import java.util.ArrayList;
import java.util.List;

public class ListSpecification<T> implements Specification<T> {
	
	private List<Specification> list = new ArrayList<Specification>();
	
	ListSpecification(List<Specification> spec) {
		this.list = spec;
	}
		
	@Override
	public boolean isSatisfied(T item) {

		boolean satisfied = true;
		
		for (Specification specs : list) {
			if (!specs.isSatisfied(item)) {
				satisfied = false;
				break;
			}
		}
		return satisfied;
	}
}