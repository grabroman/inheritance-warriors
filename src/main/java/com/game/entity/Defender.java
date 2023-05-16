
package entity;

import entity.item.Weapon;


public class Defender extends Warrior {
    public static final int MAX_HEALTH = 60;
    public static final int ATTACK = 3;
    public static final int DEFENSE = 2;

    private int def;

    @Override
    protected void updateStates() {
        def = toPositiveOrZero(getDefaultDefense() + sumAllValuesInEquipment(Weapon::getDefense));
        super.updateStates();
    }

    @Override
    protected void getDamage(int damage) {
        damage -= def;
        if (damage < 0) {
            damage = 0;
        }
        super.getDamage(damage);
    }

    @Override
    protected int getDefaultHealth() {
        return MAX_HEALTH;
    }

    @Override
    protected int getDefaultAttack() {
        return ATTACK;
    }

    protected int getDefaultDefense() {
        return DEFENSE;
    }

    /**
     * @return the defense
     */
    public int getDefense() {
        return def;
    }

    /**
     * @param def the defense to set
     */
    protected void setDefense(int def) {
        this.def = def;
    }

}
