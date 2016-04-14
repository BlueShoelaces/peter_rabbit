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

		ArrayList<Weapon> expectedWeapons = new ArrayList<Weapon>();
		BattleAxe expectedCurrentWeapon = new BattleAxe();
		Sword sword = new Sword();
		CuddlyPaws cuddlyPaws = new CuddlyPaws();

		expectedWeapons.add(0, expectedCurrentWeapon);
		expectedWeapons.add(sword);
		expectedWeapons.add(cuddlyPaws);
		Peter peter = new Peter(expectedWeapons);

		ArrayList<Weapon> actualWeapons = peter.getWeapons();
		assertEquals(expectedWeapons, actualWeapons);

		Weapon actualCurrentWeapon = peter.getCurrentWeapon();
		assertEquals(expectedCurrentWeapon, actualCurrentWeapon);

		assertEquals(actualWeapons.size(), 3);
		assertTrue(actualWeapons.contains(expectedCurrentWeapon));
		assertTrue(actualWeapons.contains(sword));
		assertTrue(actualWeapons.contains(cuddlyPaws));
	}

	public void testPeterWithNoWeaponsUsesDefaultWeapon() throws Exception {

		ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		Peter peter = new Peter(weapons);

		Weapon currentWeapon = peter.getCurrentWeapon();
		assertEquals(currentWeapon.getClass(), CuddlyPaws.class);
	}

	public void testSwitchWeapon() throws Exception {

		ArrayList<Weapon> weapons = new ArrayList<Weapon>();

		int indexOfSword = 0;
		int indexOfBattleAxe = 1;
		int indexOfCuddlyPaws = 2;

		Sword sword = new Sword();
		BattleAxe battleAxe = new BattleAxe();
		CuddlyPaws cuddlyPaws = new CuddlyPaws();

		weapons.add(indexOfSword, sword);
		weapons.add(indexOfBattleAxe, battleAxe);
		weapons.add(indexOfCuddlyPaws, cuddlyPaws);

		MockInput mockInput = new MockInput();
		KeyboardInput.setInput(mockInput);

		Peter peter = new Peter(weapons);

		int swordMenuOption = indexOfSword + 1;
		int battleAxeMenuOption = indexOfBattleAxe + 1;
		int cuddlyPawsMenuOption = indexOfCuddlyPaws + 1;

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
