import java.util.Scanner;
class oddoreven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        oddeven os = new oddeven();
        System.out.println(os.oddoreven1(sc.nextInt()));
    }
}
class oddeven {
    String oddoreven1(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
