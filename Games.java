
import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Input.nextInt();
            b[i] = Input.nextInt();
        }

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c++;
                }
            }

        }
        System.out.println(c);
    }

}
