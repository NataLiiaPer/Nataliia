package TeacherStudents;

import java.util.ArrayList;
import java.util.List;

public class TeacherAndStudents {
    public static void main(String[] args) {
        // interface example

        Info informantStudent = new Student("name", 15);
        Info informantTeacher = new Teacher("name", 15);




        List<Info> people = new ArrayList<>();
        people.add(informantStudent);



        Student student1 = new Student("Bob",25);
        Teacher teacher = new Teacher("John",45);
        teacher.setData("Ann",40);
        teacher.teach(student1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(student1);
        System.out.println(teacher);
        student1.giveAnswer();
        student1.learn();
        student1.question();
        teacher.question();
        teacher.giveAnswer();
    //    student1.outputInfo;

    }
//    public static void outputInfo(Info info){ //parameters should be from interface
//        info.question();
//    }
}
//    Create Student and Teacher classes
//        Student
//    learn() -> prints: the student is actually learning
//    question(teacher) -> calls the teacher's giveAnswer() method

//        Teacher
//        teach(student) -> calls the student's learn() method
//        giveAnswer() -> prints: the teacher is answering a question
//        Instantiate a Student and Teacher object
//        Call the student's question() method and the teacher's teach() method