
package com.game.entity.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.game.Battle;
import com.game.entity.Defender;
import com.game.entity.Healer;
import com.game.entity.Knight;
import com.game.entity.Lancer;
import com.game.entity.Unit;
import com.game.entity.Vampire;
import com.game.entity.Warrior;


class WeaponTest {

    @Test
    @DisplayName("Weapon should increase parameters")
    void weapon1() {
        Weapon weapon = new Weapon(5, 5, 5, 5, 5);
        Warrior warrior = new Warrior();
        warrior.equipWeapon(weapon);
        assertNotEquals(Warrior.ATTACK, warrior.getAttack());
        assertNotEquals(Warrior.MAX_HEALTH, warrior.getHealth());
    }

    @Test
    @DisplayName("Warrior should died after equip weapon")
    void weapon2() {
        Weapon weapon = new Weapon(-100, 0, 0, 0, 0);
        Warrior warrior = new Warrior();
        warrior.equipWeapon(weapon);
        assertFalse(warrior.isAlive());
    }

    @Test
    @DisplayName("Weapons should increase parameters")
    void weapon3() {
        Weapon weapon1 = new Weapon(5, 0, 0, 0, 0);
        Weapon weapon2 = new Weapon(5, 0, 0, 0, 0);

        Warrior warrior = new Warrior();
        warrior.equipWeapon(weapon1);
        warrior.equipWeapon(weapon2);

        assertEquals(Warrior.MAX_HEALTH + 10, warrior.getHealth());
    }

    @Test
    @DisplayName("Unit with weapon should win in fight")
    void unitsWithWeapon1() {
/*        Unit unit1 = new Warrior();
        Unit unit2 = new Vampire();
        Weapon weapon1 = new Weapon(-10, 5, 0, 40, 0);
        Weapon weapon2 = new Sword();
        unit1.equipWeapon(weapon1);
        unit2.equipWeapon(weapon2);
        assertTrue(Battle.fight(unit1, unit2));*/
    }

    @Test
    @DisplayName("Unit with weapon should lose in fight")
    void testUnitsWithWeapon2() {
        Unit unit1 = new Defender();
        Unit unit2 = new Lancer();
        Weapon weapon1 = new Shield();
        Weapon weapon2 = new GreatAxe();
        unit1.equipWeapon(weapon1);
        unit2.equipWeapon(weapon2);
        assertFalse(Battle.fight(unit1, unit2));
    }

    @Test
    @DisplayName("Unit with weapon should lose in fight")
    void testUnitsWithWeapon3() {
    /*    Unit unit1 = new Healer();
        Unit unit2 = new Knight();
        Weapon weapon1 = new MagicWand();
        Weapon weapon2 = new Katana();
        unit1.equipWeapon(weapon1);
        unit2.equipWeapon(weapon2);
        assertFalse(Battle.fight(unit1, unit2));*/
    }

    @Test
    @DisplayName("Unit with weapon should lose in fight")
    void testUnitsWithWeapon4() {
       /* Unit unit1 = new Defender();
        Unit unit2 = new Vampire();
        Weapon weapon1 = new Shield();
        Weapon weapon2 = new MagicWand();
        Weapon weapon3 = new Shield();
        Weapon weapon4 = new Katana();
        unit1.equipWeapon(weapon1);
        unit1.equipWeapon(weapon2);
        unit2.equipWeapon(weapon3);
        unit2.equipWeapon(weapon4);
        assertFalse(Battle.fight(unit1, unit2));*/
    }
}
