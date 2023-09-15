package FleetOfThings;

public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing milk = new Thing("Get milk");
        Thing butter = new Thing("Remove the obstacles");
        Thing bread = new Thing("bread");
        bread.complete();

        fleet.add(milk);
        fleet.add(butter);
       fleet.add(bread);

        System.out.println(fleet);
    }
}

// - You have the `Thing` class
// - You have the `Fleet` class
// - You have the `FleetOfThings` class with a `main()` method
// - Download those, use those
// - Create a fleet in the main() method

// - Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch