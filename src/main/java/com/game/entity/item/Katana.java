
package entity.item;


public class Katana extends Weapon {
    public static final int HEALTH_MODIFICATOR = -20;
    public static final int ATTACK_MODIFICATOR = 6;
    public static final int DEFENSE_MODIFICATOR = -5;
    public static final int VAMPIRISM_MODIFICATOR = 50;

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
