package mcGregor.weapon;

import mcGregor.enemy.EnemyInterface;

public abstract class Weapon {

	private final double ATTACK_STRENGTH_RANDOM_FACTOR = 0.75;

	protected String name;
	protected double maxAttackStrength;

	public void attack(EnemyInterface enemy) {
		System.out.println(
				"Peter swings his " + this.name.toUpperCase() + " at " + enemy.getName() + ".");
		System.out.println();

		double attackPowerLowerBound = this.maxAttackStrength * this.ATTACK_STRENGTH_RANDOM_FACTOR;
		double attackPowerRange = this.maxAttackStrength - attackPowerLowerBound;

		double damageToDeal = determineDamageToDeal(attackPowerLowerBound, attackPowerRange);

		enemy.takeDamage(damageToDeal);
	}

	private double determineDamageToDeal(double attackPowerLowerBound,
			double attackPowerUpperBound) {

		double randomPercentage = Math.random();

		double damageToDeal = attackPowerLowerBound + (randomPercentage * attackPowerUpperBound);
		return damageToDeal;
	}

	public String getName() {
		return this.name;
	}
}
