package learning.design.chainofResp;

public class IncreaseDefenseModifier extends CreatureModifier {

	public IncreaseDefenseModifier(Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.println("Defense is increased");
		creature.setDefense(creature.getDefense() + 3);
		super.handle();
	}
}
