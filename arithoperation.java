import java.util.Scanner;

class arithoperation {
    public static void main(String args[]) {
        int num;
        do{
            Scanner sc = new Scanner(System.in);
             num = sc.nextInt();
        switch(num)
        {
            case 1:
            System.out.println(10+20);
            break;
            case 2:
            System.out.println(10-20);
            break;
            case 3:
            System.out.println(10*20);
            case 4:
            System.out.println(10/20);
            break;
            default:
            System.out.println("Thank you");
        }
    }while(num != 0);
}
}

