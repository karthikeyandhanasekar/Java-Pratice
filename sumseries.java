import java.util.Scanner;

public class sumseries {
    static int series(int n)
    {
        return (n*(n+1))/2;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of Series is " + series(sc.nextInt()));
    }
    
}
