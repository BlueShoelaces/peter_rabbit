package mcGregor.peter;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PeterTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(PeterTests.class.getName());

		suite.addTestSuite(PeterTest.class);

		return suite;
	}

}
