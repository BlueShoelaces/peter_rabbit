package mcGregor.io;

import junit.framework.TestCase;

public class KeyboardInputTest extends TestCase {

	public void testKeyboardInputNotNull() throws Exception {
		final Input keyboardInput = KeyboardInput.singleton();
		assertNotNull(keyboardInput);
	}

	public void testKeyboardInputReturnsItself() throws Exception {

		Input firstInstance = KeyboardInput.singleton();
		Input secondInstance = KeyboardInput.singleton();

		assertSame(firstInstance, secondInstance);

	}

	public void testImplementsInputInterface() throws Exception {

		Class<?>[] implementedInterfaces = KeyboardInput.class.getInterfaces();
		assertEquals(1, implementedInterfaces.length);

		Class<?> theInterface = implementedInterfaces[0];
		assertEquals(Input.class, theInterface);
	}

	public void testSetInput() throws Exception {

		Input keyboardInput = KeyboardInput.singleton();
		assertEquals(KeyboardInput.class, keyboardInput.getClass());

		MockInput mockInput = new MockInput();
		KeyboardInput.setInput(mockInput);

		keyboardInput = KeyboardInput.singleton();

		assertEquals(MockInput.class, keyboardInput.getClass());
		assertSame(mockInput, keyboardInput);
	}

}
