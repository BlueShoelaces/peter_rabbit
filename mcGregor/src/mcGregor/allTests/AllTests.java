package mcGregor.allTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import mcGregor.application.ApplicationTests;
import mcGregor.enemy.EnemyTests;
import mcGregor.io.IOTests;
import mcGregor.peter.PeterTests;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());

		suite.addTest(ApplicationTests.suite());
		suite.addTest(EnemyTests.suite());
		suite.addTest(IOTests.suite());
		suite.addTest(PeterTests.suite());

		return suite;
	}

}
