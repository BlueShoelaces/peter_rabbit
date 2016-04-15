package mcGregor.application;

import java.util.ArrayList;

import junit.framework.TestCase;
import mcGregor.peter.Peter;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Sword;
import mcGregor.weapon.Weapon;

public class ApplicationTest extends TestCase {

	@Override
	protected void tearDown() throws Exception {
		Application.setApplication(null);
		super.tearDown();
	}

	public void testApplicationIsNotNull() throws Exception {

		final ApplicationInterface application = Application.singleton();
		assertNotNull(application);
	}

	public void testSingletonReturnsItself() throws Exception {

		final ApplicationInterface firstInstance = Application.singleton();
		final ApplicationInterface secondInstance = Application.singleton();

		assertSame(firstInstance, secondInstance);
	}

	public void testImplementsApplicationInterface() throws Exception {

		final Class<?> implementedInterface = Application.class.getInterfaces()[0];

		assertEquals(ApplicationInterface.class, implementedInterface);
	}

	public void testSettingTheApplication() throws Exception {

		final MockApplication expectedApplication = new MockApplication();
		Application.setApplication(expectedApplication);

		assertSame(expectedApplication, Application.singleton());
	}

	public void testPeterIsConstructedWithCorrectWeapons() throws Exception {

		final Peter peter = Application.singleton().getPeter();
		final ArrayList<Weapon> weapons = peter.getWeapons();

		assertEquals(3, weapons.size());

		assertEquals(Sword.class, weapons.get(0).getClass());
		assertEquals(BattleAxe.class, weapons.get(1).getClass());
		assertEquals(CuddlyPaws.class, weapons.get(2).getClass());
	}
}
