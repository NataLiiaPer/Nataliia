public class FiveTrees {
    public static void main(String[] args) {
        Trees treeOne = new Trees();
        treeOne.type = "One";
        treeOne.color = "black";
        treeOne.age = 5;
        treeOne.sex = "male";
        System.out.println("this is the tree "+treeOne.type+", the color is "
                +treeOne.color+",the age "+treeOne.age+",the sex "+treeOne.sex);
        Trees treeTwo = new Trees();
        treeOne.type = "Two";
        treeOne.color = "red";
        treeOne.age = 10;
        treeOne.sex = "male";
        System.out.println("this is the tree "+treeOne.type+", the color is "
                +treeOne.color+",the age "+treeOne.age+",the sex "+treeOne.sex);
        Trees treeThree = new Trees();
        treeOne.type = "Three";
        treeOne.color = "orange";
        treeOne.age = 10;
        treeOne.sex = "male";
        System.out.println("this is the tree "+treeOne.type+", the color is "
                +treeOne.color+",the age "+treeOne.age+",the sex "+treeOne.sex);
        Trees treeFour = new Trees();
        treeOne.type = "Four";
        treeOne.color = "green";
        treeOne.age = 10;
        treeOne.sex = "male";
        System.out.println("this is the tree "+treeOne.type+", the color is "
                +treeOne.color+",the age "+treeOne.age+",the sex "+treeOne.sex);
        Trees treeFive = new Trees();
        treeOne.type = "Five";
        treeOne.color = "blue";
        treeOne.age = 10;
        treeOne.sex = "male";
        System.out.println("this is the tree "+treeOne.type+", the color is "
                +treeOne.color+",the age "+treeOne.age+",the sex "+treeOne.sex);

    }

}
class Trees{
    String type;
    String color;
    int age;
    String sex;
}

/*Create 5 trees
        Store the data of them in variables in your program
        for every tree the program should store its'
        type
        leaf color
        age
        sex*/