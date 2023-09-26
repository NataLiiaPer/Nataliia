package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pirate {
    private boolean isAlive;

    private String name;
    private int age;

    public Pirate() {
    }

    ;
    private int intoxicate = 0;

    public Pirate(String name, int age, boolean isAlive) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
    }

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

    public void drinkSomeRum() {
        if(isAlive){
        intoxicate++;}
        else {
            System.out.println("he is dead");
        }

    }

    ;

    public String howsItGoingMate() {
        if (isAlive) {
            if (intoxicate < 4) {
                return "Pour me anudder!";
            } else {
                intoxicate = 0;
                return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            }
        } else {
            return "he's dead";
        }

    }



    public void brawl(Pirate somePirate) {
        Random random = new Random();
        int max = 100,min = 50;
     //   int randomNum = min + (int)(Math.random() * ((max – min) + 1));
     //   System.out.println(randomNum);
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void die() {
        this.isAlive = false;
    }

    ;

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", age=" + age + " intoxicate " + intoxicate +
                '}';
    }
}

//    drinkSomeRum() - intoxicates the Pirate by one
//        howsItGoingMate() - when called, the Pirate replies:
//        if drinkSomeRum() was called less than 4 times:
//        "Pour me anudder!"
//        else:
//        "Arghh, I'ma Pirate. How d'ya d'ink its goin?". Then the pirate passes out and sleeps it off
//        (gets rid of the intoxication).
//        If you manage to get this far, then you can try to do the following.
//
//        brawl(Pirate) - where pirate fights another pirate (if both of them are alive):
//        there is 1/3 chance that this dies, the other dies or they both pass out.
//        die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
//        And... if you get that far...
//
//        Add a parrot.