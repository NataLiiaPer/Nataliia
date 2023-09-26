package Farm;

import animal.Pet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Farm farmOfAnimals = new Farm();
        farmOfAnimals.breed(new Pet(10, 10));
        farmOfAnimals.breed(new Pet(100, 20));
        farmOfAnimals.breed(new Pet(15, 30));
        farmOfAnimals.breed(new Pet(20, 40));
        farmOfAnimals.breed(new Pet(30, 50));
        farmOfAnimals.breed(new Pet(30, 50));
        farmOfAnimals.sell();
        System.out.println(farmOfAnimals);

    }

    }

