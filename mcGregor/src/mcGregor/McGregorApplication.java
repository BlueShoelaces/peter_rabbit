package mcGregor;

import mcGregor.enemy.Enemy;
import mcGregor.peter.Peter;
import mcGregor.weapon.Sword;

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
		Sword sword = new Sword();
		Peter peter = new Peter(sword);
		
		Enemy mrMcGregor = new Enemy("Mr. McGregor", 100);
		
		peter.attack(mrMcGregor);
		
	}

	@Override
	public int getNumberOfTimesRunCalled() {
		// TODO Auto-generated method stub
		return 0;
	}

}
