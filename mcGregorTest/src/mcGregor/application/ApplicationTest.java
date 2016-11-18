package mcGregor.application;

import java.util.ArrayList;

import junit.framework.TestCase;
import mcGregor.peter.Peter;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.LethalVegetable;
import mcGregor.weapon.Sword;
import mcGregor.weapon.Weapon;

public class ApplicationTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		Application.setApplication(null);
		super.setUp();
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

	// TODO: Test #5
	public void testPeterIsConstructedWithCorrectWeapons() throws Exception {

		final Peter peter = Application.singleton().getPeter();
		final ArrayList<Weapon> weapons = peter.getWeapons();

		assertEquals(4, weapons.size());

		assertEquals(CuddlyPaws.class, weapons.get(0).getClass());
		assertEquals(Sword.class, weapons.get(1).getClass());
		assertEquals(BattleAxe.class, weapons.get(2).getClass());
		assertEquals(LethalVegetable.class, weapons.get(3).getClass());
	}

	// TODO: Test #6
	public void testPeterIsConstructedWithGiantChiliPepper() throws Exception {

		Peter peter = Application.singleton().getPeter();
		ArrayList<Weapon> weapons = peter.getWeapons();

		String actualLethalVegetableName = weapons.get(3).getName();
		String expectedLethalVegetable = "Giant chili pepper";
		assertEquals(expectedLethalVegetable, actualLethalVegetableName);
	}
}
