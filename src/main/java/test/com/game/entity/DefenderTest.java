
package com.game.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.game.Battle;
import com.game.factory.UnitFactory;
import com.game.platoon.Army;


class DefenderTest {
    private UnitFactory factory = new UnitFactory();

    private Army<Warrior> hero;
    private Army<Warrior> enemy;

    @BeforeEach
    void setUpBefore() {
        hero = new Army<>();
        enemy = new Army<>();
    }

    @Test
    @DisplayName("Defender should take less actual damage")
    void defenseTest() {
        Warrior attacker = (Warrior) factory.getUnit(UnitTypes.WARRIOR);
        Defender defender = (Defender) factory.getUnit(UnitTypes.DEFENDER);
        attacker.hit(defender);
        assertNotEquals(Warrior.ATTACK, Defender.MAX_HEALTH - defender.getHealth());
    }

    @Test
    @DisplayName("Defender should win Warrior in fight")
    void fightWithDefender1() {
        assertTrue(Battle.fight(factory.getUnit(UnitTypes.DEFENDER),
                factory.getUnit(UnitTypes.WARRIOR)));
    }

    @Test
    @DisplayName("Defender should lose Knight in fight")
    void fightWithDefender2() {
        assertFalse(Battle.fight(factory.getUnit(UnitTypes.DEFENDER),
                factory.getUnit(UnitTypes.KNIGHT)));
    }

    @Test
    @DisplayName("Defender army should lose warrior army")
    void fightWithDefenderArmy1() {
        hero.addUnit(1, Defender.class);
        enemy.addUnit(2, Warrior.class);
        assertFalse(Battle.fight(hero, enemy));
    }

    @Test
    @DisplayName("Defender army should win warrior army")
    void fightWithDefenderArmy2() {
        hero.addUnit(1, Warrior.class);
        hero.addUnit(1, Defender.class);
        enemy.addUnit(2, Warrior.class);
        assertTrue(Battle.fight(hero, enemy));
    }
}
