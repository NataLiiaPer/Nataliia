package Enum;

 public enum CarType {
        ELEMENT1("Car 1",2),
        ELEMENT2("Car 2",2),
        ELEMENT3("Car 3",7),
        ELEMENT4("Car 4",2),
        ELEMENT5("Car 5",2);

        private final String car;
        private int coolPoints;

    CarType (String car, int coolPoints) {
            this.car = car;
            this.coolPoints = coolPoints;
        }

        public String getCarName() {
            return car;
        }
        public int getCoolPoints(){return coolPoints;}
    }


