package petrolStation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0,100);
        System.out.println(car);
        Station station = new Station(100);
        System.out.println(station);
        station.refillCar(car);

    }
}

//    Create Station and Car classes

//        Station

//    it stores how much gas is avaliable: gasAmount
//        the gas amount must be given when we create a station
//        it can refill a car: refill(car):
//        decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
//        increases the car's gasAmount

//        Car

//        it stores how much gas is actually present: gasAmount
//        it stores the capacity of the tank: capacity
//        create a constructor for the Car class where you:
//        initialize gasAmount -> 0
//        initialize capacity -> 100