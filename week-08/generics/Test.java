package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal= new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs= new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfAnimal);
        test(listOfDogs);

    }
    private static void test(List<? extends Animal > animal){
        for(Animal an:animal){
            System.out.println(an);//in class Animal we will cal method
            // toString(class Object has this method)
            an.eat();
        }

    }
}
