package BlogPost;

public class Authors {
    private String authorName;
    private String title;
    private String year;
    private String text;
// это конструктор
    public Authors(String authorName, String year, String title, String text) {
        this.authorName = authorName;
        this.title = title;
        this.year = year;
        this.text = text;
    }
// do we need setter? // yes without it our program won't work
    public void setData(String authorName, String year,String title, String text) {
        this.authorName = authorName;
        this.title = title;
        this.year = year;
        this.text = text;

    }
    public void getInfo(){
        System.out.println(title+" titled by "+authorName+" posted at "
                +year+text);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

//    Create a BlogPost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate (string)
//        Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.

//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.

//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William
//        Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//        When I asked to take his picture outside one of IBM’s New York City offices,
//        he told me that he wasn’t really into the whole organizer profile thing.