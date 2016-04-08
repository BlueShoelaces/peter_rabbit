package mcGregor.application;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ApplicationTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(ApplicationTests.class.getName());

		suite.addTestSuite(LauncherTest.class);
		suite.addTestSuite(ApplicationTest.class);

		return suite;
	}

}
