
package entity;


import entity.ability.Fighter;
import platoon.Army;

public abstract class Warrior extends Unit implements Fighter {
    public static final int MAX_HEALTH = 50;
    public static final int ATTACK = 5;

    @Override
    public boolean hit(Unit enemy) {
        boolean enemyhasKilled = false;
        if (this.isAlive() && enemy.isAlive()) {
            enemy.getDamage(this.getAttack());
            if (!enemy.isAlive()) {
                enemyhasKilled = true;
            }
        }
        return enemyhasKilled;
    }

    public abstract boolean hit(Army<? extends Unit> army);

    @Override
    protected int getDefaultHealth() {
        return MAX_HEALTH;
    }

    @Override
    protected int getDefaultAttack() {
        return ATTACK;
    }

}
