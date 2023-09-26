package Farm;

import animal.Pet;
import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Pet> farm = new ArrayList<>(5);

    public void sell() {

        System.out.println("the index of the least hanger pet is "
                + farm.indexOf(findMaxHunger()));

        farm.remove(findMaxHunger());

    }


    private Pet findMaxHunger() {

        int maxHunger = farm.get(0).getHunger();
        Pet maxHangerPet = farm.get(0);
        for (Pet somePet : farm) {
            if (maxHangerPet.getHunger() < somePet.getHunger()) {
                maxHangerPet = somePet;
                System.out.println("the least hungry animal " + maxHangerPet);
            }
        }
        return maxHangerPet;
    }

    public void breed(Pet p) {
        farm.add(p);
        if (farm.size() <= 5) {
            System.out.println("We have " + farm.size() + " animals");
        } else {
            System.out.println("We can't breed more animals");
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Pet p:farm){
            result += p.toString()+"\n";
        }
        return result;
    }



}

//Reuse your Animal class
//Create a Farm class
//it has a list of Animals listOfAnimals
// it has a limit that defines how many animals can be kept
// in the Farm and can be set when the Farm is created
//  it has two methods:
//  breed() -> creates a new animal if there's place for it

//  sell() -> removes the least hungry animal