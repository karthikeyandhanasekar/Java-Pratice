import java.util.Scanner;

public class armstrongnumber {
    static boolean armstrongornot(int num)
    {
        int remainder;
        int noofdigit=0;
        int output=0;
        int temp = num;
        while(temp!=0)
        {
            temp/=10;
            ++noofdigit;
        }
        temp = num;
        while(temp!=0)
        {
            remainder = temp%10;
            output+= Math.pow(remainder,noofdigit);
            temp/=10;
        }
        if(num == output)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       if(armstrongornot(sc.nextInt()))
       {
           System.out.println("It Armstrong Number");
       }
       else
       {
        System.out.println("It not an Armstrong Number");
   
       }

    }
}
