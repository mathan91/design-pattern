package learning.design.chainofResp;

public class NoBonusModifier extends CreatureModifier {

	public NoBonusModifier(Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.println("Nothing");
	}
}
