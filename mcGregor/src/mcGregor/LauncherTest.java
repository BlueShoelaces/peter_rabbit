package mcGregor;

import junit.framework.TestCase;

public class LauncherTest extends TestCase {
	
	public void testMainMethod() throws Exception {
		// i d actually k what to do in here
		assertEquals("sup", "sup");
		
	}
	
	public void testMainMethodCallsRun() throws Exception {
		
		
		Launcher.main(new String[0]);
		
	}
}
