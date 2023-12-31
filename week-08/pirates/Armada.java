package pirates;

import java.util.ArrayList;

public class Armada {
    ArrayList<Ship>ships;

    public Armada(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "Armada{" +
                "ships=" + ships +
                '}';
    }
}


//    Create an Armada class
//Contains a list of Ship
//        Have a armada.war(otherArmada) method where two armada can engage in war
//        it should work like merge sort
//        first ship from the first armada battles the first one from the other
//        the loser ship gets skipped so the next ship comes in play from the loser ship's armada
//        it starts a battle with the first (not yet defeated) ship from the other armada
//        whichever armada gets to the end of its ships loses the war
//        return true if this is the winner