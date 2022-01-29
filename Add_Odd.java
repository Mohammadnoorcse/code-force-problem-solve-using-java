
import java.util.Scanner;

public class Add_Odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a % 2 == 1 && a > b && b % 2 == 0) {
                a = a - b;
                if (a == b) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else if (b % 2 == 1 && b > a && a % 2 == 0) {
                System.out.println(b-a);
            } else {
                if (a == b) {
                    System.out.println(0);
                } else if (a % 2 == 0 && b % 2 == 0) {
                    if (a > b) {
                        System.out.println(a - b);
                    } else {
                        System.out.println(b - a);
                    }
                } else {
                    System.out.println(1);
                }
            }
        }
    }

}
