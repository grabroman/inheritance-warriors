
package entity.item;


public class GreatAxe extends Weapon {
    public static final int HEALTH_MODIFICATOR = -15;
    public static final int ATTACK_MODIFICATOR = 5;
    public static final int DEFENSE_MODIFICATOR = -2;
    public static final int VAMPIRISM_MODIFICATOR = 10;

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

    @Override
    protected int getDefaultVampirism() {
        return VAMPIRISM_MODIFICATOR;
    }
}
