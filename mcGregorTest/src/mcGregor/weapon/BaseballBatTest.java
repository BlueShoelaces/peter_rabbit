package mcGregor.weapon;

import junit.framework.TestCase;
import mcGregor.enemy.MockEnemy;

public class BaseballBatTest extends TestCase {

	
	public void testProperties() throws Exception {
		BaseballBat baseballBat = new BaseballBat();
		String baseballBatName = "Baseball bat";
		double baseballBatMaxAttackStrength = 15;
		
		assertEquals(baseballBatName, baseballBat.getName());
		assertEquals(baseballBatMaxAttackStrength, baseballBat.getMaxAttackStrength());
	}
	
	public void testAttack() throws Exception {
		BaseballBat baseballBat = new BaseballBat();
			
		MockEnemy mockEnemy = new MockEnemy();
		int mockEnemyInitialHealth = 100;
		mockEnemy.setCurrentHealth(mockEnemyInitialHealth);
		baseballBat.attack(mockEnemy);
		assertTrue(mockEnemy.getCurrentHealth() < mockEnemyInitialHealth);
	}
}
