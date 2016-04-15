package mcGregor.weapon;

import junit.framework.Test;
import junit.framework.TestSuite;

public class WeaponTests {

	public static Test suite() {
		final TestSuite suite = new TestSuite(WeaponTest.class.getName());

		suite.addTestSuite(BattleAxeTest.class);
		suite.addTestSuite(CuddlyPawsTest.class);
		suite.addTestSuite(SwordTest.class);
		suite.addTestSuite(WeaponTest.class);

		return suite;
	}
}
