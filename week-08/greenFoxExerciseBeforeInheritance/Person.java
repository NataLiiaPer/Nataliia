package greenFoxExerciseBeforeInheritance;

public class Person {
    public  enum Gender{
        MALE,
        FEMALE
    }
    String name;
    int age;
    Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person() {
        this("Jane Doe",30,Gender.FEMALE);
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void introduce(){
        System.out.println("Hi, I'm "+ name+", a "+ age+" year old "+gender+" .");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

//    Create a Person class with the following fields:
//
//        name: the name of the person
//        age: the age of the person (whole number)
//        gender: the gender of the person (male / female)
//        And the following methods:
//
//        introduce(): prints out "Hi, I'm name, a age year old gender."
//        getGoal(): prints out "My goal is: Live for the moment!"
//        And the following constructors:
//
//        Person(name, age, gender)
//        Person(): sets name to Jane Doe, age to 30, gender to female