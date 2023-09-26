package sharpieSet;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> sharp= new ArrayList<>();


   public void removeTrash() {

        for (Sharpie sharps : sharp) {
            if (sharps.getInkAmount()==0) {
                sharp.remove(sharps);
            }

              }
        }

public void addSharpie2(Sharpie sh){

    sharp.add(sh);
}
    public int countUsable() {
        int counter = 0;
        for (Sharpie sharp : sharp) {
            int result = sharp.getInkAmount();
            if (result > 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        String result = "";
        for(Sharpie s : sharp){
            result += s.toString() + "\n";
        }
        return result;
    }
}


//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie, named listOfSharpies
//it has a method that adds a new Sharpie to the set: add(sharpie)

// it has a method that returns the number of usable Sharpies: countUsable()
// -> sharpie is usable if it contains ink

// it has a method that removes all unusable Sharpies: removeTrash()

//Test your class by adding usable and unusable sharpies, then call the removeTrash() function
//Test your class also by having 3 unusable sharpies only, then call the removeTrash() function