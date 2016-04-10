package mcGregor.io;

import java.util.Scanner;

public class KeyboardInput implements Input {

	private static Input INSTANCE;
	private Scanner keyboard;

	private KeyboardInput() {
		this.keyboard = new Scanner(System.in);
	}

	public static Input singleton() {
		if (INSTANCE == null) {
			INSTANCE = new KeyboardInput();
		}

		return INSTANCE;
	}

	@Override
	public int nextInt() {
		return this.keyboard.nextInt();
	}

	@Override
	public String nextLine() {
		return this.keyboard.nextLine();
	}

	@Override
	public void close() {
		this.keyboard.close();
		INSTANCE = null;
	}

	public static void setInput(Input input) {
		INSTANCE = input;
	}
}
