package TeacherStudents;

public class Teacher implements Info{
    private String name;
    private int age;


   public Teacher(String name,int age){
       this.age = age;
       this.name = name;
   }
   public void setData(String name,int age){
       this.name = name;
       this.age = age;
   }
    public String getName(){
     return name;
    }
    public int getAge(){
        return age;
    }
       public void question(){
        System.out.println("yes, you can ask any question");
    }
    public void giveAnswer(){
        System.out.println("I am asking a question");
    }
    public void teach(Student student){
        student.learn();
        System.out.println("I am teaching");

    }
    public String toString(){
        return name+" "+ age;
    }
}
