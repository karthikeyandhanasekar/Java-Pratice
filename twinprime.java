import java.util.Scanner;
public class twinprime {
     boolean isodd(int num)
    {
      if(num%2 ==0)
      {
          return false;
      }
      else
      {
          return true;
      }
    }

    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        twinprime tp = new twinprime();
        int count =0;
        for(int i=3;i<=31;i++)
        {
            if(tp.isodd(i))
            {
                count++;
                if(count ==2)
                {
                    count=0;
                    System.out.println();
                }
                 System.out.print(i + " ");

            }
        }
        
    }
}