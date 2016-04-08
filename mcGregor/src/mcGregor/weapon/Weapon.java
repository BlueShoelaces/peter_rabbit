package mcGregor.weapon;

import mcGregor.enemy.Enemy;

public abstract class Weapon {

	private final double DEFAULT_ATTACK_STRENGTH = 2;
	private final double ATTACK_STRENGTH_RANDOM_FACTOR = 0.75;

	protected String name;
	protected double maxAttackStrength;

	public Weapon() {
		this.name = "Cuddly Paws";
		this.maxAttackStrength = this.DEFAULT_ATTACK_STRENGTH;
	}

	public void attack(Enemy enemy) {
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
