package mcGregor;

public class McGregorApplication implements Application {

	private static Application instance;

	private McGregorApplication() {

	}

	public static Application singleton() {

		if (instance == null) {
			instance = new McGregorApplication();
		}
		return instance;
	}

	public static void setApplication(Application application) {
		instance = application;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNumberOfTimesRunCalled() {
		// TODO Auto-generated method stub
		return 0;
	}

}
