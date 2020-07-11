package learning.design.principles;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;

	public ColorSpecification(Color color) {
		this.color = color;
	}
	
	@Override
	public boolean isSatisfied(Product item) {
		return item.getColor() == color;
	}
}
