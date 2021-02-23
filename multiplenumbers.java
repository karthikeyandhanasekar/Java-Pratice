import java.util.Scanner;

class multiplenumbers
{
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ; i<=num  ; i++)
        {
            if ( i% 3 == 0 )
            {
                System.out.println(i);
            }
            else if(i%5 == 0)
            {
                                System.out.println(i);

            }
            else if (i%7 == 0 )
            {
                                System.out.println(i);


            }
            else if( i%9 == 0)
            {
                System.out.println(i);

            }
            else if ( i%11 == 0)
            {
            System.out.println(i);

            }
        }
    }

}