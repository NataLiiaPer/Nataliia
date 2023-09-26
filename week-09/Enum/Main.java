package Enum;

import java.util.*;

import static Enum.CarType.ELEMENT1;
import static Enum.Color.RED;

public class Main {
    public static void main(String[] args) {
//        CarType carType = getRandomEnumValue(CarType.class);
//
//        String carTypeValue = carType.getCarName();
//
//        System.out.println();



//       Car car = new Car(RED,ELEMENT1);

        List<Car> selectedCars = new ArrayList<>();
        int numberOfCars = 256; //  we create 256 Vehicles randomly

        for (int i = 0; i < numberOfCars; i++) {
            CarType randomTypeCar = getRandomEnumValue(CarType.class);
            Color randomColorCar = getRandomEnumValue(Color.class);
            Car newCar = new Car(randomColorCar,randomTypeCar);

            selectedCars.add(newCar); //we don't need method getValue because

        }

        System.out.println("Selected elements: " + selectedCars);
        countCars(selectedCars);
        mostFrequentCar();
    }

    private static void mostFrequentCar() {

    }

    private static void countCars( List<Car>  carList) {
        //   List<String> stringList = Arrays.asList("Car 1", "Car 2", "Car 3", "Car 4", "Car 5");


        Map<Color, Integer> stringCountMap = new HashMap<>();

        for (Car car: carList) {
            stringCountMap.put(car.getColor(), stringCountMap.getOrDefault(car.getColor(), 0) + 1);
        }

        for (Map.Entry<Color, Integer> entry : stringCountMap.entrySet()) {
            Color key = entry.getKey();
            int count = entry.getValue();
            System.out.println("Car" + key + "' occurs " + count + " times.");

            // if()
        }
    }

    private static <T extends Enum<?>> T getRandomEnumValue(Class<T> enumClass) {
        Random random = new Random();
        int enumLength = enumClass.getEnumConstants().length;
        //enumClass.getEnumConstants().length определяет количество элементов в перечислении.
        int randomIndex = random.nextInt(enumLength);
        return enumClass.getEnumConstants()[randomIndex];
    }

}

