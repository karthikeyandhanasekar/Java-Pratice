class feb8
{
static boolean isprime(int num)
{
for(int i=2;i<num;i++)
{
if (num%i == 0)
{
return false;
}
}
return true;
};
static float salary(float num,float bp , float da,float hra, float pf)
{
return (num+bp+da+hra)-pf;
};
public static void main(String args[])
{
System.out.println(isprime(11));
System.out.println(salary(2000,10,20,10,20));
}
}
