
package entity.ability;

import com.game.entity.Unit;
import entity.Unit;


@FunctionalInterface
public interface Fighter {
    /**
     * Method which implements hit action from attacker to another entity
     *
     * @param entity
     * @return <b>true</b> if entity has died
     */
    boolean hit(Unit entity);

    boolean hit(Unit enemy);
}
