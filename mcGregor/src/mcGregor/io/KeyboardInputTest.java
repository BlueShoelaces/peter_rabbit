package mcGregor.io;

import junit.framework.TestCase;

public class KeyboardInputTest extends TestCase {

	public void testKeyboardInputNotNull() throws Exception {
		final KeyboardInput keyboardInput = KeyboardInput.singleton();
		assertNotNull(keyboardInput);
	}

	public void testKeyboardInputReturnsItself() throws Exception {

		KeyboardInput firstInstance = KeyboardInput.singleton();
		KeyboardInput secondInstance = KeyboardInput.singleton();

		assertSame(firstInstance, secondInstance);

	}

}
