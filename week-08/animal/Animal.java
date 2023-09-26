package animal;

public class Animal {
    public static void main(String[] args) {
        Pet animal1 = new Pet();
        Pet animal5 = new Pet(1,1);
        animal1.setHunger(50);
        System.out.println("now the level of hunger for first animal is "+animal1.getHunger());
        animal1.setThirst(50);
//        animal1.hunger = 50; // it does not work because our fields are private
//        animal1.thirst = 50;
        animal1.eat();
        animal1.drink();
        animal1.play();
        Pet animal2 = new Pet();
        animal2.setHunger(50);
        System.out.println("now the level of hunger for second animal is "+animal2.getHunger());
        animal2.setThirst(50);
//        animal2.hunger = 50;
//        animal2.thirst = 50;
        animal2.eat();
        animal2.drink();
        animal2.play();
    }
}

//  Create an Animal class
//  Every animal has a hunger value, which is a whole number
//  Every animal has a thirst value, which is a whole number
//  When creating a new animal instance these values must be set to the default 50 value
//  Every animal can eat() which decreases its hunger by one
//  Every animal can drink() which decreases its thirst by one
//  Every animal can play() which increases both its hunger and thirst by one