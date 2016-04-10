package mcGregor.io;

import junit.framework.Test;
import junit.framework.TestSuite;

public class IOTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(IOTests.class.getName());

		suite.addTestSuite(KeyboardInputTest.class);

		return suite;
	}

}
