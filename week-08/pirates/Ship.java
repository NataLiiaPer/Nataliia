package pirates;

import java.util.ArrayList;

public class Ship {
    int rum;
    int numberOfAlivePirates;
    ArrayList<Pirate> pirates;
    public Ship(){
        pirates = new ArrayList<>();
    }

    public Ship(int rum,int numberOfPirates) {
        this.rum = rum;
        this.numberOfAlivePirates = numberOfPirates;
    }

    public int getRum() {
        return rum;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public int getNumberOfAlivePirates() {
        return numberOfAlivePirates;
    }

    public void setNumberOfAlivePirates(int numberOfAlivePirates) {
        this.numberOfAlivePirates = numberOfAlivePirates;
    }

    public ArrayList<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(ArrayList<Pirate> pirates) {
        this.pirates = pirates;
    }

    public void fillShip(Pirate somePirate){
        pirates.add(somePirate);
    }
    @Override
    public String toString() {
        return "Ship{" +
                "pirates=" + pirates +
                '}';
    }
}

//    The place for the Pirates
//
//        Create a Ship class.
//        The Ship stores Pirate instances in a list as the crew and has one captain who is also a Pirate.
//        When a ship is created it doesn't have a crew or a captain.
//        The ship can be filled with pirates and a captain via fillShip() method:

//        fills the ship with a captain and a random (maximum 113) number of pirates

//        Ships should be represented in a nice way on command line including information about

//        rum consumed by the captain and its state (dead or alive)

//        number of alive pirates in the crew

//        Ships should have a method to battle other ships: ship.battle(otherShip)

//        should return true if the actual ship (this) wins

//        the ship having higher calculated score wins

//        calculated score: Number of alive pirates in the crew
//        - Number of consumed rum by the captain

//        The loser crew has a random number of losses (deaths).

//        The winning captain and crew has a party: everyone drinks a random number of rum :)