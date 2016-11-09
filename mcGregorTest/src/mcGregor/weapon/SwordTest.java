package mcGregor.weapon;

import junit.framework.TestCase;
import mcGregor.enemy.MockEnemy;

public class SwordTest extends TestCase {

	public void testProperties() throws Exception {
		final Sword sword = new Sword();

		final String expectedName = "Sword";
		final String actualName = sword.getName();
		assertEquals(expectedName, actualName);

		final double actualMaxAttackStrength = sword.getMaxAttackStrength();
		final double expectedMaxAttackStrength = 15.0;
		assertEquals(expectedMaxAttackStrength, actualMaxAttackStrength);
	}

	public void testAttackDoesDamage() throws Exception {
		final Sword excalibur = new Sword();
		final MockEnemy arthur = new MockEnemy();
		arthur.setName("King Arthur");

		final double healthBeforeAttack = 100.0;
		arthur.setCurrentHealth(healthBeforeAttack);
		excalibur.attack(arthur);
		final double healthAfterAttack = arthur.getCurrentHealth();

		assertTrue(healthAfterAttack < healthBeforeAttack);
	}

}
