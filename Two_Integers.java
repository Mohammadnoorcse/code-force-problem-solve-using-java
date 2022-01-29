
import java.util.Scanner;

public class Two_Integers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            int f = input.nextInt();
            int l = input.nextInt();
            if (l > f) {
                int n = l - f;

                int sum = 0;
                int k = n / 10;
                sum = sum + k;
                n = n - k * 10;

                k = n / 9;
                sum = sum + k;
                n = n - k * 9;

                k = n / 8;
                sum = sum + k;
                n = n - k * 8;
                k = n / 7;
                sum = sum + k;
                n = n - k * 7;
                k = n / 6;
                sum = sum + k;
                n = n - k * 6;
                k = n / 5;
                sum = sum + k;
                n = n - k * 5;
                k = n / 4;
                sum = sum + k;
                n = n - k * 4;
                k = n / 3;
                sum = sum + k;
                n = n - k * 3;
                k = n / 2;
                sum = sum + k;
                n = n - k * 2;
                sum = sum + n;
                System.out.println(sum);
            } else if (f > l) {
                int n = f - l;

                int sum = 0;
                int k = n / 10;
                sum = sum + k;
                n = n - k * 10;

                k = n / 9;
                sum = sum + k;
                n = n - k * 9;

                k = n / 8;
                sum = sum + k;
                n = n - k * 8;
                k = n / 7;
                sum = sum + k;
                n = n - k * 7;
                k = n / 6;
                sum = sum + k;
                n = n - k * 6;
                k = n / 5;
                sum = sum + k;
                n = n - k * 5;
                k = n / 4;
                sum = sum + k;
                n = n - k * 4;
                k = n / 3;
                sum = sum + k;
                n = n - k * 3;
                k = n / 2;
                sum = sum + k;
                n = n - k * 2;
                sum = sum + n;
                System.out.println(sum);
            } else {
                System.out.println(0);
            }

        }

    }
}
