import java.util.Scanner;
public class factorial {
    static int factor(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
          res*=i;
        }
        return res;
    };
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Factorial is " + factor(sc.nextInt()));
    }

}
