package mcGregor.peter;

import junit.framework.TestCase;
import mcGregor.weapon.Weapon;

public class BowAndArrowTest extends TestCase {
	public void testExtendsWeapon() throws Exception {
		BowAndArrow bow = new BowAndArrow();
		assertEquals(Weapon.class, bow);
	}

}
