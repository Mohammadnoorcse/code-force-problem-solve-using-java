
import java.util.Arrays;
import java.util.Scanner;

public class Wanna {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int a[] = new int[p];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        int q = input.nextInt();
        int b[] = new int[q];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        int c[] = new int[p + q];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        Arrays.sort(c);
        int d = 0;

        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i]== c[j]) {

                    d++;
                }
            }

        }
       

        if (n== c.length-d ) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }

}
