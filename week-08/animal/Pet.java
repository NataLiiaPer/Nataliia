package animal;


import java.util.Objects;

public class Pet {
    private int hunger;
    private int thirst;

    public Pet() {
        this.hunger = 0;
        this.thirst = 0;
        // this is default constructor, its allow as to create an object without
        // parameter inside the bracket,
        // but we can assign parameters by default
    }

    public Pet(int hunger) { // now we can add one parameter inside the bracket
        this.hunger = hunger;
    }

    public Pet(int hunger, int thirst) { // now we can add two parameters inside the bracket
        this.hunger = hunger;
        this.thirst = thirst;
    }

    // we need few constructors if we want to allow a user to choose
    // how many parameters they can put inside the brackets (zero, one or two)
    //setter
    public void setHunger(int hunger) {
        if (hunger == 0) {
            System.out.println("put the number");
        } else {
            this.hunger = hunger;
        }
    }

    public int getHunger() {
        return hunger;
    }

    //setter
    public void setThirst(int thirst) {
        if (thirst != 50) {
            System.out.println("put the right number");
        } else {
            this.thirst = thirst;
        }
    }

    public int getThirst(int hunger,int maxHunger) {

        if(hunger==maxHunger){
        return thirst;
        }
        return thirst;
    }

    void eat() {
        hunger -= 1;
        System.out.println("level " + hunger);
    }

    void drink() {
        thirst -= 1;
        System.out.println("level " + thirst);
    }

    void play() {
        hunger += 1;
        thirst += 1;
        System.out.println("level " + hunger + " " + thirst);
    }
//    public boolean isContain(Pet anotherPet) {
//        return Objects.equals(this.hunger, anotherPet.hunger);
//    }

//    boolean isContain(Pet anotherPet) {
//
//            return this.hunger.equals(anotherPet.hunger);
//
//    }
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pet pet = (Pet) o;
    return hunger == pet.hunger && thirst == pet.thirst;
}

    @Override
    public int hashCode() {
        return Objects.hash(hunger, thirst);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}

//  Create an Animal class
//  Every animal has a hunger value, which is a whole number
//  Every animal has a thirst value, which is a whole number
//  When creating a new animal instance these values must be set to the default 50 value
//  Every animal can eat() which decreases its hunger by one
//  Every animal can drink() which decreases its thirst by one
//  Every animal can play() which increases both its hunger and thirst by one