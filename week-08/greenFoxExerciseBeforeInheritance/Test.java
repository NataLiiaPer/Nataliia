package greenFoxExerciseBeforeInheritance;

public class Test {
    public static void main(String[] args) {
        int numberOfDays = 5;
        Student student = new Student();
       // Person person1 = new Student();//please explain one more time what we will have for this
        student.addSomebody(new Student("Bob",20, Person.Gender.MALE,"AAA"));
        //how to print it??? //
        System.out.println(student);
        student.skipDays(numberOfDays);
        student.introduce();
        student.getGoal();

        Person person = new Person();
        System.out.println(person); //how to get constructor from class student?
        person.getGoal();
        person.introduce();


        Mentor mentor = new Mentor();
        System.out.println(mentor);
        mentor.introduce();
        mentor.getGoal();

        Sponsor sponsor = new Sponsor();
        System.out.println(sponsor);
        sponsor.hire(student);
        sponsor.introduce();
        sponsor.getGoal();

    }
}

