package petrolStation;

public class Station {
  private int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }
   public void refillCar(Car car){
        gasAmount--;
                car.decrease();
                car.increase();
       System.out.println("gas amount in the car "+car.gasAmount+
               " car capacity = "+car.capacity+" gas amount in the station "+gasAmount);
   }
    @Override
    public String toString() {
        return "Station{" +
                "gasAmount=" + gasAmount +
                '}';
    }
}

//        Station

//    it stores how much gas is avaliable: gasAmount
//        the gas amount must be given when we create a station
//        it can refill a car: refill(car):
//        decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
//        increases the car's gasAmount