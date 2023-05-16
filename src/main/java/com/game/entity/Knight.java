
package entity;


public class Knight extends Warrior {
    public static final int MAX_HEALTH = 50;
    public static final int ATTACK = 7;

    @Override
    protected int getDefaultAttack() {
        return ATTACK;
    }
}
