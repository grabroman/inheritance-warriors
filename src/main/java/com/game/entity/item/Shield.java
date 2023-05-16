
package entity.item;


public class Shield extends Weapon {
    public static final int HEALTH_MODIFICATOR = 20;
    public static final int ATTACK_MODIFICATOR = -1;
    public static final int DEFENSE_MODIFICATOR = 2;

    @Override
    protected int getDefaultHealth() {
        return HEALTH_MODIFICATOR;
    }

    @Override
    protected int getDefaultAttack() {
        return ATTACK_MODIFICATOR;
    }

    @Override
    protected int getDefaultDefense() {
        return DEFENSE_MODIFICATOR;
    }
}
