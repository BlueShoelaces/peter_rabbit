package mcGregor.weapon;

import mcGregor.enemy.Enemy;

public class Sword {

	private final double RANDOM_FACTOR = 0.75;

	private double attackStrength;

	public Sword() {
		this.attackStrength = 15;
	}

	public void attack(Enemy enemy) {
		System.out.println("Peter swings his sword at " + enemy.getName() + ".");
		System.out.println();

		double attackPowerLowerBound = this.attackStrength * this.RANDOM_FACTOR;
		double attackPowerRange = this.attackStrength - attackPowerLowerBound;

		double damageToDeal = determineDamageToDeal(attackPowerLowerBound, attackPowerRange);

		enemy.takeDamage(damageToDeal);
	}

	private double determineDamageToDeal(double attackPowerLowerBound,
			double attackPowerUpperBound) {

		double randomPercentage = Math.random();

		double damageToDeal = attackPowerLowerBound + (randomPercentage * attackPowerUpperBound);
		return damageToDeal;
	}
}
