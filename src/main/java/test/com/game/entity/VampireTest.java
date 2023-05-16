
package com.game.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.game.factory.UnitFactory;


class VampireTest {
    private UnitFactory factory = new UnitFactory();
    private Warrior bruce = (Warrior) factory.getUnit(UnitTypes.VAMPIRE);
    private Warrior victim = (Warrior) factory.getUnit(UnitTypes.WARRIOR);
    ;

    @BeforeEach
    void setUpBeforeEach() {
        bruce.setHealth(20);
        victim.setHealth(50);
    }

    @Test
    @DisplayName("Vampire shouldn't restore health from damage when healthy")
    void vampireAbility1() {
        bruce.setHealth(40);
        int vampireHealth = bruce.getHealth();
        bruce.hit(victim);
        assertEquals(Vampire.MAX_HEALTH, vampireHealth);
    }

    @Test
    @DisplayName("Vampire should restore health by fifty percent from damage to Warrior")
    void vampireAbility2() {
        int vampireHealth = bruce.getHealth();
        bruce.hit(victim);
        assertEquals(vampireHealth + bruce.getAttack() / 2, bruce.getHealth());
    }

    @Test
    @DisplayName("Vampire should restore health by fifty percent from damage to Defender")
    void vampireAbility3() {
        Defender victim = new Defender();
        int vampireHealth = bruce.getHealth();
        bruce.hit(victim);
        assertEquals(vampireHealth + (bruce.getAttack() - victim.getDefense()) / 2, bruce.getHealth());
    }

    @Test
    @DisplayName("Vampire shouldn't restore health from damage after death")
    void vampireAbility4() {
        bruce.setHealth(0);
        bruce.hit(victim);
        assertEquals(0, bruce.getHealth());
    }
}
