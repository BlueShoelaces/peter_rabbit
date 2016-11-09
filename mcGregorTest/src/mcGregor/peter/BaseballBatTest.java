package mcGregor.peter;

import junit.framework.TestCase;
import mcGregor.weapon.Weapon;

public class BaseballBatTest extends TestCase {
	public void testBat() throws Exception {
		BaseballBat bat = new BaseballBat();
		assertEquals("Bat", bat.getName());
	}

	public void testBatExtendsWeapon() throws Exception {
		Class<? super BaseballBat> superclass = BaseballBat.class.getSuperclass();
		assertEquals(Weapon.class, superclass);
	}
}
