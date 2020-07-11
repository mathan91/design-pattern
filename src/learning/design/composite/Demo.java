package learning.design.composite;

public class Demo {

	public static void main(String[] args) {
		GraphicObject obj = new GraphicObject();
		obj.setName("New Drawing");
		obj.children.add(new Square("red"));
		obj.children.add(new Square("red"));
		
		GraphicObject group = new GraphicObject();
		group.setName("group");
		group.children.add(new Circle("Blue"));
		group.children.add(new Square("Blue"));
		
		obj.children.add(group);
		System.out.println(obj);
		System.out.println(group);

	}

}
