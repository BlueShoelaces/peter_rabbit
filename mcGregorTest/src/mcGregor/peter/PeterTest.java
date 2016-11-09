package mcGregor.peter;

import java.util.ArrayList;

import junit.framework.TestCase;
import mcGregor.io.KeyboardInput;
import mcGregor.io.MockInput;
import mcGregor.weapon.BattleAxe;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Sword;
import mcGregor.weapon.Weapon;

public class PeterTest extends TestCase {

	public void testConstructor() throws Exception {

		final ArrayList<Weapon> expectedWeapons = new ArrayList<Weapon>();
		final BattleAxe expectedCurrentWeapon = new BattleAxe();
		final Sword sword = new Sword();
		final CuddlyPaws cuddlyPaws = new CuddlyPaws();

		expectedWeapons.add(0, expectedCurrentWeapon);
		expectedWeapons.add(sword);
		expectedWeapons.add(cuddlyPaws);
		final Peter peter = new Peter(expectedWeapons);

		final ArrayList<Weapon> actualWeapons = peter.getWeapons();
		assertEquals(expectedWeapons, actualWeapons);

		final Weapon actualCurrentWeapon = peter.getCurrentWeapon();
		assertEquals(expectedCurrentWeapon, actualCurrentWeapon);

		assertEquals(actualWeapons.size(), 3);
		assertTrue(actualWeapons.contains(expectedCurrentWeapon));
		assertTrue(actualWeapons.contains(sword));
		assertTrue(actualWeapons.contains(cuddlyPaws));
	}

	public void testPeterWithNoWeaponsUsesDefaultWeapon() throws Exception {

		final ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		final Peter peter = new Peter(weapons);

		final Weapon currentWeapon = peter.getCurrentWeapon();
		assertEquals(currentWeapon.getClass(), CuddlyPaws.class);
	}

	public void testSwitchWeapon() throws Exception {

		final ArrayList<Weapon> weapons = new ArrayList<Weapon>();

		final int indexOfSword = 0;
		final int indexOfBattleAxe = 1;
		final int indexOfCuddlyPaws = 2;

		final Sword sword = new Sword();
		final BattleAxe battleAxe = new BattleAxe();
		final CuddlyPaws cuddlyPaws = new CuddlyPaws();

		weapons.add(indexOfSword, sword);
		weapons.add(indexOfBattleAxe, battleAxe);
		weapons.add(indexOfCuddlyPaws, cuddlyPaws);

		final MockInput mockInput = new MockInput();
		KeyboardInput.setInput(mockInput);

		final Peter peter = new Peter(weapons);

		final int swordMenuOption = indexOfSword + 1;
		final int battleAxeMenuOption = indexOfBattleAxe + 1;
		final int cuddlyPawsMenuOption = indexOfCuddlyPaws + 1;

		mockInput.setIntToReturn(battleAxeMenuOption);
		peter.switchWeapon();
		assertEquals(battleAxe, peter.getCurrentWeapon());

		mockInput.setIntToReturn(cuddlyPawsMenuOption);
		peter.switchWeapon();
		assertEquals(cuddlyPaws, peter.getCurrentWeapon());

		mockInput.setIntToReturn(swordMenuOption);
		peter.switchWeapon();
		assertEquals(sword, peter.getCurrentWeapon());
	}
}
