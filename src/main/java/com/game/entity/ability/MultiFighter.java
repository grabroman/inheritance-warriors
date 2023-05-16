
package entity.ability;

import com.game.platoon.Army;
import com.game.entity.Unit;


public interface MultiFighter extends Fighter {
    boolean hit(Army<? extends Unit> army);
}
