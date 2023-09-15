package Polimorphism;

public class Dog extends Animal {
    @Override // переопределение метода
    public void eat(){
        System.out.println("Dod is eating");}
    public void bark(){
        System.out.println("Dog is barking");
    }
}
