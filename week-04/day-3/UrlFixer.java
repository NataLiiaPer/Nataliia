public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String sburl = "https//www.reddit.com/r/nevertellmethebots";
        StringBuilder sb = new StringBuilder(sburl);
        sb.insert(5,":");
        sb.delete(39,43);
        sb.insert(39,"odds");
        System.out.println(sb);
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!
    }
}

