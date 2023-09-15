package TeacherStudents;

public class Student implements Info{
    String name;
    private int age;
    public Student(String name, int age){ //constructor
        this.name = name;
        this.age = age;
    }
    public void giveAnswer(){
        System.out.println("I now the answer");
    }

    public void learn(){
        System.out.println("I am learning");
    }
      public void question(){
          System.out.println("Can I ask a question?");
}
    public String toString(){
        return name+" "+ age;
    }

}
