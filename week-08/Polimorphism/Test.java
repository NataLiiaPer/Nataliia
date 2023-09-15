package Polimorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
       Dog dog = new Dog();
       Cat cat = new Cat();
       cat.eat();
       test(cat);
       test(dog);
       /*   animal.eat();
        dog.eat(); //this object has method eat because it extends it by Animal class*/

    /*Animal animal = new Dog(); //we can do this because of extends //upcasting -восходящее преобр-е
        класс Dod наследуется от класса Animal
        // здесь мы рассматриваем собаку как животное

        animal.eat();
        //animal.bark  // we can't do this!!! этот метод только у собаки
        Dog dog = new Dog(); //здесь мы рассматриваем собаку как собаку
        dog.eat();
        dog.bark();//мы имеем доступ к методам, определенным в родителе*/
        test(animal);
        test(dog);

    }
    public static void test(Animal animal){
        animal.eat();
    }
}
