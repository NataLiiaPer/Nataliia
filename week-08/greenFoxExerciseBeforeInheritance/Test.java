package greenFoxExerciseBeforeInheritance;

public class Test {
    public static void main(String[] args) {
        int numberOfDays = 5;
        Person person = new Person();
   //    person.addSomebody();
        System.out.println(person);
        Person person1 = new Student();//please explain one more time what we will have for this
     //   person1.addSomebody();
        person1.getGoal();
        System.out.println(person1); //how to get constructor from class student?
        Student student = new Student();
        System.out.println(student);//how to get constructor from class student?
        student.skipDays(numberOfDays);
        student.introduce();
        Mentor mentor = new Mentor();
        mentor.introduce();
    }
}

