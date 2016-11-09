package mcGregor.application;

import mcGregor.peter.Peter;

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

	@Override
	public Peter getPeter() {
		// TODO Auto-generated method stub
		return null;
	}

}
