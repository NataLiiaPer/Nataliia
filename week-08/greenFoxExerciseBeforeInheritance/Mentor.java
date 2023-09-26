package greenFoxExerciseBeforeInheritance;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Person{
    private List<Mentor > mentors= new ArrayList<>();
    private enum Level{
        JUNIOR,
        INTERMEDIATE,
        SENIOR
    }
 private   Level level;

    public Mentor(String name, int age, Gender gender, Level level) {
        super(name, age, gender);
     this.level = level;
    }

    public Mentor() {
      this.name = "Jane Doe";
      this.age = 40;
      this.gender =  Gender.FEMALE;
        this.level = Level.INTERMEDIATE;
    }

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println("Hi, I'm "+ name+", a "+ age+" year old "+ gender+" "+ level+" mentor.");
    }

}

//    Create a Mentor class that has the same fields and methods as the Person
//class, and has the following additional
//
//        fields:
//        level: the level of the mentor (junior / intermediate / senior)
//        methods:
//        getGoal(): prints out "Educate brilliant junior software developers."
//        introduce(): "Hi, I'm name, a age year old gender level mentor."
//        The Mentor class has the following constructors:
//
//        Mentor(name, age, gender, level)
//        Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
