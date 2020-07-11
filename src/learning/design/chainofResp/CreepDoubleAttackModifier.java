package learning.design.chainofResp;

import learning.design.chainofResp.Query.Argument;

public class CreepDoubleAttackModifier extends CreepModifier
	implements AutoCloseable {
	
	private final int token;
	
	public CreepDoubleAttackModifier(Game game, Creeps creep) {
		super(game, creep);
		token = game.queries.subscribe(q -> {
			if (q.creatureName.equals(creep) && q.argument == Argument.ATTACK) {
				q.result *= 2;
			}
		});
	}

	@Override
	public void close() throws Exception {
		game.queries.unsubscribe(token);
	}

}
