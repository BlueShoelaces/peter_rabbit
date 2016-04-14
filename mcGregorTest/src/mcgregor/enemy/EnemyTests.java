package mcgregor.enemy;

import junit.framework.Test;
import junit.framework.TestSuite;

public class EnemyTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(EnemyTests.class.getName());

		suite.addTestSuite(EnemyTest.class);

		return suite;
	}

}
