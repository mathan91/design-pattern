package learning.design.chainofResp;

public class Demo {

	public static void main(String[] args) {
		Creature goblin = new Creature("Goblin", 2, 2);
		
		CreatureModifier mod = new CreatureModifier(goblin);
		mod.add(new IncreaseDefenseModifier(goblin));
		
		mod.add(new DoubleAttackModifier(goblin));
		mod.handle();
		
		System.out.println(goblin);
	}
}