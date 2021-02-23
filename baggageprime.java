
class baggageprime
{
    int baggageprime(int x)
    {
    return (x*x) + x+41;
    }

    public static void main(String args[])
    {
        baggageprime bp = new baggageprime();
        for(int i=0;i<10000;i++)
        {
            int n = bp.baggageprime(i);
            if ( n<= 100)
            {
            System.out.println(n + " is prime");
            }
        }
    }

}