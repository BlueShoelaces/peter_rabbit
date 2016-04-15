package mcGregor.weapon;

import junit.framework.TestCase;
import mcGregor.enemy.MockEnemy;

public class BattleAxeTest extends TestCase {

	public void testProperties() throws Exception {
		BattleAxe battleAxe = new BattleAxe();
		String battleAxeName = "Battle Axe";
		double battleAxeMaxAttackStrength = 25;
		
		assertEquals(battleAxeName, battleAxe.getName());
		assertEquals(battleAxeMaxAttackStrength, battleAxe.getMaxAttackStrength());
	}
	
	public void testAttack() throws Exception {
		BattleAxe battleAxe = new BattleAxe();
			
		MockEnemy mockEnemy = new MockEnemy();
		int mockEnemyInitialHealth = 444;
		mockEnemy.setCurrentHealth(mockEnemyInitialHealth);
		battleAxe.attack(mockEnemy);
		assertTrue(mockEnemy.getCurrentHealth() < mockEnemyInitialHealth);
	}
	
}
