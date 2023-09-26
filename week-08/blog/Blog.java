package blog;

import BlogPost.Authors;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    public static void main(String[] args) {
        List<Authors> authors = new ArrayList<>();
        addAuthors(authors);
//        for (Authors a:authors){
//            System.out.println(a);
//        }

        deleteAuthors(2,authors);

    }

    private static void deleteAuthors(int index, List<Authors> aut) {
        if(index<=aut.size()){
        aut.remove(index);
            for (Authors a:aut){
                System.out.println(a);
            }
        }
        if (index>aut.size()){
            System.out.println("please write another index");
        }
    }

    private static void addAuthors(List<Authors> aut) {
        aut.add(new Authors("Bob","1995","AAA","Text1"));
        aut.add(new Authors("John","2000","BBB","Text2"));
        aut.add(new Authors("Mike","2005","CCC","Text3"));

    }


}


//Reuse your BlogPost class
//Create a Blog class which can:
// store a list of BlogPosts
// and has the following methods:
// add(BlogPost) -> adds a BlogPost to the list
// delete(int) -> deletes the BlogPost from the given index

// update(int, BlogPost) -> replaces an item at the given index with a new BlogPost