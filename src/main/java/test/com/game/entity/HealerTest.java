
package com.game.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class HealerTest {

    @Test
    @DisplayName("Healer should heal Warrior")
    void healerAbility1() {
        Warrior bruce = new Warrior();
        Healer bill = new Healer();
        bruce.hit(bruce);
        int hpBefore = bruce.getHealth();
        bill.heal(bruce);
        int hpAfter = bruce.getHealth();
        assertEquals(bill.getPowerHeal(), hpAfter - hpBefore);
        ;
    }

    @Test
    @DisplayName("Healer shouldn't heal dead Warrior")
    void healerAbility2() {
        Warrior bruce = new Warrior();
        Healer bill = new Healer();
        bruce.setHealth(0);
        assertFalse(bill.heal(bruce));
    }

}
