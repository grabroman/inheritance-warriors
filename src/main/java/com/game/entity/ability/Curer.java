package entity.ability;

import com.game.entity.Unit;


@FunctionalInterface
public interface Curer {
    boolean heal(Unit ally);
}
