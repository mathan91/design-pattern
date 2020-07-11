package learning.design.chainofResp;

public class DoubleAttackModifier extends CreatureModifier {

	public DoubleAttackModifier(Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.println("Doubling " + creature.getName() + "'s attack");
		creature.setAttack(creature.getAttack() * 2);
		super.handle();
	}	
}
