package mcGregor.enemy;

public interface EnemyInterface {

	String getName();
	
	double getCurrentHealth();

	void takeDamage(double damageToDeal);

}
