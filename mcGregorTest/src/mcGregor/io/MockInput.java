package mcGregor.io;

public class MockInput extends KeyboardInputTest implements Input {

	private int intToReturn;
	private String stringToReturn;

	public MockInput() {
		this.intToReturn = 0;
		this.stringToReturn = "";
	}

	@Override
	public void close() {

	}

	@Override
	public int nextInt() {
		return this.intToReturn;
	}

	@Override
	public String nextLine() {
		return this.stringToReturn;
	}

	public void setIntToReturn(int intToReturn) {
		this.intToReturn = intToReturn;
	}

	public void setStringToReturn(String stringToReturn) {
		this.stringToReturn = stringToReturn;
	}

}
