package pirates;

public class Pirate {
    String name;
    int age;
   public Pirate(){};

    public Pirate(String name) {
        this.name = name;
    }

    public Pirate(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void drinkSomeRum(){};
    public static void howsItGoingMate(){};
    public static void brawl(Pirate somePirate){};
    public static void die(){};

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//    drinkSomeRum() - intoxicates the Pirate by one
//        howsItGoingMate() - when called, the Pirate replies:
//        if drinkSomeRum() was called less than 4 times:
//        "Pour me anudder!"
//        else:
//        "Arghh, I'ma Pirate. How d'ya d'ink its goin?". Then the pirate passes out and sleeps it off (gets rid of the intoxication).
//        If you manage to get this far, then you can try to do the following.
//
//        brawl(Pirate) - where pirate fights another pirate (if both of them are alive):
//        there is 1/3 chance that this dies, the other dies or they both pass out.
//        die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
//        And... if you get that far...
//
//        Add a parrot.