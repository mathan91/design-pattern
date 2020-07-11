package learning.design.chainofResp;

public class Creeps {

	private Game game;
	public String name;
	public int baseAttack, baseDefense;
	
	public Creeps(Game game, String name, int baseAttack, int baseDefense) {
		super();
		this.game = game;
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
	}	
	
	int getAttack() {
		Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
		game.queries.fire(q);
		return q.result;
	}
	
	int getDefense() {
		Query q = new Query(name, Query.Argument.DEFENSE, baseDefense);
		game.queries.fire(q);
		return q.result;
	}

	@Override
	public String toString() {
		return "Creeps [game=" + game + ", "
				+ "name=" + name + ", "
				+ "baseAttack=" + getAttack() 
				+ ", baseDefense=" + getDefense()
				+ "]";
	}
	
	
	
}
