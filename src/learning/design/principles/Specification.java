package learning.design.principles;

public interface Specification<T> {

	boolean isSatisfied(T item);
	
}
