public class PostIt {
    public static void main(String[] args) {
        NewObject object1 = new NewObject("orange", "Idea 1", "blue");
      object1.setData("orange", "Idea 1", "blue");
        object1.getInfo();
        NewObject object2 = new NewObject("pink", "Awesome", "black");
      object2.setData("pink", "Awesome", "black");
        object2.getInfo();
        NewObject object3 = new NewObject("yellow", "Superb!", "green");
       object3.setData("yellow", "Superb!", "green");
        object3.getInfo();

    }
}

class NewObject {
    private String backgroundColor; //private - key word. fields available only in this class
    private String text;
    private String textColor;
    public NewObject(String backgroundColor, String text, String textColor) {
        // constructor, method overloading
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
//for what we need this setter?
    public void setData(String backgroundColor, String text, String textColor) {
        //this is setter. Do I always need getter? Can I add sout in this method?
        //can I set few variable in one method?
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }

    public void getInfo() {
        System.out.println("backgroundColor " + backgroundColor +
                " text " + text + " textColor " + textColor);
    }
//    private String getData(String backgroundColor, String text, String textColor) {
//        return backgroundColor + text + textColor;
//    }
}

   /* Create a PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/

// way 2

//public class PostIt {
//    private String backgroundColor;
//    private String text;
//    private String textColor;
//
//    public PostIt(String backgroundColor, String text, String textColor) {
//        this.backgroundColor = backgroundColor;
//        this.text = text;
//        this.textColor = textColor;
//    }
//
//    public void display() {
//        System.out.println("Background color: " + backgroundColor);
//        System.out.println("Text: " + text);
//        System.out.println("Text color: " + textColor);
//        System.out.println();
//    }

//    public static void main(String[] args) {
//        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
//        PostIt postIt2 = new PostIt("pink", "Awesome", "black");
//        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");
//
//        System.out.println("Post-it 1:");
//        postIt1.display();
//
//        System.out.println("Post-it 2:");
//        postIt2.display();
//
//        System.out.println("Post-it 3:");
//        postIt3.display();
//    }
//}
