package mcGregor.application;

import junit.framework.TestCase;

public class LauncherTest extends TestCase {

	public void testMainMethodRunsApplication() throws Exception {

		MockApplication mockApplication = new MockApplication();
		Application.setApplication(mockApplication);

		MockApplication actualApplication = (MockApplication) Application.singleton();

		String[] argsForMainMethod = new String[] { "here", "are", "some", "args" };

		Launcher.main(argsForMainMethod);

		int numberOfTimesRunCalled = actualApplication.getNumberOfTimesRunCalled();

		assertEquals(1, numberOfTimesRunCalled);
	}
}
