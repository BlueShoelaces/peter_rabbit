package mcGregor;

import junit.framework.TestCase;

public class McGregorApplicationTest extends TestCase {

	public void testApplicationIsNotNull() throws Exception {
		
		McGregorApplication application = McGregorApplication.singleton();
		assertNotNull(application);
	}
	
	public void testSingletonReturnsItself() throws Exception {
		
		McGregorApplication firstInstance = McGregorApplication.singleton();
		McGregorApplication secondInstance = McGregorApplication.singleton();
		
		assertSame(firstInstance, secondInstance);
	}
	
	public void testImplementsApplicationInterface() throws Exception {

		Class<?> implementedInterface = McGregorApplication.class.getInterfaces()[0];
		
		assertEquals(Application.class, implementedInterface);
	}
}
