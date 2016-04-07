package mcGregor;

import junit.framework.TestCase;

public class McGregorApplicationTest extends TestCase {

	public void testApplicationIsNotNull() throws Exception {

		Application application = McGregorApplication.singleton();
		assertNotNull(application);
	}

	public void testSingletonReturnsItself() throws Exception {

		Application firstInstance = McGregorApplication.singleton();
		Application secondInstance = McGregorApplication.singleton();

		assertSame(firstInstance, secondInstance);
	}

	public void testImplementsApplicationInterface() throws Exception {

		Class<?> implementedInterface = McGregorApplication.class.getInterfaces()[0];

		assertEquals(Application.class, implementedInterface);
	}

	public void testSettingTheApplication() throws Exception {

		MockApplication expectedApplication = new MockApplication();
		McGregorApplication.setApplication(expectedApplication);

		assertSame(expectedApplication, McGregorApplication.singleton());
	}
}
