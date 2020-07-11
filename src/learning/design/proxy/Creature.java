package learning.design.proxy;

public class Creature {

	private Property<Integer> agility = new Property<>(10);

	public Property<Integer> getAgility() {
		return agility;
	}

	public void setAgility(Property<Integer> agility) {
		this.agility = agility;
	}
	
	public Creature(int value) {
		agility.setValue(value);
	}
}
