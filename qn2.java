import java.util.Scanner;
class qn2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        switch(sc.nextInt())
        {
            case 10:
            System.out.println("Number is 10");
            break;
            case 20:
            System.out.println("Number is 20");
            break;
            case 30:
            System.out.println("Number is 30");
            break;
            default:
            System.out.println("Better Luck Next Time");
        }
        
    }
}