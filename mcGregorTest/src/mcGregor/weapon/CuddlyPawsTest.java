package mcGregor.weapon;

import junit.framework.TestCase;
import mcGregor.enemy.MockEnemy;

public class CuddlyPawsTest extends TestCase {
	
	public void testProperties() throws Exception {
		CuddlyPaws cuddlyPaws = new CuddlyPaws();
		String cuddlyPawsName = "Cuddly Paws";
		double cuddlyPawsStrength = 2;
		
		assertEquals(cuddlyPawsName, cuddlyPaws.getName());
		assertEquals(cuddlyPawsStrength, cuddlyPaws.getMaxAttackStrength());
	}
	
	public void testAttack() throws Exception {
		CuddlyPaws cuddlyPaws = new CuddlyPaws();
			
		MockEnemy mockEnemy = new MockEnemy();
		int mockEnemyInitialHealth = 42;
		mockEnemy.setCurrentHealth(mockEnemyInitialHealth);
		cuddlyPaws.attack(mockEnemy);
		
		assertTrue(mockEnemy.getCurrentHealth() < mockEnemyInitialHealth);
	}
}
