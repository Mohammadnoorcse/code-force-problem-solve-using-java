
import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 2) {
                b[i] = 0;
            } else if (a[i] % 2 == 0) {
                b[i] = ((a[i] - 1) / 2);
            } else {
                b[i] = ((a[i] / 2));
            }

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
