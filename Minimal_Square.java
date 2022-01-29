
import java.util.Scanner;

public class Minimal_Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {

            int a = input.nextInt();
            int b = input.nextInt();
            if (a >= b * 2) {
                System.out.println(a * a);
            } else if (b >= a * 2) {
                System.out.println(b * b);
            } else if (a >= b) {
                System.out.println(b * b * 4);
            } else if (b >= a) {
                System.out.println(a * a * 4);
            }

        }

    }

}
