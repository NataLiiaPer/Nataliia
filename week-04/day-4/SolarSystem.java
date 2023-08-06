import java.util.*;

public class SolarSystem {
    public static void main(String[] args) {
        List<String> planetList = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune");
        ArrayList<String> planetList1 = new ArrayList<>(planetList);

        planetList1.add(5, "Saturn");
        putSaturn(planetList1);

        //  System.out.println(planetList);
        // "Saturn" is missing from the planetList below
        // Insert it into the correct position (should go between Jupiter and Uranus)
        // Create a method called "putSaturn()" which has a list parameter and returns the correct list

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
        //  System.out.println(putSaturn(planetList));
    }
    public static void putSaturn (List < String > planetList1) {

        System.out.println(planetList1);
    }
}



