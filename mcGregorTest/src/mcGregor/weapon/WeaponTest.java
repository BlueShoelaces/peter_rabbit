package mcGregor.weapon;

import java.lang.reflect.Modifier;

import junit.framework.TestCase;

public class WeaponTest extends TestCase {
	
	public void testAbstract() throws Exception {
		assertTrue(Modifier.isAbstract(Weapon.class.getModifiers()));
	}
}
