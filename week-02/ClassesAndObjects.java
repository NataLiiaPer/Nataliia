public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Karel");
        person1.speak(); // why the age is zero?
       // person1.name = "Jan"; // first way to set a name
        String s1 = "Jan";
        person1.age = 30;
        person1.speak();
        person1.sayHello();
        person1.setNameAndAge("John", 45);
      //  System.out.println("Me name is "+person1.name+ "I'm"+ person1.age);
        Person person2 = new Person();
        person2.setName(s1); //inside curl brackets can be any String,
        // it doesn't connect with the String userName
        //    person2.name = "Kate";
        person2.age = 25;
        person2.speak();
        person2.sayHello();
        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement1();
        int year2 = person2.calculateYearsToRetirement1();
        System.out.println(year1);
        System.out.println(year2);

       // System.out.println("Me name is "+person2.name+ "I'm"+ person2.age);
    }
}
class Person{
    String name;
    int age;
    void setName(String userName){ // the name of the Strins can be any (userName etc.)
        // String userName exist just inside the scope!!!
        name = userName;
    }
    void setNameAndAge(String userName, int userAge){ // the name of the Strins can be any (userName etc.)
        // String userName exist just inside the scope!!!
        name = userName;
        age = userAge;
    }
    int calculateYearsToRetirement1(){ //first way when we return value
        int yearWhenRetirement = 60;
        int retirement = yearWhenRetirement-age;
        return retirement;

    }
    /* encapsulation??? (problem with fields)
     class is a kinda type of data which we created
    in this example "Person" is a type of data for person1 as well as integer
     class can have data (fields)
    class can have action that it can perform (methods) */
    void calculateYearsToRetirement(){ // second way when we return void
        int yearWhenRetirement = 60;

        System.out.println("Years to retirement "+(yearWhenRetirement-age));
    }
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " I'm " + age);
        }
    }
        void sayHello(){
            System.out.println("Hello");
        }



}