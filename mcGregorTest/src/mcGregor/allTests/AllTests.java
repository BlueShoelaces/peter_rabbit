package mcGregor.allTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import mcGregor.application.ApplicationTests;
import mcGregor.io.IOTests;
import mcGregor.peter.PeterTests;
import mcGregor.weapon.WeaponTests;
import mcgregor.enemy.EnemyTests;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());

		suite.addTest(ApplicationTests.suite());
		suite.addTest(EnemyTests.suite());
		suite.addTest(IOTests.suite());
		suite.addTest(PeterTests.suite());
		suite.addTest(WeaponTests.suite());

		return suite;
	}

}
