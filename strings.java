import java.util.Scanner;
public class strings
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.nextLine());
        //String s = new String("callme Ishmael");
        System.out.println(s);
        System.out.println("Length of String is " + s.length());
        System.out.println("First character of String is " + s.charAt(0));
        System.out.println("Last character of String is " + s.charAt(s.length()-1));
        if((s.indexOf(" ") < 0))
        {
            System.out.println("First word is " + s.substring(0, s.length()));
        }
        else
        {
            System.out.println("First word is " + s.substring(0, s.indexOf(" ")));
        }
    }
}