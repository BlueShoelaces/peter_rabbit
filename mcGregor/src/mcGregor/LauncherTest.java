package mcGregor;

import junit.framework.TestCase;

public class LauncherTest extends TestCase {

	public void testMainMethodRunsApplication() throws Exception {

		MockApplication mockApplication = new MockApplication();
		McGregorApplication.setApplication(mockApplication);

		Application actualApplication = McGregorApplication.singleton();

		String[] argsForMainMethod = new String[] { "here", "are", "some", "args" };

		Launcher.main(argsForMainMethod);

		int numberOfTimesRunCalled = actualApplication.getNumberOfTimesRunCalled();

		assertEquals(1, numberOfTimesRunCalled);
	}
}
