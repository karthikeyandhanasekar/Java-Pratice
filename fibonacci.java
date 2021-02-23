import java.util.Scanner;
class fibonacci
{
    void fibonaccinumber(int n)
    {
        int a=2,b=3,c;
        System.out.println(a + " " + b);
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        fibonacci fb = new fibonacci();
        fb.fibonaccinumber(sc.nextInt());
      
    }
}