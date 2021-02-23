public class ustelnum {
    public static void main(String args[])
    {
        String s = new String("1234567890");
        String area = s.substring(0,3);
        String exchange = s.substring(3, 6);
        String number = s.substring(6, s.length());
        System.out.println("Area code is "+ area + " , exchange is " + exchange + " and number is " + number );
        System.out.println("The complete telephone number is (" + area + ")" + exchange + "-" + number);
    }
    
}
