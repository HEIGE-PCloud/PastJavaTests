package videogame;

public abstract class Entity {
	
	protected String name;
	protected int lifePoints = 0;

	public Entity(String name, int lifePoints) {
		assert(lifePoints >= 0);
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public final boolean isAlive() {
		/* TODO: Implement as part of Section A Question 2 */
		return false;
	}
	
	public final int applySpell(SpellCaster spellCaster) {
		/* TODO: Implement as part of Section A Question 2 */
		return -1;
	}
	
	protected abstract int propagateDamage(int damageAmount);

	public abstract int minimumStrikeToDestroy();
	
}
