package mcGregor.weapon;

import junit.framework.Test;
import junit.framework.TestSuite;

public class WeaponTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(WeaponTest.class.getName());

		suite.addTestSuite(WeaponTest.class);

		return suite;
	}
}
