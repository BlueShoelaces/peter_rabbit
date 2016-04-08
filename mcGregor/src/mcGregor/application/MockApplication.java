package mcGregor.application;

public class MockApplication implements ApplicationInterface {

	private int numberOfTimesRunCalled;

	public MockApplication() {
		this.numberOfTimesRunCalled = 0;
	}

	@Override
	public void run() {
		this.numberOfTimesRunCalled++;
	}

	public int getNumberOfTimesRunCalled() {
		return this.numberOfTimesRunCalled;
	}

}
