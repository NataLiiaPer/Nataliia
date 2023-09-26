package greenFoxExerciseBeforeInheritance;

import java.util.ArrayList;
import java.util.List;

public class Sponsor extends Person {
    private List<Sponsor > sponsors= new ArrayList<>();
    String company;
    int hiredStudents=0;

    public Sponsor(String name, int age, Gender gender, String company, int hiredStudents) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;
    }
    public Sponsor(){
        this.name = "Jane Doe";
        this.age  = 50;
        this.gender = Gender.FEMALE;
        this.company =  "Google";
        this.hiredStudents = 0;
    }


    public void introduce(){
        System.out.println("Hi, I'm "+ name+", a "+age+" year old "+gender+" who represents "+company+" and hired "
       +hiredStudents+ " students so far.");
    }
    public void hire(Student s){
        hiredStudents++;
    }
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");

    }

}
//    Create a Sponsor class that has the same fields and methods as the Person class,
//        and has the following additional
//
//        fields:
//        company: name of the company
//        hiredStudents: number of students hired
//        method:
//        introduce(): "Hi, I'm name, a age year old gender who represents company and hired" +
//        " hiredStudents students so far."
//        hire(): increase hiredStudents by 1
//        getGoal(): prints out "Hire brilliant junior software developers."
//        The Sponsor class has the following constructors:
//
//        Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//        Sponsor(): sets name to Jane Doe, age to 30, gender to female,
//        company to Google and hiredStudents to 0