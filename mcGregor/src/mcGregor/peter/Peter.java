package mcGregor.peter;

import java.util.ArrayList;

import mcGregor.enemy.EnemyInterface;
import mcGregor.io.KeyboardInput;
import mcGregor.weapon.CuddlyPaws;
import mcGregor.weapon.Weapon;

public class Peter {

	private Weapon currentWeapon;
	private ArrayList<Weapon> weapons;

	public Peter(ArrayList<Weapon> weapons) {

		this.weapons = weapons;

		if (weapons.isEmpty()) {
			weapons.add(new CuddlyPaws());
		}
		this.currentWeapon = this.weapons.get(0);
	}

	public void fight(EnemyInterface enemy) {
		this.currentWeapon.attack(enemy);
	}

	public void switchWeapon() {

		System.out.println("Which weapon?");
		for (int weaponIndex = 0; weaponIndex < this.weapons.size(); weaponIndex++) {
			System.out.println(
					" " + (weaponIndex + 1) + " " + this.weapons.get(weaponIndex).getName());
		}
		final int weaponSelection = KeyboardInput.singleton().nextInt() - 1;
		KeyboardInput.singleton().nextLine();
		System.out.println();

		this.currentWeapon = this.weapons.get(weaponSelection);
	}

	public Weapon getCurrentWeapon() {
		return this.currentWeapon;
	}

	public ArrayList<Weapon> getWeapons() {
		return this.weapons;
	}

}
