public class Animal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.hunger = 1;
        animal1.thirst = 1;
    }
}

class Pet {
   private int hunger;
   private int thirst;

   public Pet(int hunger,int thirst) {
       this.hunger = hunger;
       this.thirst = thirst;
    }

}

//  Create an Animal class
//  Every animal has a hunger value, which is a whole number
//  Every animal has a thirst value, which is a whole number
//  When creating a new animal instance these values must be set to the default 50 value
//  Every animal can eat() which decreases its hunger by one
//  Every animal can drink() which decreases its thirst by one
//  Every animal can play() which increases both its hunger and thirst by one