package mcGregor;

public class MockApplication implements Application {

	private int numberOfTimesRunCalled;

	public MockApplication() {
		this.numberOfTimesRunCalled = 0;
	}

	@Override
	public void run() {
		this.numberOfTimesRunCalled++;
	}

	@Override
	public int getNumberOfTimesRunCalled() {
		return this.numberOfTimesRunCalled;
	}

}
