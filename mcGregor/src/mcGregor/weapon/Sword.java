package mcGregor.weapon;

import mcGregor.enemy.Enemy;

public class Sword {

	private double attackStrength;
	
	public Sword() {
		this.attackStrength = 15;
	}
	
	public void swingAt(Enemy enemy) {
		System.out.println("Peter swings his sword at " + enemy.getName() + ".");
		System.out.println();
		
		enemy.takeDamage(this.attackStrength);
	}
}
