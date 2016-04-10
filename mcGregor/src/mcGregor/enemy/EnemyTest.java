package mcGregor.enemy;

import junit.framework.TestCase;

public class EnemyTest extends TestCase {

	public void testConstructor() throws Exception {

		String expectedName = "Ganon";
		double expectedMaxHealth = 666.6;
		Enemy ganon = new Enemy(expectedName, expectedMaxHealth);

		String actualName = ganon.getName();
		double actualMaxHealth = ganon.getMaxHealth();

		assertEquals(expectedName, actualName);
		assertEquals(expectedMaxHealth, actualMaxHealth);
	}

	public void testCurrentHealthStartsAsMaxHealth() throws Exception {

		double expectedMaxHealth = 75.3;
		Enemy bowser = new Enemy("Bowser", expectedMaxHealth);

		double actualMaxHealth = bowser.getMaxHealth();
		assertEquals(expectedMaxHealth, actualMaxHealth);

		double currentHealth = bowser.getCurrentHealth();
		assertEquals(actualMaxHealth, currentHealth);
	}

	public void testEnemyTakesDamage() throws Exception {

		String name = "Ridley";
		double maxHealth = 1000.0;
		Enemy ridley = new Enemy(name, maxHealth);

		double damageTaken = 15.3;
		ridley.takeDamage(damageTaken);

		assertEquals(maxHealth - damageTaken, ridley.getCurrentHealth());
	}

	public void testEnemyCannotDie() throws Exception {

		String name = "Pac-Man Ghost";
		double maxHealth = 42.0;

		Enemy enemy = new Enemy(name, maxHealth);

		enemy.takeDamage(maxHealth + 1);

		assertEquals(maxHealth, enemy.getCurrentHealth());
	}

	public void testImplementsEnemyInterface() throws Exception {

		Class<?>[] implementedInterfaces = Enemy.class.getInterfaces();
		assertEquals(1, implementedInterfaces.length);

		Class<?> firstInterface = implementedInterfaces[0];
		assertEquals(EnemyInterface.class, firstInterface);
	}

}
