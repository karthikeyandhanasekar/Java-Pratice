import java.util.Scanner;
public class largestpowernumber {

    static int highestpownum(int start, int end)
    {
        if(start == 0)
        {
            return 0;
        }
        int output =0;
        while(Math.pow(start,output) < end)
        {
            output++;
        }
        return output-1;
    }
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(highestpownum(start,end));
    }
    
}
