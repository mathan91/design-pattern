package learning.design.principles;

import java.util.ArrayList;
import java.util.List;

public class ProductDemo {

	public static void main(String[] args) {
		
//		List<Product> prod = new ArrayList<Product>();
//		prod.add(new Product("Sky", Color.BLUE, Size.HUGE));
//		prod.add(new Product("Plants", Color.GREEN, Size.MEDIUM));
//		prod.add(new Product("Pillow", Color.RED, Size.SMALL));
		
		Product apple = new Product("Apple", Color.BLUE, Size.SMALL);
		Product tree = new Product("Tree", Color.BLUE, Size.BIG);
		Product house = new Product("House", Color.GREEN, Size.HUGE);
		
		List<Product> prod = new ArrayList<>();
		prod.add(apple);
		prod.add(tree);
		prod.add(house);
		
//		ProductFilter pf = new ProductFilter();
//		System.out.println("Green products (old):");
//	    pf.filterByColor(prod, Color.GREEN)
//	      .forEach(p -> System.out.println(" - " + p.getName() + " is green"));
//	    pf.filterByColor(prod, Color.GREEN).forEach(p -> System.out.println(p.getName()));
		
		BetterFilter bf = new BetterFilter();
		bf.filter(prod, new ColorSpecification(Color.GREEN)).forEach( p -> System.out.println(p.getName()));	
	
		bf.filter(prod, new AndSpecification<> (
				new ColorSpecification(Color.BLUE), 
				new SizeSpecification(Size.SMALL)))
			.forEach( q -> System.out.println(q.getName()));	
		
		List<Specification> spec = new ArrayList<Specification>();
		spec.add(new ColorSpecification(Color.GREEN));
		spec.add(new SizeSpecification(Size.HUGE));
		
		bf.filter(prod, new ListSpecification<Product>(spec)).forEach( p -> System.out.println(p.getName()));
		bf.filter(prod, new ListSpecification<Product>(spec)).forEach( p -> System.out.println(p.getName()));
	}	
	}