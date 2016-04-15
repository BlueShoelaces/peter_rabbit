package mcGregor.enemy;

import mcGregor.enemy.EnemyInterface;

public class MockEnemy implements EnemyInterface {
	String name;
	double currentHealth;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void takeDamage(double damageToDeal) {
		this.currentHealth -= damageToDeal;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setCurrentHealth(double health){
		this.currentHealth = health;
	}
	
	@Override
	public double getCurrentHealth() {
		return this.currentHealth;
	}

}
