public class palindromic {

    boolean isprime(int n)
{
boolean primenum = true;
 
if(n <= 1) 
{
primenum = false;
return primenum;
}
else
{
for (int i = 2; i<= n/2; i++) 
{
if ((n % i) == 0)
{
primenum = false;
break;
}
}
 
return primenum;
}
}
    boolean ispalindromic(int num)
    {
        int sum=0,remainder =0,temp;
        temp=num;
        while(num>0)
        {
            remainder= num%10;
            sum= (sum*10) + remainder;
            num/=10;
        }
        if(temp == sum)
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

        palindromic p= new palindromic();
        for(int i=2;i<1000;i++)
        {
            if(p.isprime(i) && p.ispalindromic(i))
            {
                System.out.print(i+" ");

            }
        }
        
    }
    
}
