package pirates;

public class Main {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("John",30, true);
        Pirate pirate1 = new Pirate("Bob",35,true);
        Pirate parrot = new Pirate("Fool",5,true);
        System.out.println(parrot);
        System.out.println(pirate1.isAlive());
        pirate1.die();
        YoungPirate youngPirate = new YoungPirate();
        pirate.brawl(pirate1);
        for (int i = 0; i < 4; i++) {
            pirate.drinkSomeRum();
        }

        youngPirate.drinkSomeRum();
        pirate.brawl(youngPirate);
        System.out.println(pirate);
        System.out.println(pirate1.howsItGoingMate());

    }
}

