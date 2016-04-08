package mcGregor.peter;

import mcGregor.enemy.Enemy;
import mcGregor.weapon.Sword;

public class Peter {

	private Sword sword;
	
	public Peter(Sword sword) {
		this.sword = sword;
	}

	public void attack(Enemy enemy) {
		this.sword.swingAt(enemy);
	}

}
