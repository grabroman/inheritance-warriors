
package entity.ability;

import java.util.Comparator;

import com.game.entity.Unit;



public interface Warlord extends Comparator<Unit> {

    @Override
    default int compare(Unit o1, Unit o2) {
        if (o1 instanceof Warlord) {
            return 1;
        }
        if (o2 instanceof Warlord) {
            return -1;
        }

        if (o1 instanceof Curer) {
            return -1;
        }
        if (o2 instanceof Curer) {
            return 1;
        }

        if (o1 instanceof MultiFighter && o2 instanceof Fighter) {
            return -1;
        }
        return 0;
    }
}
