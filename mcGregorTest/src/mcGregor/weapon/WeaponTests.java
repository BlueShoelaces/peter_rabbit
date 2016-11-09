package mcGregor.weapon;

import junit.framework.Test;
import junit.framework.TestSuite;
import mcGregor.peter.BaseballBatTest;

public class WeaponTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(WeaponTest.class.getName());

		suite.addTestSuite(WeaponTest.class);
		suite.addTestSuite(BaseballBatTest.class);
		return suite;
	}
}
