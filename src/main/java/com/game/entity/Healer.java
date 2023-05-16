
package entity;

import entity.ability.Curer;
import entity.item.Weapon;


public class Healer extends Unit implements Curer {
    public static final int MAX_HEALTH = 60;
    public static final int HEALING_POWER = 2;

    private int powerHeal;

    @Override
    protected void updateStates() {
        powerHeal = toPositiveOrZero(getDefaultHealingPower() + sumAllValuesInEquipment(Weapon::getHealPower));
        super.updateStates();
    }

    @Override
    public boolean heal(Unit ally) {
        boolean res = false;
        if (this.isAlive() && ally.isAlive()) {
            ally.getDamage(-powerHeal);
            res = true;
        }
        return res;
    }

    @Override
    protected int getDefaultHealth() {
        return MAX_HEALTH + sumAllValuesInEquipment(Weapon::getHealth);
    }

    @Override
    protected int getDefaultAttack() {
        return 0;
    }

    protected int getDefaultHealingPower() {
        return HEALING_POWER;
    }

    /**
     * @return the powerHeal
     */
    public int getPowerHeal() {
        return powerHeal;
    }

    /**
     * @param powerHeal the powerHeal to set
     */
    protected void setPowerHeal(int powerHeal) {
        this.powerHeal = powerHeal;
    }


}
