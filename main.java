class feb8
{
static boolean isprime(int num)
{
if (num%2 !=0)
{
return true;
}
else
{
return false;
}
};
static float salary(float num,float bp , float da,float hra, float pf)
{
return (num+bp+da+hra)-pf;
};
public static void main(String args[])
{
System.out.println(isprime(10));
System.out.println(salary(2000,10,20,10,20));
}
}
