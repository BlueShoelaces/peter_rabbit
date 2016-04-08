package mcGregor.application;

import junit.framework.TestCase;

public class ApplicationTest extends TestCase {

	public void testApplicationIsNotNull() throws Exception {

		ApplicationInterface application = Application.singleton();
		assertNotNull(application);
	}

	public void testSingletonReturnsItself() throws Exception {

		ApplicationInterface firstInstance = Application.singleton();
		ApplicationInterface secondInstance = Application.singleton();

		assertSame(firstInstance, secondInstance);
	}

	public void testImplementsApplicationInterface() throws Exception {

		Class<?> implementedInterface = Application.class.getInterfaces()[0];

		assertEquals(ApplicationInterface.class, implementedInterface);
	}

	public void testSettingTheApplication() throws Exception {

		MockApplication expectedApplication = new MockApplication();
		Application.setApplication(expectedApplication);

		assertSame(expectedApplication, Application.singleton());
	}
}
