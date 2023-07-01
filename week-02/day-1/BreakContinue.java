public class BreakContinue {
    public static void main(String[]args)
    {
int i =0;
while (true){
    System.out.println(i);// ask mentor to check this code
    i++;
    if(i==5)
    break;
}
        System.out.println("Stop");
    for(int x =0;x<=15;x++)
        {
            if (x%2 == 0){
            continue;
        }
        System.out.println("this is odd number "+x);

    }
}}
