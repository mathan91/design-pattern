package learning.design.chainofResp;

public class DemoApp {

	public static void main(String[] args) {
		
		Game game = new Game();
		Creeps goblin = new Creeps(game, "Strong goblin", 2, 3);
		System.out.println(goblin);
		CreepDefenseModifier icm = new CreepDefenseModifier(game, goblin);
		
		CreepDoubleAttackModifier da = new CreepDoubleAttackModifier(game, goblin);
	
		System.out.println(goblin);
		System.out.println(goblin);
	}

}
