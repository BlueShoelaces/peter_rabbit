package mcGregor;

public class Application {

	private static Application instance;
	
	public static Application singleton() {

		if (instance == null ) {
			instance = new Application();
		}
		return instance;
	}

}
