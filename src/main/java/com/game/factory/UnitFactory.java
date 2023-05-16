
package factory;


import entity.*;

public class UnitFactory {
    public Unit getUnit(UnitTypes type) {
        Unit toReturn;
        switch (type) {
            case WARRIOR:
                toReturn = new Warrior();
                break;
            case KNIGHT:
                toReturn = new Knight();
                break;
            case DEFENDER:
                toReturn = new Defender();
                break;
            case VAMPIRE:
                toReturn = new Vampire();
                break;
            case LANCER:
                toReturn = new Lancer();
                break;
            case HEALER:
                toReturn = new Healer();
                break;
            case GENERAL:
                toReturn = new General();
                break;
            default:
                throw new IllegalArgumentException("Wrong type: " + type);
        }
        return toReturn;
    }
}
