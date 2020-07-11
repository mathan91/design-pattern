package learning.design.chainofResp;

public class CreepModifier {

	protected Game game;
	protected Creeps creep;

	public CreepModifier(Game game, Creeps creep) {
		this.game = game;
		this.creep = creep;
	}
}
