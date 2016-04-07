package mcGregor;

import junit.framework.TestCase;

public class ApplicationTest extends TestCase {

	public void testApplicationIsNotNull() throws Exception {
		
		Application application = Application.singleton();
		assertNotNull(application);
		
	}
	
	public void testSingletonReturnsItself() throws Exception {
		
		Application firstInstance = Application.singleton();
		Application secondInstance = Application.singleton();
		
		assertSame(firstInstance, secondInstance);
	}
}
