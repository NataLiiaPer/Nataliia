public class StringRecursion {
    public static void main(String[] args) {
        String str = "abcd";
        pritRev(str,str.length()-1);

    }
    public static void pritRev(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return ;
        }
        System.out.println(str.charAt(idx));
        pritRev(str,idx-1);
    }
}

// Given a string, write a recursive (no loops) method which returns
// a new string with the reverse order of chars.