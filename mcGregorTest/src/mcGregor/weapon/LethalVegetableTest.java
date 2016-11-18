package mcGregor.weapon;

import junit.framework.TestCase;
import mcGregor.enemy.MockEnemy;

public class LethalVegetableTest extends TestCase {

	// TODO: Test #1
	public void testAttackStrength() throws Exception {
		String normalVegetable = "generic veggie";
		LethalVegetable lethalVegetable = new LethalVegetable(normalVegetable);

		final double actualMaxAttackStrength = lethalVegetable.getMaxAttackStrength();
		final double expectedMaxAttackStrength = 35.0;
		assertEquals(expectedMaxAttackStrength, actualMaxAttackStrength);
	}

	// TODO: Test #2
	public void testAttackDoesDamage() throws Exception {
		LethalVegetable lethalParsnip = new LethalVegetable("parsnip");
		final MockEnemy toothDecay = new MockEnemy();
		toothDecay.setName("Tooth Decay");

		final double healthBeforeAttack = 100.0;
		toothDecay.setCurrentHealth(healthBeforeAttack);
		lethalParsnip.attack(toothDecay);
		final double healthAfterAttack = toothDecay.getCurrentHealth();

		assertTrue(healthAfterAttack < healthBeforeAttack);
	}

	// TODO: Test #3
	public void testConstructorPrependsAdjectiveToName_Celery() throws Exception {
		String normalCeleryName = "celery stalk";
		LethalVegetable lethalCelery = new LethalVegetable(normalCeleryName);

		String actualName = lethalCelery.getName();
		String expectedName = "Giant celery stalk";
		assertEquals(expectedName, actualName);
	}

	// TODO: Test #4
	public void testConstructorPrependsAdjectiveToName_Carrot() throws Exception {
		String normalCarrotName = "carrot";
		LethalVegetable lethalCarrot = new LethalVegetable(normalCarrotName);

		String actualName = lethalCarrot.getName();
		String expectedName = "Giant carrot";
		assertEquals(expectedName, actualName);
	}
}
