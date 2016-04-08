package mcGregor.application;

import java.util.Scanner;

import mcGregor.enemy.Enemy;
import mcGregor.peter.Peter;
import mcGregor.weapon.Sword;

public class Application implements ApplicationInterface {

	private static ApplicationInterface INSTANCE;

	private Peter peter;
	private Enemy enemy;

	private Scanner keyboard;

	private Application() {
		Sword sword = new Sword();
		this.peter = new Peter(sword);

		this.enemy = new Enemy("Mr. McGregor", 100);

		this.keyboard = new Scanner(System.in);
	}

	public static ApplicationInterface singleton() {

		if (INSTANCE == null) {
			INSTANCE = new Application();
		}
		return INSTANCE;
	}

	public static void setApplication(ApplicationInterface application) {
		INSTANCE = application;
	}

	@Override
	public void run() {

		boolean keepGoing = false;

		do {
			keepGoing = executeGameLoopIteration();
		} while (keepGoing);

		System.out.println("Peter ran away!");
		this.keyboard.close();
	}

	private boolean executeGameLoopIteration() {
		boolean keepGoing;
		this.peter.fight(this.enemy);

		System.out.println("Again? (y/n)");
		keepGoing = this.keyboard.nextLine().equalsIgnoreCase("y") ? true : false;

		System.out.println();
		return keepGoing;
	}

}
