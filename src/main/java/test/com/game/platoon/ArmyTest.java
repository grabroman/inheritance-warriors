
package com.game.platoon;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.game.entity.Healer;
import com.game.entity.Lancer;
import com.game.entity.Unit;
import com.game.entity.General;


class ArmyTest {
    private com.game.platoon.Army<Unit> a;
    private General lord;

    @BeforeEach
    void beforeEach() {
        a = new com.game.platoon.Army<>();
        lord = new General();
    }

    @Test
    @DisplayName("After sort Lancer should stay first and then Healers")
    void warlordAbility() {
        a.addUnit(3, Healer.class);
        a.addUnit(3, Lancer.class);
        a.addUnit(lord);
        a.moveUnits();
        assertTrue(a.peek() instanceof Lancer
                && a.getUnit(1) instanceof Healer);
    }

    @Test
    @DisplayName("Army can't be sorted without Warlord")
    void warlordAbility2() {
        a.addUnit(3, Healer.class);
        a.addUnit(3, Lancer.class);
        try {
            a.moveUnits();
            fail();
        } catch (NullPointerException e) {
            return;
        }
    }

    @Test
    @DisplayName("Army can't consist of more than 1 Warlord")
    void warlordAbility3() {
        a.addUnit(lord);
        try {
            a.addUnit(lord);
            fail();
        } catch (IllegalArgumentException e) {
            return;
        }
    }
}
