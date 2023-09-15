package Interfaces;

public class Test {
    public static void main(String[] args) {
      Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
    /*    animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();*/
        Info info1 = new Animal(1); // classes animal and person implement interface info
        Info info2 = new Person("Bob"); //polymorphism
        outputInfo(info1);
        outputInfo(info2); //first way
        info1.showInfo(); //second way
        info2.showInfo(); //we can only call method from interface
        outputInfo(animal1); //third way
        outputInfo(person1);

    }
    public static void outputInfo(Info info){ //parameters should be from interface
        info.showInfo();
    }
}
