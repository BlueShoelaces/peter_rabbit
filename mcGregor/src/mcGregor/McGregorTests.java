package mcGregor;

import junit.framework.Test;
import junit.framework.TestSuite;

public class McGregorTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(McGregorTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(LauncherTest.class);
		suite.addTestSuite(McGregorApplicationTest.class);
		//$JUnit-END$
		return suite;
	}

}
