package petrolStation;

public class Car {
    int gasAmount;
    int capacity;

    public Car(int gasAmount,int capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGasAmount() {
        return gasAmount;

    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }
   public void decrease(){
        capacity--;
       System.out.println(capacity);
   }
   public void increase(){
       gasAmount++;
       System.out.println(gasAmount);
   }

    @Override
    public String toString() {
        return "Car{" +
                "gasAmount=" + gasAmount +
                ", capacity=" + capacity +
                '}';
    }
}

//        Car

//        it stores how much gas is actually present: gasAmount
//        it stores the capacity of the tank: capacity
//        create a constructor for the Car class where you:
//        initialize gasAmount -> 0
//        initialize capacity -> 100