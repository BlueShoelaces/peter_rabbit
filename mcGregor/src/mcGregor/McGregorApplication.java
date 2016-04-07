package mcGregor;

public class McGregorApplication implements Application {

	private static McGregorApplication instance;
	
	public static McGregorApplication singleton() {

		if (instance == null ) {
			instance = new McGregorApplication();
		}
		return instance;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
