import java.util.Scanner;
public class primenumber {
    static boolean squarenumornot(int num)
    {
        if ( (Math.sqrt(num) - Math.floor(Math.sqrt(num))) == 0)
        return true;
        else
        return false;

    }
    static boolean isprime(int num)
    {
        if(num <=1)
        {
            return false;
        }
        else if (num ==2)
        {
            return true;
        }
        else if(num%5 == 0)
        {
            return false;
        }
        else if(num%2 == 0)
        {
            return false;
        }
        else if(squarenumornot(num))
        {
            return false;
        }
        return true;
    }
    static void prime(int start,int end)
    {
        
        for(int i=start;i<end;i++)
        {
         if(isprime(i))
         {
             System.out.print(i+ " ");
         }    
        }
    };
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        prime(sc.nextInt(),sc.nextInt());
    }
}